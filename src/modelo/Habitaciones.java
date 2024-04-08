/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Habitaciones {

    public Habitaciones(int idReserva, String dniCliente, String fechaentrada, String fechasalida, String tipohabitacion, int noches, double preciototal, String dniEmpleado) {
        this.idReserva = idReserva;
        this.dniCliente = dniCliente;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
        this.tipohabitacion = tipohabitacion;
        this.noches = noches;
        this.preciototal = preciototal;
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

    public String getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(String fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(String tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public String getDniEmpleado() {
        return dniEmpleado;
    }

    public void setDniEmpleado(String dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "idReserva=" + idReserva + ", dniCliente=" + dniCliente + ", fechaentrada=" + fechaentrada + ", fechasalida=" + fechasalida + ", tipohabitacion=" + tipohabitacion + ", noches=" + noches + ", preciototal=" + preciototal + ", dniEmpleado=" + dniEmpleado + '}';
    }
    
    int idReserva;
    String dniCliente;
    String fechaentrada;
    String fechasalida;
    String  tipohabitacion;
    int noches;
    double preciototal;
    String dniEmpleado;
}
