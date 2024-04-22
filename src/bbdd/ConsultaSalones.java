/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd;

import static bbdd.Conexion.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Salones;

/**
 *
 * @author liddi
 */
public class ConsultaSalones {

    public static boolean registrarSalones(Salones s) {

        try {
            String consulta = "INSERT INTO reserva_salones (dni, fecha, numPersonas, "
                    + "catering, precioTotal, dniEmpleado)"
                    + "values (?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(consulta);

            pst.setString(1, s.getDniCliente());
            pst.setDate(2, new java.sql.Date(s.getFecha().getTime()));
            pst.setInt(3, s.getNumPersonas());
            pst.setString(4, s.getCatering());
            pst.setDouble(5, s.getPrecio());
            pst.setString(6, s.getDniEmpleado());

            pst.execute();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static void listaReservasSalones(DefaultTableModel modelo) {
        try {
            Object[] datos = new Object[7];
            String consulta = "SELECT idReserva, dni, fecha, numPersonas, catering, precioTotal, dniEmpleado from "
                    + "reserva_salones where fecha>= CURRENT_DATE()";

            ResultSet rs = conn.createStatement().executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("idReserva");
                datos[1] = rs.getString("dni");
                datos[2] = rs.getString("fecha");
                datos[3] = rs.getString("numPersonas");
                datos[4] = rs.getString("catering");
                datos[5] = rs.getString("precioTotal");
                datos[6] = rs.getString("dniEmpleado");

                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listaReservasFecha(DefaultTableModel modelo, String fecha) {
        try {
            Object[] datos = new Object[7];

            String consulta = "SELECT idReserva, dni, fecha, numPersonas, catering, precioTotal, dniEmpleado from "
                    + "reserva_habitaciones where fecha='" + fecha + "'";

            ResultSet rs = conn.createStatement().executeQuery(consulta);

            while (rs.next()) {
                datos[0] = rs.getString("idReserva");
                datos[1] = rs.getString("dni");
                datos[2] = rs.getString("fecha");
                datos[3] = rs.getString("numPersonas");
                datos[4] = rs.getString("catering");
                datos[5] = rs.getString("precioTotal");
                datos[6] = rs.getString("dniEmpleado");

                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void listaReservasHistorico(DefaultTableModel modelo) {
        try {
            Object[] datos = new Object[7];
            String consulta = "SELECT idReserva, dni, fecha, numPersonas, catering, precioTotal, dniEmpleado from "
                    + "reserva_salones where fecha < CURRENT_DATE()";

            ResultSet rs = conn.createStatement().executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("idReserva");
                datos[1] = rs.getString("dni");
                datos[2] = rs.getString("fecha");
                datos[3] = rs.getString("numPersonas");
                datos[4] = rs.getString("catering");
                datos[5] = rs.getString("precioTotal");
                datos[6] = rs.getString("dniEmpleado");

                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void listaReservasSalon(DefaultTableModel modelo) {
        try {
            Object[] datos = new Object[7];
            String consulta = "SELECT idReserva, dni, fecha, numPersonas, catering, precioTotal, dniEmpleado from "
                    + "reserva_salones where fecha>= CURRENT_DATE()";

            ResultSet rs = conn.createStatement().executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("idReserva");
                datos[1] = rs.getString("dni");
                datos[2] = rs.getString("fecha");
                datos[3] = rs.getString("numPersonas");
                datos[4] = rs.getString("catering");
                datos[5] = rs.getString("precioTotal");
                datos[6] = rs.getString("dniEmpleado");

                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
