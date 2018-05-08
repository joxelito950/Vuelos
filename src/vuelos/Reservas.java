/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelos;

/**
 *
 * @author ASUS
 */
public class Reservas {
   private String idVuelo;
   private String idCliente;
   private int reservas;

    public Reservas(String idVuelo, String idCliente) {
        this.idVuelo = idVuelo;
        this.idCliente = idCliente;
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public int getReservas() {
        return reservas;
    }
   
   
    
}
