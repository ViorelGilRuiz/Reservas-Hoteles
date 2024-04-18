/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

public class Empleado {

    public Empleado(String dniEmpleado, String nombre, String apellidos, int telefono, String email, Date fechaContrato, String turno, String usuario, String contrasenya) {
        this.dniEmpleado = dniEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.fechaContrato = fechaContrato;
        this.turno = turno;
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }

    public String getDniEmpleado() {
        return dniEmpleado;
    }

    public void setDniEmpleado(String dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dniEmpleado=" + dniEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email + ", fechaContrato=" + fechaContrato + ", turno=" + turno + ", usuario=" + usuario + ", contrasenya=" + contrasenya + '}';
    }
   
    String dniEmpleado;
    String nombre;
    String apellidos;
    int telefono;
    String email;
    Date fechaContrato;
    String turno;    
    String usuario;
    String contrasenya;
    
    
}
