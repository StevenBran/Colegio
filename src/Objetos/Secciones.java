
package Objetos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Secciones {
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
public Vector<Secciones> mostrarSecciones(){
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion conn = new Conexion();
            Connection con =  (Connection) conn.getConexion();
            Vector<Secciones> datos = new Vector<Secciones>();
            Secciones dat =null;
            try{
                String sql = "SELECT * FROM seccion";
                ps = (PreparedStatement) con.prepareStatement(sql);
                rs = ps.executeQuery();
                dat = new Secciones();
                dat.setId(0);
                dat.setNombre(" ");
                datos.add(dat);
                while (rs.next()){
                    id++;
                dat = new Secciones();
                 dat.setId(id);
                dat.setNombre(rs.getString("Seccion"));
                datos.add(dat);
                }
                rs.close();;
            } catch(SQLException ex){
                System.err.println(ex.toString());
            }
    return datos;
}
}
