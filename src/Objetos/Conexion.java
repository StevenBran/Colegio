package Objetos;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conexion {
private final String user = "root";
private final String password = "";
private final String url = "jdbc:mysql://localhost:3306/InterAmericano1?useSSL=false";
private Connection con = null;

public Connection getConexion(){
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
    }catch (SQLException e){
        System.err.println(e);
    } catch (ClassNotFoundException ex){
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
    return con;
}

}

