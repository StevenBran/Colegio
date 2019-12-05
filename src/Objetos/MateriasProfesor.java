
package Objetos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class MateriasProfesor {
private int id;
private String nombre;
private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
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
public Vector<MateriasProfesor> mostrarMaterias(String grado, String año){
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion conn = new Conexion();
            Connection con =  (Connection) conn.getConexion();
            Vector<MateriasProfesor> datos = new Vector<MateriasProfesor>();
            MateriasProfesor dat =null;
            try{
                String sql = "SELECT *FROM pensum INNER JOIN grado ON pensum.Id_Grado=grado.Id_Grado INNER JOIN materia on pensum.Id_Materia=materia.Id_Materia WHERE grado.Grado='"+grado+"'AND pensum.año='"+año+"'";
                ps = (PreparedStatement) con.prepareStatement(sql);
                rs = ps.executeQuery();
                dat = new MateriasProfesor();
                dat.setId(0);
                dat.setNombre("Seleccina Materia");
                datos.add(dat);
                while (rs.next()){
                    i++;
                dat = new MateriasProfesor();
                dat.setId(i);
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
