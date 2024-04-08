/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Salones {

    public Salones(int idReserva, String dniCliente, String fecha, int numPersonas, String catering, double precio, String dniEmpleado) {
        this.idReserva = idReserva;
        this.dniCliente = dniCliente;
        this.fecha = fecha;
        this.numPersonas = numPersonas;
        this.catering = catering;
        this.precio = precio;
        this.dniEmpleado = dniEmpleado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public String getCatering() {
        return catering;
    }

    public void setCatering(String catering) {
        this.catering = catering;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDniEmpleado() {
        return dniEmpleado;
    }

    public void setDniEmpleado(String dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }

    @Override
    public String toString() {
        return "Salones{" + "idReserva=" + idReserva + ", dniCliente=" + dniCliente + ", fecha=" + fecha + ", numPersonas=" + numPersonas + ", catering=" + catering + ", precio=" + precio + ", dniEmpleado=" + dniEmpleado + '}';
    }
    
    int idReserva;
    String dniCliente;
    String fecha;
    int numPersonas;
    String catering;
    double precio;
    String dniEmpleado;
}
