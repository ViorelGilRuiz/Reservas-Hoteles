package bbdd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;

public class ConsultasEmpleados extends Conexion {

    public static boolean acceder(String user, String pass) {

        String SSQL = "SELECT usuario, contraseña FROM empleados WHERE usuario =? AND contraseña =?";

        PreparedStatement pst;
        ResultSet rs;

        try {

            pst = conn.prepareStatement(SSQL);
            pst.setString(1, user);
            pst.setString(2, pass);
            rs = pst.executeQuery();

            return rs.next();

        } catch (SQLException ex) {

            Logger.getLogger(ConsultasEmpleados.class.getName()).log(Level.SEVERE, null, ex);

        }

        return false;
    }

    public static String[] recuperaDatosUser(String user) {
        String[] usuario = new String[2];

        String consultaRecuperaTipo = "SELECT CONCAT(nombre, ' ', apellidos), dniEmpleado FROM empleados WHERE usuario='" + user + "'";

        try {
            Statement st = conn.createStatement();
            try (ResultSet rs = st.executeQuery(consultaRecuperaTipo)) {
                if (rs.next()) {
                    usuario[0] = rs.getString(1);
                    usuario[1] = rs.getString(2);
                }
            }

        } catch (SQLException ex) {

            Logger.getLogger(ConsultasEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuario;
    }

    public static boolean compruebaUser(String user) {

        String consultaComprueba = "SELECT usuario FROM empleados WHERE usuario='" + user + "'";
        ResultSet rs = null;

        try {

            Statement st = conn.createStatement();
            rs = st.executeQuery(consultaComprueba);

            return rs.next();

        } catch (SQLException ex) {

            Logger.getLogger(ConsultasEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public static boolean compruebaDni(String dni) {

        String consultaComprueba = "SELECT dniEmpleado FROM empleados WHERE dniEmpleado='" + dni + "'";

        ResultSet rs = null;

        try {
            Conexion.conectar();

            Statement st = conn.createStatement();
            rs = st.executeQuery(consultaComprueba);

            return rs.next();

        } catch (SQLException ex) {

            Logger.getLogger(ConsultasEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    public static boolean registrarEmpleado(Empleado e) {

        String consultaInsert = "INSERT INTO empleados (dniEmpleado, nombre, apellidos, telefono, email, fechaContrato, turno, usuario, contraseña) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement st = conn.prepareStatement(consultaInsert);
            
            st.setString(1, e.getDniEmpleado());
            st.setString(2, e.getNombre());
            st.setString(3, e.getApellidos());
            st.setLong(4, e.getTelefono());
            st.setString(5, e.getEmail());
            st.setDate(6, new java.sql.Date(e.getFechaContrato().getTime())); //Importante para evitar problemas con la base de datos
            st.setString(7, e.getTurno());            
            st.setString(8, e.getUsuario());
            st.setString(9, e.getContrasenya());
            st.execute();

            return true;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return false;
    }

    public static void cargaTablaEmpleados(DefaultTableModel modelo) {

        Object[] datos = new Object[6];

        String consulta = "SELECT dniEmpleado, nombre, apellidos, telefono, email, turno FROM empleados";

        try {
            ResultSet rs = conn.createStatement().executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("dniEmpleado");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellidos");
                datos[3] = rs.getInt("telefono");
                datos[4] = rs.getString("email");
                datos[5] = rs.getString("turno");

                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void cargaTablaEmpleadosPorTurno(DefaultTableModel modelo, String turno) {

        Object[] datos = new Object[6];

        String consulta = "SELECT dniEmpleado, nombre, apellidos, telefono, email, turno FROM empleados WHERE turno ='" + turno + "'";

        try {
            ResultSet rs = conn.createStatement().executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("dniEmpleado");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellidos");
                datos[3] = rs.getInt("telefono");
                datos[4] = rs.getString("email");
                datos[5] = rs.getString("turno");

                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
