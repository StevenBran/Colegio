/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Objetos.Conexion;
import Objetos.Documentos;
import Objetos.Grados;
import Objetos.Jornada;
import Objetos.Materias;
import Objetos.MateriasProfesor;
import Objetos.Secciones;
import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author asd
 */
public class Profesor extends javax.swing.JFrame {
DefaultListModel modeloMat;
DefaultListModel modeloGrad;
DefaultListModel modeloSec;
    /**
     * Creates new form Profesor1
     */
    public Profesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
           
           Secciones Sc = new Secciones();
           DefaultComboBoxModel modeloSeccion = new DefaultComboBoxModel(Sc.mostrarSecciones());
           cbx_secciones.setModel(modeloSeccion);
           
           Grados Cg = new Grados();
           DefaultComboBoxModel modeloGrado = new DefaultComboBoxModel(Cg.mostrarGrados());
           cbx_Grado.setModel(modeloGrado);
           
           Materias Mt = new Materias();
           DefaultComboBoxModel modeloMateria = new DefaultComboBoxModel(Mt.mostrarMaterias());
           cbx_Materia.setModel(modeloMateria);
           
            modeloMat = new DefaultListModel();
           list_materias.setModel(modeloMat);
        
            modeloGrad = new DefaultListModel();
           list_grados.setModel(modeloGrad);
           
