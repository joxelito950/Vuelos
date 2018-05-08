/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelos;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JTable;

/**
 *
 * @author Personal
 */
public class TechVuelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Conexion conexion = new Conexion();
            
    }
    
    public ResultSet consultarVuelos(){
        Conexion conexion = new Conexion();
        Vuelo vuelo = new Vuelo();
        ResultSet resultado;
        
        String querry = "SELECT * FROM vuelos WHERE hora-fecha >= CURDATE();";
        resultado = conexion.ejecutarSQLSelect(querry);
        
        return resultado;
    }
     public ResultSet consultarReservaPorCedula(int cedula){
        Conexion conexion = new Conexion();
        Vuelo vuelo = new Vuelo();
        ResultSet resultado;
        
        String querry = "SELECT nombre,origen,destino,horaFecha,numero_sillas FROM reservas, vuelos, clientes WHERE" +
        cedula + "= clientes_cedula AND idvuelos = vuelos_idvuelos AND horaFecha >= CURDATE();";
        resultado = conexion.ejecutarSQLSelect(querry);
        
        return resultado;
    }
     
     
      public ResultSet reservarVuelo(int cedula, int idvuelo, int num_sillas){
        Conexion conexion = new Conexion();
        Vuelo vuelo = new Vuelo();
        ResultSet resultado;
        
        String querry = "INSERT INTO clientes_cedula,vuelos_idvuelo,numeroSillas "
                + "VALUES " + cedula+ ","+ idvuelo+","+num_sillas +";";
        resultado = conexion.ejecutarSQLSelect(querry);
        
        return resultado;
    }
}
