/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package mamani;

import java.awt.Image;
import java.sql.Connection;
import java.sql.SQLException;
import mamani.ConexionBD.*;
import javax.swing.JTextArea;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.*;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import static mamani.ConexionBD.obtenerAlimentosReceta;


/**
 *
 * @author Kiara
 */
public class menuesFiltros extends javax.swing.JFrame {

    /**
     * Creates new form menues
     */
    private Connection conexion; // Declaración de la variable conexion
    public menuesFiltros() {
        initComponents();
        this.setTitle("SmartFit - Menus");
          // Obtener la URL de la imagen
        URL imageURL = getClass().getResource("/mamani/Imagenes/Logo.jpg");
        System.out.println(imageURL);


    // Verificar si la URL se ha encontrado correctamente
    if (imageURL != null) {
        // Crear un ImageIcon a partir de la URL
        ImageIcon icono = new ImageIcon(imageURL);
        
        // Obtener la imagen desde el ImageIcon
        Image image = icono.getImage();
        
        // Establecer la imagen como ícono de la ventana
        this.setIconImage(image);
        
    }
    }
    
    public void actualizarRecetas(String[] recetas) {
          // Verifica que la cantidad de recetas no sea mayor a 9
          int limite = Math.min(recetas.length, 9);

          // Crear un array de JTextAreas para facilitar la actualización
          JTextArea[] areasDeTexto = {
              jTextArea1, jTextArea2, jTextArea3, jTextArea4,
              jTextArea5, jTextArea6, jTextArea7, jTextArea8, jTextArea9
          };

          // Actualiza las áreas de texto con las recetas proporcionadas
          for (int i = 0; i < limite; i++) {
              areasDeTexto[i].setText(recetas[i]);
          }

          // Si hay menos de 9 recetas, limpia el resto de las áreas de texto
          for (int i = limite; i < 9; i++) {
              areasDeTexto[i].setText("");
          }
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1111 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OPCIONES DE MENUS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 60));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Ir a receta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jButton6.setText("Ir a receta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        jButton5.setText("Ir a receta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(0, 0, 51));
        jTextArea6.setColumns(20);
        jTextArea6.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea6.setRows(5);
        jScrollPane4.setViewportView(jTextArea6);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 170, 120));

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 0, 51));
        jTextArea4.setColumns(20);
        jTextArea4.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jScrollPane5.setViewportView(jTextArea4);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 120));

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(0, 0, 51));
        jTextArea5.setColumns(20);
        jTextArea5.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea5.setRows(5);
        jScrollPane6.setViewportView(jTextArea5);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 170, 120));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 170, 540));

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("Ir a receta");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        jButton8.setText("Ir  a receta");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jButton7.setText("Ir a receta");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jTextArea9.setEditable(false);
        jTextArea9.setBackground(new java.awt.Color(51, 0, 0));
        jTextArea9.setColumns(20);
        jTextArea9.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea9.setRows(5);
        jScrollPane7.setViewportView(jTextArea9);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 170, 120));

        jTextArea7.setEditable(false);
        jTextArea7.setBackground(new java.awt.Color(51, 0, 0));
        jTextArea7.setColumns(20);
        jTextArea7.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea7.setRows(5);
        jScrollPane8.setViewportView(jTextArea7);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 120));

        jTextArea8.setEditable(false);
        jTextArea8.setBackground(new java.awt.Color(51, 0, 0));
        jTextArea8.setColumns(20);
        jTextArea8.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea8.setRows(5);
        jScrollPane9.setViewportView(jTextArea8);

        jPanel2.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 170, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 170, 540));

        jPanel5.setBackground(new java.awt.Color(0, 51, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Ir a receta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, 20));

        jButton2.setText("Ir a receta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jButton1.setText("Ir a receta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(0, 51, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jScrollPane1.setViewportView(jTextArea3);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 170, 120));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 51, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 120));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 51, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 170, 120));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 540));

        jButton1111.setBackground(new java.awt.Color(0, 0, 0));
        jButton1111.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jButton1111.setForeground(new java.awt.Color(255, 255, 255));
        jButton1111.setText("Volver a inicio");
        jButton1111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1111ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1111, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            String nombreReceta = jTextArea9.getText(); // Obtener el nombre de la receta del TextArea 1
    // Obtener los alimentos de la receta

    try {
        conexion = ConexionBD.obtenerConexion(); // Asignación de la conexión

        String[] alimentosReceta = obtenerAlimentosReceta(conexion, nombreReceta);
        receta rec = new receta();
        rec.mostrarNombreReceta(nombreReceta); // Mostrar el nombre de la receta en el JFrame `receta`
        rec.mostrarAlimentosReceta(alimentosReceta); // Mostrar alimentos en el JFrame `receta`
        rec.setVisible(true); // Mostrar el JFrame `receta`
    } catch (SQLException e) {
        // Manejo de excepciones SQL
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String nombreReceta = jTextArea2.getText(); // Obtener el nombre de la receta del TextArea 1
    // Obtener los alimentos de la receta

    try {
        conexion = ConexionBD.obtenerConexion(); // Asignación de la conexión

        String[] alimentosReceta = obtenerAlimentosReceta(conexion, nombreReceta);
        receta rec = new receta();
        rec.mostrarNombreReceta(nombreReceta); // Mostrar el nombre de la receta en el JFrame `receta`
        rec.mostrarAlimentosReceta(alimentosReceta); // Mostrar alimentos en el JFrame `receta`
        rec.setVisible(true); // Mostrar el JFrame `receta`
    } catch (SQLException e) {
        // Manejo de excepciones SQL
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombreReceta = jTextArea1.getText(); // Obtener el nombre de la receta del TextArea 1
    // Obtener los alimentos de la receta

    try {
        conexion = ConexionBD.obtenerConexion(); // Asignación de la conexión

        String[] alimentosReceta = obtenerAlimentosReceta(conexion, nombreReceta);
        receta rec = new receta();
        rec.mostrarNombreReceta(nombreReceta); // Mostrar el nombre de la receta en el JFrame `receta`
        rec.mostrarAlimentosReceta(alimentosReceta); // Mostrar alimentos en el JFrame `receta`
        rec.setVisible(true); // Mostrar el JFrame `receta`
    } catch (SQLException e) {
        // Manejo de excepciones SQL
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton1ActionPerformed
 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          String nombreReceta = jTextArea4.getText(); // Obtener el nombre de la receta del TextArea 1
    // Obtener los alimentos de la receta

    try {
        conexion = ConexionBD.obtenerConexion(); // Asignación de la conexión

        String[] alimentosReceta = obtenerAlimentosReceta(conexion, nombreReceta);
        receta rec = new receta();
        rec.mostrarNombreReceta(nombreReceta); // Mostrar el nombre de la receta en el JFrame `receta`
        rec.mostrarAlimentosReceta(alimentosReceta); // Mostrar alimentos en el JFrame `receta`
        rec.setVisible(true); // Mostrar el JFrame `receta`
    } catch (SQLException e) {
        // Manejo de excepciones SQL
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            String nombreReceta = jTextArea7.getText(); // Obtener el nombre de la receta del TextArea 1
    // Obtener los alimentos de la receta

    try {
        conexion = ConexionBD.obtenerConexion(); // Asignación de la conexión

        String[] alimentosReceta = obtenerAlimentosReceta(conexion, nombreReceta);
        receta rec = new receta();
        rec.mostrarNombreReceta(nombreReceta); // Mostrar el nombre de la receta en el JFrame `receta`
        rec.mostrarAlimentosReceta(alimentosReceta); // Mostrar alimentos en el JFrame `receta`
        rec.setVisible(true); // Mostrar el JFrame `receta`
    } catch (SQLException e) {
        // Manejo de excepciones SQL
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            String nombreReceta = jTextArea5.getText(); // Obtener el nombre de la receta del TextArea 1
    // Obtener los alimentos de la receta

    try {
        conexion = ConexionBD.obtenerConexion(); // Asignación de la conexión

        String[] alimentosReceta = obtenerAlimentosReceta(conexion, nombreReceta);
        receta rec = new receta();
        rec.mostrarNombreReceta(nombreReceta); // Mostrar el nombre de la receta en el JFrame `receta`
        rec.mostrarAlimentosReceta(alimentosReceta); // Mostrar alimentos en el JFrame `receta`
        rec.setVisible(true); // Mostrar el JFrame `receta`
    } catch (SQLException e) {
        // Manejo de excepciones SQL
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
             String nombreReceta = jTextArea8.getText(); // Obtener el nombre de la receta del TextArea 1
    // Obtener los alimentos de la receta

    try {
        conexion = ConexionBD.obtenerConexion(); // Asignación de la conexión

        String[] alimentosReceta = obtenerAlimentosReceta(conexion, nombreReceta);
        receta rec = new receta();
        rec.mostrarNombreReceta(nombreReceta); // Mostrar el nombre de la receta en el JFrame `receta`
        rec.mostrarAlimentosReceta(alimentosReceta); // Mostrar alimentos en el JFrame `receta`
        rec.setVisible(true); // Mostrar el JFrame `receta`
    } catch (SQLException e) {
        // Manejo de excepciones SQL
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            String nombreReceta = jTextArea3.getText(); // Obtener el nombre de la receta del TextArea 1
    // Obtener los alimentos de la receta

    try {
        conexion = ConexionBD.obtenerConexion(); // Asignación de la conexión

        String[] alimentosReceta = obtenerAlimentosReceta(conexion, nombreReceta);
        receta rec = new receta();
        rec.mostrarNombreReceta(nombreReceta); // Mostrar el nombre de la receta en el JFrame `receta`
        rec.mostrarAlimentosReceta(alimentosReceta); // Mostrar alimentos en el JFrame `receta`
        rec.setVisible(true); // Mostrar el JFrame `receta`
    } catch (SQLException e) {
        // Manejo de excepciones SQL
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            String nombreReceta = jTextArea6.getText(); // Obtener el nombre de la receta del TextArea 1
    // Obtener los alimentos de la receta

    try {
        conexion = ConexionBD.obtenerConexion(); // Asignación de la conexión

        String[] alimentosReceta = obtenerAlimentosReceta(conexion, nombreReceta);
        receta rec = new receta();
        rec.mostrarNombreReceta(nombreReceta); // Mostrar el nombre de la receta en el JFrame `receta`
        rec.mostrarAlimentosReceta(alimentosReceta); // Mostrar alimentos en el JFrame `receta`
        rec.setVisible(true); // Mostrar el JFrame `receta`
    } catch (SQLException e) {
        // Manejo de excepciones SQL
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1111ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        frameprinc inicio= new frameprinc();
        inicio.setVisible(true);
    }//GEN-LAST:event_jButton1111ActionPerformed

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
            java.util.logging.Logger.getLogger(menuesFiltros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuesFiltros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuesFiltros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuesFiltros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuesFiltros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1111;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration//GEN-END:variables
}