           modeloSec= new DefaultListModel();
           list_secciones.setModel(modeloSec);
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        cbx_Materia = new javax.swing.JComboBox<>();
        materia_profesor = new javax.swing.JLabel();
        nombre_profesor = new javax.swing.JLabel();
        apellido_profesor = new javax.swing.JLabel();
        apellido_profesor1 = new javax.swing.JLabel();
        txt_cui = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbx_Grado = new javax.swing.JComboBox<>();
        cbx_secciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_materias = new javax.swing.JList<>();
        grado_profesor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_grados = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_secciones = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_fondo.setBackground(new java.awt.Color(58, 58, 58));
        panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Profesor");
        panel_fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 210, 50));

        jPanel2.setBackground(new java.awt.Color(58, 58, 58));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_guardar.setBackground(new java.awt.Color(97, 97, 97));
        btn_guardar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(null);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 110, 100));

        btn_regresar.setBackground(new java.awt.Color(97, 97, 97));
        btn_regresar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.setBorder(null);
        btn_regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_regresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_regresar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_regresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 120, 100));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(51, 102, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel4.setText("Materias Elegidas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 212, -1));
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 212, -1));

        cbx_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_MateriaActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_Materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 210, 30));

        materia_profesor.setBackground(new java.awt.Color(51, 102, 255));
        materia_profesor.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        materia_profesor.setText("Materia");
        jPanel1.add(materia_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        nombre_profesor.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        nombre_profesor.setText("Nombre");
        jPanel1.add(nombre_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        apellido_profesor.setBackground(new java.awt.Color(51, 102, 255));
        apellido_profesor.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        apellido_profesor.setText("Apellido");
        jPanel1.add(apellido_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        apellido_profesor1.setBackground(new java.awt.Color(51, 102, 255));
        apellido_profesor1.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        apellido_profesor1.setText("DPI");
        jPanel1.add(apellido_profesor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel1.add(txt_cui, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 212, -1));

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 110, 30));

        cbx_Grado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_GradoItemStateChanged(evt);
            }
        });
        jPanel1.add(cbx_Grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 210, 30));

        jPanel1.add(cbx_secciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 60, 30));

        list_materias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(list_materias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 250, 120));

        grado_profesor.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        grado_profesor.setText("Grados");
        jPanel1.add(grado_profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel9.setText("Grado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel8.setText("Sec ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        list_grados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(list_grados);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 230, 120));

        list_secciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(list_secciones);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 50, 120));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 390));

        panel_fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 640, 520));

        getContentPane().add(panel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int d=0,cod_profesor,cod_materia,cod_grado;
    
    
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
//JOptionPane.showMessageDialog(null, list_materias.getSelectedValue().toString());
// TODO add your handling code here: 


        
         try{
   com.mysql.jdbc.PreparedStatement pr = null;
    ResultSet rs = null;
   Conexion conn = new Conexion();
   Connection con =  (Connection) conn.getConexion();
  
        pr = (com.mysql.jdbc.PreparedStatement) con.prepareStatement("INSERT INTO `profesor` ( `NombreProfesor`, `ApellidoProfesor`, `Correo`, `Telefono`, `DPI_profesor`) VALUES ( ?, ?, ?, ?, ?)");
        pr.setString(1,txt_nombre.getText());
        pr.setString(2,txt_apellido.getText());
        pr.setString(3,null);
        pr.setString(4,null);
        pr.setString(5,txt_cui.getText());
        
                int res = pr.executeUpdate();
            
            if(res > 0)
            {
                JOptionPane.showMessageDialog(null,"Profesor Guardado");
                try{
            com.mysql.jdbc.PreparedStatement pw = null;
            ResultSet rw = null;   
            pw =(com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT * FROM profesor where DPI_Profesor='"+txt_cui.getText()+"'");
           
            rw = pw.executeQuery();

            if(rw.next())
            {
                cod_profesor=rw.getInt("Id_profesor");
            }else{
                JOptionPane.showMessageDialog(null,"Error no se pudo encontrar datos ...");

            }

        }catch(Exception e){
            System.err.println("Error en la BD");
            
        }
            }else{
                JOptionPane.showMessageDialog(null," Error no se pudo guardar datos ...");
            } 
        con.close();
    }catch(Exception e){
        System.err.println(" Error en la BD");
    }
         
         d=list_grados.getModel().getSize();
        for(int i=0; i<d; i++){
          try{
              com.mysql.jdbc.PreparedStatement pr = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con =  (Connection) conn.getConexion();
            com.mysql.jdbc.PreparedStatement pw = null;
            ResultSet rw = null;   
            pw =(com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT * FROM materia where materia='"+list_materias.getModel().getElementAt(i)+"'");
           
            rw = pw.executeQuery();

            if(rw.next())
            {
                cod_materia=rw.getInt("Id_materia");
            }else{
                JOptionPane.showMessageDialog(null,"Error no se pudo encontrar datos ...");

            }

        }catch(Exception e){
            System.err.println("Error en la BD");
            
        }   
            try{
              com.mysql.jdbc.PreparedStatement pr = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con =  (Connection) conn.getConexion();
            com.mysql.jdbc.PreparedStatement pw = null;
            ResultSet rw = null;   
            pw =(com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT * FROM grado where grado='"+list_grados.getModel().getElementAt(i)+"'");
           
            rw = pw.executeQuery();

            if(rw.next())
            {
                cod_grado=rw.getInt("Id_grado");
            }else{
                JOptionPane.showMessageDialog(null,"Error no se pudo encontrar datos ...");

            }

        }catch(Exception e){
            System.err.println("Error en la BD");
            
        }   
                 
            
         try{
   com.mysql.jdbc.PreparedStatement pr = null;
    ResultSet rs = null;
   Conexion conn = new Conexion();
   Connection con =  (Connection) conn.getConexion();
  
        pr = (com.mysql.jdbc.PreparedStatement) con.prepareStatement("INSERT INTO `gradoprofesor` (Id_Grado, Id_Profesor,id_materia) VALUES (?,?,?)");
        pr.setInt(1,cod_grado);
        pr.setInt(2,cod_profesor);
        pr.setInt(3,cod_materia);
                int res = pr.executeUpdate();
            
            if(res > 0)
            {
                JOptionPane.showMessageDialog(null,"Asignacion de profesores correctamente");
            }else{
                JOptionPane.showMessageDialog(null," Error no se pudo guardar datos ...");
            } 
        con.close();
    }catch(Exception e){
        System.err.println(" Error en la BD");
    }
         
    }    
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
         Menu_opciones menu = new Menu_opciones();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String materia = cbx_Materia.getSelectedItem().toString();
       modeloMat.addElement(materia);
       
       String grado= cbx_Grado.getSelectedItem().toString();
       modeloGrad.addElement(grado);      
        
       
       modeloSec.addElement(cbx_secciones.getSelectedItem().toString()); 
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void cbx_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_MateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_MateriaActionPerformed

    private void cbx_GradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_GradoItemStateChanged
         /* if (evt.getStateChange()==ItemEvent.SELECTED){
            Grados d = (Grados) cbx_Grado.getSelectedItem();
            MateriasProfesor mun = new MateriasProfesor();            
            DefaultComboBoxModel modlMunicipio = new DefaultComboBoxModel(mun.mostrarMaterias(d.getId()));
            cbx_municipio.setModel(modlMunicipio);
            txt_codigo_departamento.setText(""+d.getId());
            
        }*/
    }//GEN-LAST:event_cbx_GradoItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido_profesor;
    private javax.swing.JLabel apellido_profesor1;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> cbx_Grado;
    private javax.swing.JComboBox<String> cbx_Materia;
    private javax.swing.JComboBox<String> cbx_secciones;
    private javax.swing.JLabel grado_profesor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> list_grados;
    private javax.swing.JList<String> list_materias;
    private javax.swing.JList<String> list_secciones;
    private javax.swing.JLabel materia_profesor;
    private javax.swing.JLabel nombre_profesor;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cui;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}