/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.util.Currency;
import java.util.*;

/**
 *
 * @author acer
 */
public class Factura extends Pago{
    private String nroFactura;
    private Currency igv;
    private Currency subTotal;
    private Date fecha;

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Currency getIgv() {
        return igv;
    }

    public void setIgv(Currency igv) {
        this.igv = igv;
    }

    public Currency getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Currency subTotal) {
        this.subTotal = subTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
