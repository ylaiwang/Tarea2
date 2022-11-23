package main;

import BaseDatos.Conexion;


public class Main {
    public static void main(String[] args){
        System.out.println("Probar si se conecta");
        
        Conexion date = new Conexion();
        date.getConnection();
    
    }
    
    
}
