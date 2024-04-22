/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd;

import static bbdd.Conexion.conn;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;

public class ConsultaClientes {

    public static Cliente recuperaDatosCliente(String dni) {

        String consultaRecuperaTipo = "SELECT dniCliente, nombre, apellidos,telefono,email, direccion, cp, localidad "
                + "from clientes where dniCliente='" + dni + "'";

        Cliente c = null;

        try {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(consultaRecuperaTipo);

            if (rs.next()) {
                c = new Cliente(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getInt("telefono"),
                        rs.getString("email"),
                        rs.getString("direccion"),
                        rs.getInt("codPostal"),
                        rs.getString("localidad")
                );
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
