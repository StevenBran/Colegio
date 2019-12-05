
package Objetos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Grados {
private int id;
private String nombre;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





public String toString(){
    return this.nombre;
}
public Vector<Grados> mostrarGrados(){
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion conn = new Conexion();
            Connection con =  (Connection) conn.getConexion();
            Vector<Grados> datos = new Vector<Grados>();
            Grados dat =null;
            try{
                String sql = "SELECT * FROM Grado"; 
                ps = (PreparedStatement) con.prepareStatement(sql);
                rs = ps.executeQuery();
                dat = new Grados();
                dat.setId(0);
                dat.setNombre("Seleccina Grado");
                datos.add(dat);
                while (rs.next()){
                dat = new Grados();
                 dat.setId(rs.getInt("id_grado"));
                dat.setNombre(rs.getString("Grado"));
                datos.add(dat);
                }
                rs.close();
            } catch(SQLException ex){
                System.err.println(ex.toString());
            }
    return datos;
}
}
