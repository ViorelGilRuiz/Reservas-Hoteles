/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Cliente {

    public Cliente(String DNI, String nombre, String apellidos, int telefono, String email, String codigoPostal, String localiidad, String catering) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.codigoPostal = codigoPostal;
        this.localiidad = localiidad;
        this.catering = catering;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocaliidad() {
        return localiidad;
    }

    public void setLocaliidad(String localiidad) {
        this.localiidad = localiidad;
    }

    public String getCatering() {
        return catering;
    }

    public void setCatering(String catering) {
        this.catering = catering;
    }

    @Override
    public String toString() {
        return "Cliente{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email + ", codigoPostal=" + codigoPostal + ", localiidad=" + localiidad + ", catering=" + catering + '}';
    }
    String DNI;
    String nombre;
    String apellidos;
    int telefono;
    String email;
    String codigoPostal;
    String localiidad;
    String catering;
    
    
}
