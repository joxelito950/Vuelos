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
public class Vuelos {
    private String id;
    private String fechayhora;
    private int asientos;
    private String origen;
    private String destino;
    
    
    public Vuelos(String id, String fechayhora, int asientos, String origen, String destino) {
        this.id = id;
        this.fechayhora = fechayhora;
        this.asientos = asientos;
        this.origen = origen;
        this.destino = destino;
        
    }

    public String getId() {
        return id;
    }

    public String getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(String fechayhora) {
        this.fechayhora = fechayhora;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
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
    
    
    
    public static void main(String[] args) {
        
    }
    
}
