
package Objetos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Documentos {
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
public Vector<Documentos> mostrarDocumentos(){
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion conn = new Conexion();
            Connection con =  (Connection) conn.getConexion();
            Vector<Documentos> datos = new Vector<Documentos>();
            Documentos dat =null;
            try{
                String sql = "SELECT * FROM documentoidentificacion";
                ps = (PreparedStatement) con.prepareStatement(sql);
                rs = ps.executeQuery();
                dat = new Documentos();
                dat.setId(0);
                dat.setNombre("Seleccina Documento");
                datos.add(dat);
                while (rs.next()){
                    id++;
                dat = new Documentos();
                 dat.setId(id);
                dat.setNombre(rs.getString("Nombre_Documento"));
                datos.add(dat);
                }
                rs.close();;
            } catch(SQLException ex){
                System.err.println(ex.toString());
            }
    return datos;
}
}
