/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd;

import static bbdd.Conexion.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Habitaciones;

public class ConsultaHabitaciones {

    public int calculaNumeroDias(Date entrada, Date salida) {
        int numNoches;

        long fechaDeEntrada = entrada.getTime();
        long fechaDeSalida = salida.getTime();
        long diferencia = fechaDeSalida - fechaDeEntrada;
        numNoches = (int) Math.floor(diferencia / 86400000);

        return numNoches;
    }

    public static boolean comprobarDni(String campo) {

        try {
            String consulta = "SELECT dni from cliente where dni=?";

            PreparedStatement pst = conn.prepareStatement(consulta);
            ResultSet rs;

            pst.setString(1, campo);

            rs = pst.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean registrarCliente(Cliente c) {

        try {
            String consulta = "INSERT INTO cliente (dni, nombre, apellidos, telefono, email, direccion, codPostal, localidad)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(consulta);
            pst.setString(1, c.getDNI());
            pst.setString(2, c.getNombre());
            pst.setString(3, c.getApellidos());
            pst.setInt(4, c.getTelefono());
            pst.setString(5, c.getEmail());
            pst.setString(6, c.getDireccion());
            pst.setInt(7, c.getCodigoPostal());
            pst.setString(8, c.getLocaliidad());

            pst.execute();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void listaReservasHabi(DefaultTableModel modelo) {
        try {
            Object[] datos = new Object[7];
            String consulta = "SELECT idReserva, dni, fechaEntrada, fechaSalida, tipoHabitacion, noches, precioTotal from "
                    + "reserva_habitaciones where fechaEntrada>= CURRENT_DATE()";

            ResultSet rs = conn.createStatement().executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("idReserva");
                datos[1] = rs.getString("dni");
                datos[2] = rs.getString("fechaEntrada");
                datos[3] = rs.getString("fechaSalida");
                datos[4] = rs.getString("tipoHabitacion");
                datos[5] = rs.getString("noches");
                datos[6] = rs.getString("precioTotal");

                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listaReservasHistorico(DefaultTableModel modelo) {
        try {
            Object[] datos = new Object[7];
            String consulta = "SELECT idReserva, dni, fechaEntrada, fechaSalida, tipoHabitacion, noches, precioTotal from "
                    + "reserva_habitaciones where fechaEntrada < CURRENT_DATE()";

            ResultSet rs = conn.createStatement().executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("idReserva");
                datos[1] = rs.getString("dni");
                datos[2] = rs.getString("fechaEntrada");
                datos[3] = rs.getString("fechaSalida");
                datos[4] = rs.getString("tipoHabitacion");
                datos[5] = rs.getString("noches");
                datos[6] = rs.getString("precioTotal");

                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listaReservasFecha(DefaultTableModel modelo, String fecha) {
        try {
            Object[] datos = new Object[7];

            String consulta = "SELECT idReserva, dni, fechaEntrada, fechaSalida, tipoHabitacion, noches, precioTotal from "
                    + "reserva_habitaciones where fechaEntrada='" + fecha + "'";

            ResultSet rs = conn.createStatement().executeQuery(consulta);

            while (rs.next()) {
                datos[0] = rs.getString("idReserva");
                datos[1] = rs.getString("dni");
                datos[2] = rs.getString("fechaEntrada");
                datos[3] = rs.getString("fechaSalida");
                datos[4] = rs.getString("tipoHabitacion");
                datos[5] = rs.getString("noches");
                datos[6] = rs.getString("precioTotal");

                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean registrarHabitacion(Habitaciones h) {

        try {
            String consulta = "INSERT INTO reserva_habitaciones (dni, fechaEntrada, fechaSalida, "
                    + "tipoHabitacion, noches, precioTotal, dniEmpleado)"
                    + "values (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(consulta);

            pst.setString(1, h.getDniCliente());
            pst.setDate(2, new java.sql.Date(h.getFechaentrada().getTime()));
            pst.setDate(3, new java.sql.Date(h.getFechasalida().getTime()));
            pst.setString(4, h.getTipohabitacion());
            pst.setInt(5, h.getNoches());
            pst.setDouble(6, h.getPreciototal());
            pst.setString(7, h.getDniEmpleado());

            pst.execute();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
