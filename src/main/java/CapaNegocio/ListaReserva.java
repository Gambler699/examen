/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;
import java.util.*;
/**
 *
 * @author acer
 */
public class ListaReserva extends Empleado{
    private String nroReservas;
    private String nombreCliente;
    private Date fecha;

    public String getNroReservas() {
        return nroReservas;
    }

    public void setNroReservas(String nroReservas) {
        this.nroReservas = nroReservas;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
