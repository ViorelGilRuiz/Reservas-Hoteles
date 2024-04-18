/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package Vistas;

import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Salones;

public class ReservaSalones extends java.awt.Dialog {

    public ReservaSalones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoLocalidad = new javax.swing.JTextField();
        comprobarDNI = new javax.swing.JButton();
        campoDNI = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        codigoPostal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fechaEntrada = new com.toedter.calendar.JDateChooser();
        Catering = new javax.swing.JComboBox<>();
        numeroPersonas = new javax.swing.JTextField();
        detalleFactura = new javax.swing.JPanel();
        botonGenerarFactura = new javax.swing.JButton();
        botonNuevaReserva = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Registro de Salones");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 150, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DNI");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, -1));

        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, -1));

        jLabel3.setText("Apellidos");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setText("Telefono");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setText("Email");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, -1));

        jLabel6.setText("Direccion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel7.setText("CP");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 20, -1));

        jLabel8.setText("Localidad");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        campoLocalidad.setName("Localidad"); // NOI18N
        campoLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLocalidadActionPerformed(evt);
            }
        });
        jPanel2.add(campoLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 100, 20));

        comprobarDNI.setBackground(new java.awt.Color(255, 153, 0));
        comprobarDNI.setForeground(new java.awt.Color(255, 255, 255));
        comprobarDNI.setText("Comprobar DNI");
        jPanel2.add(comprobarDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 120, -1));

        campoDNI.setName("DNI"); // NOI18N
        campoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDNIActionPerformed(evt);
            }
        });
        jPanel2.add(campoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 20));

        campoNombre.setName("Nombre"); // NOI18N
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        jPanel2.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 100, 20));

        campoApellidos.setName("Apellidos"); // NOI18N
        campoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidosActionPerformed(evt);
            }
        });
        jPanel2.add(campoApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 20));

        campoTelefono.setName("Telefono"); // NOI18N
        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, 20));

        campoEmail.setName("Email"); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        jPanel2.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 100, 20));

        campoDireccion.setName("Direccion"); // NOI18N
        campoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDireccionActionPerformed(evt);
            }
        });
        jPanel2.add(campoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 100, 20));

        codigoPostal.setName("Codigo Postal"); // NOI18N
        codigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoPostalActionPerformed(evt);
            }
        });
        jPanel2.add(codigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la reserva"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Fecha");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, -1));

        jLabel10.setText("N� De Personas");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel11.setText("Catering");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, -1));

        fechaEntrada.setName("Fecha"); // NOI18N
        jPanel3.add(fechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, 20));

        Catering.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jPanel3.add(Catering, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        numeroPersonas.setName("Numero de Personas"); // NOI18N
        jPanel3.add(numeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 90, -1));

        detalleFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la ultima reserva registrada"));

        botonGenerarFactura.setText("Generar Factura");
        botonGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarFacturaActionPerformed(evt);
            }
        });

        botonNuevaReserva.setText("Nueva Reserva ");
        botonNuevaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(botonNuevaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(detalleFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(detalleFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevaReserva)
                    .addComponent(botonGenerarFactura))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void botonGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGenerarFacturaActionPerformed

    private void campoLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLocalidadActionPerformed

    private void campoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDNIActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidosActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDireccionActionPerformed

    private void codigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoPostalActionPerformed

    private void botonNuevaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaReservaActionPerformed
        registrar();
    }//GEN-LAST:event_botonNuevaReservaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReservaSalones dialog = new ReservaSalones(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Catering;
    private javax.swing.JButton botonGenerarFactura;
    private javax.swing.JButton botonNuevaReserva;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLocalidad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField codigoPostal;
    private javax.swing.JButton comprobarDNI;
    private javax.swing.JPanel detalleFactura;
    private com.toedter.calendar.JDateChooser fechaEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField numeroPersonas;
    // End of variables declaration//GEN-END:variables

    String dni, nom, ape, ema, dire, loca, cat;
    int tel, cod, numP;
    Date fecha;

    public void registrar() {
        if (Utilidades.Utilidades.campoVacio(campoDNI)) {
            Utilidades.Utilidades.lanzaAlertaCampoVacio(campoDNI);
        } else if (Utilidades.Utilidades.campoVacio(campoNombre)) {
            Utilidades.Utilidades.lanzaAlertaCampoVacio(campoNombre);
        } else if (Utilidades.Utilidades.lanzaAlertaCampoVacio(campoApellidos)) {
            Utilidades.Utilidades.lanzaAlertaCampoVacio(campoApellidos);
        } else if (Utilidades.Utilidades.rangotel(tel)) {
            Utilidades.Utilidades.LazarAlertaCampoNumerico(this, campoTelefono);
        } else if (Utilidades.Utilidades.campoVacio(campoEmail)) {
            Utilidades.Utilidades.lanzaAlertaCampoVacio(campoEmail);
        } else if (Utilidades.Utilidades.campoVacio(campoDireccion)) {
            Utilidades.Utilidades.lanzaAlertaCampoVacio(campoDireccion);
        } else if (Utilidades.Utilidades.campoVacio(codigoPostal)) {
            Utilidades.Utilidades.LazarAlertaCampoNumerico(this, codigoPostal);
        } else if (Utilidades.Utilidades.campoVacio(campoLocalidad)) {
            Utilidades.Utilidades.lanzaAlertaCampoVacio(campoLocalidad);
        } else if (fechaEntrada.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debes introducir una fecha de entrada por favor ");
        } else if (!Utilidades.Utilidades.enteroCorrecto(numeroPersonas)) {
            Utilidades.Utilidades.LazarAlertaCampoNumerico(this, numeroPersonas);
        } else if (Utilidades.Utilidades.comboNoSeleccionado (Catering)) {
        Utilidades.Utilidades.alertaComboNoSeleccionado(this, Catering);
         } else {
            
        dni = campoDNI.getText();
        nom = campoNombre.getText();
        ape = campoApellidos.getText();
        tel = Integer.parseInt(campoTelefono.getText());
        ema = campoEmail.getText();
        dire = campoDireccion.getText();
        cod = Integer.parseInt(codigoPostal.getText());
        loca = campoLocalidad.getText();
        fecha = fechaEntrada.getDate();
        numP = Integer.parseInt(numeroPersonas.getText());
        cat = (String) Catering.getSelectedItem();

        Salones sa = new Salones (ERROR, dni, ema, PROPERTIES, cat, ERROR, dni);

    }

}
}

