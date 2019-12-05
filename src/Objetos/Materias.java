
package Objetos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Materias {
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
public Vector<Materias> mostrarMaterias(){
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion conn = new Conexion();
            Connection con =  (Connection) conn.getConexion();
            Vector<Materias> datos = new Vector<Materias>();
            Materias dat =null;
            try{
                String sql = "SELECT * FROM materia";
                ps = (PreparedStatement) con.prepareStatement(sql);
                rs = ps.executeQuery();
                dat = new Materias();
                dat.setId(0);
                dat.setNombre("Seleccina Materia");
                datos.add(dat);
                while (rs.next()){
                dat = new Materias();
                 dat.setId(rs.getInt("id_Materia"));
                dat.setNombre(rs.getString("Materia"));
                datos.add(dat);
                }
                rs.close();;
            } catch(SQLException ex){
                System.err.println(ex.toString());
            }
    return datos;
}
}
