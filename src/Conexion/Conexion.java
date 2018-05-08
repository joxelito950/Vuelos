/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Personal
 */
public class Conexion {
    Connection conexion;
    Statement statement;
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3305/mydb";
    
    public Conexion(){
    conexion = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(url,user,password);
        statement = conexion.createStatement();
    }
    catch(ClassNotFoundException | SQLException ex){
        System.out.println("Error en la conexion: " + ex);
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public void closeStatement(){
        try {
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desconectar(){
        conexion = null;
    }
    
    
    public boolean ejecutarSQL(String sql){
        try{
            statement.executeUpdate(sql);
        }
        catch(SQLException ex){
            return false;
        }
        return true;
    }
    
    public ResultSet ejecutarSQLSelect(String sql){
        ResultSet resultado;
        try{
            resultado = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return resultado;
    }
}
