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
public class cliente {
    private String ced;
    private String nom;
    private String ape;
    private int edad;

    public cliente(String ced, String nom, String ape, int edad) {
        this.ced = ced;
        this.nom = nom;
        this.ape = ape;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCed() {
        return ced;
    }
    
    
}
