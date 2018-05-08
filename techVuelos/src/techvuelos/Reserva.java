/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techvuelos;

/**
 *
 * @author Personal
 */
public class Reserva {
    
    private int idReserva;
    private int cedula;
    private int idVuelo;
    private int num_sillas_reservadas;
    
    public Reserva(){}

    public Reserva(int idReserva, int cedula, int idVuelo, int num_sillas_reservadas) {
        this.idReserva = idReserva;
        this.cedula = cedula;
        this.idVuelo = idVuelo;
        this.num_sillas_reservadas = num_sillas_reservadas;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getNum_sillas_reservadas() {
        return num_sillas_reservadas;
    }

    public void setNum_sillas_reservadas(int num_sillas_reservadas) {
        this.num_sillas_reservadas = num_sillas_reservadas;
    }
    
    
}
