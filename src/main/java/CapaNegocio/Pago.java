/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.util.Currency;

/**
 *
 * @author acer
 */
public class Pago extends Cliente{
    private Currency importe;

    public Currency getImporte() {
        return importe;
    }

    public void setImporte(Currency importe) {
        this.importe = importe;
    }
    
    
}
