/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techvuelos;

import java.sql.Date;

/**
 *
 * @author Personal
 */
public class Vuelo {
    
    private int idVuelo;
    private String origen;
    private String destino;
    private Date fecha;
    private int numero_sillas;
    
    public Vuelo(){}

    public Vuelo(int idVuelo, String origen, String destino, Date fecha, int numero_sillas) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.numero_sillas = numero_sillas;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero_sillas() {
        return numero_sillas;
    }

    public void setNumero_sillas(int numero_sillas) {
        this.numero_sillas = numero_sillas;
    }
    
    
}
