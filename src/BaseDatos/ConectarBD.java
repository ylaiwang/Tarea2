package BaseDatos;

//import javax.servlet.http.HttpServlet;

import java.sql.Connection;
import java.util.logging.Level;

//import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
public class ConectarBD {
    
    Connection conexion;
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/porDefinir";
    
    public Connection getConnection(){
        // cualquier cosa
        return null;
    }
    
    
    
    public void cerrar(){
        try{
            conexion.close();
        } catch(SQLException excepcion) {
            Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, excepcion);
        }
    }
    
    
}
