/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Principal;

import Controlador.GestionarProtectora;
import Modelo.Protectora;
import Vista.Protectora.Consulta.VentanaEliminarConsulta;
import Vista.Protectora.Consulta.VentanaListadoConsulta;
import Vista.Protectora.Consulta.VentanaRegistroConsulta;
import Vista.Protectora.Mascota.VentanaRegistroMascota;
import Vista.Protectora.VentanaEditarProtectora;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author UsuarioPracticas
 */
public class VentanaPrincipalProtectora extends javax.swing.JFrame {

    private static Protectora protectora;

    /**
     * Creates new form VentanaPrincipalProtectora
     */
    public VentanaPrincipalProtectora(Protectora protectora) {
        this.protectora = protectora;
        initComponents();
        setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Resources/iconSC.png")).getImage();
        setIconImage(icon);
    }

    public VentanaPrincipalProtectora() {
        initComponents();
        setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Resources/iconSC.png")).getImage();
        setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jltitulo2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbModificarProtectora = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbListarConsultas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbEliminarConsultas = new javax.swing.JButton();
        jbRegistrarConsultas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jbListarMascotas1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbEliminarMascota1 = new javax.swing.JButton();
        jbModificarMascota1 = new javax.swing.JButton();
        jbRegistrarMascota1 = new javax.swing.JButton();
        jbCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Protectora");
        setPreferredSize(null);
        setSize(new java.awt.Dimension(600, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("Principal"); // NOI18N
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoSC.png"))); // NOI18N
        jlLogo.setAlignmentY(0.0F);
        jPanel1.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 190, 150));

        jltitulo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo2.setText("Menu Principal");
        jPanel1.add(jltitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 195, 166)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Protectora");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jbModificarProtectora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/modificar16px.png"))); // NOI18N
        jbModificarProtectora.setText("Editar");
        jbModificarProtectora.setToolTipText("Modificar datos de una mascota...");
        jbModificarProtectora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarProtectoraActionPerformed(evt);
            }
        });
        jPanel2.add(jbModificarProtectora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 195, 166)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbListarConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/listados.png"))); // NOI18N
        jbListarConsultas.setText("Listado");
        jbListarConsultas.setToolTipText("Listar consultas...");
        jbListarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarConsultasActionPerformed(evt);
            }
        });
        jPanel3.add(jbListarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Consultas");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jbEliminarConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/borrar.png"))); // NOI18N
        jbEliminarConsultas.setText("Eliminar");
        jbEliminarConsultas.setToolTipText("Eliminar consultas...");
        jbEliminarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarConsultasActionPerformed(evt);
            }
        });
        jPanel3.add(jbEliminarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 110, 40));

        jbRegistrarConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/añadir.png"))); // NOI18N
        jbRegistrarConsultas.setText("Registrar");
        jbRegistrarConsultas.setToolTipText("Registrar consulta...");
        jbRegistrarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarConsultasActionPerformed(evt);
            }
        });
        jPanel3.add(jbRegistrarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 400, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 195, 166)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbListarMascotas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/listados.png"))); // NOI18N
        jbListarMascotas1.setText("Listado");
        jbListarMascotas1.setToolTipText("Listar mascotas...");
        jbListarMascotas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarMascotas1ActionPerformed(evt);
            }
        });
        jPanel4.add(jbListarMascotas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mascotas");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jbEliminarMascota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/borrar.png"))); // NOI18N
        jbEliminarMascota1.setText("Eliminar");
        jbEliminarMascota1.setToolTipText("Eliminar mascota...");
        jbEliminarMascota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarMascota1ActionPerformed(evt);
            }
        });
        jPanel4.add(jbEliminarMascota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 110, 40));

        jbModificarMascota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/modificar16px.png"))); // NOI18N
        jbModificarMascota1.setText("Editar");
        jbModificarMascota1.setToolTipText("Modificar datos de una mascota...");
        jbModificarMascota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarMascota1ActionPerformed(evt);
            }
        });
        jPanel4.add(jbModificarMascota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 110, 40));

        jbRegistrarMascota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/añadir.png"))); // NOI18N
        jbRegistrarMascota1.setText("Registrar");
        jbRegistrarMascota1.setToolTipText("Registrar mascota...");
        jbRegistrarMascota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarMascota1ActionPerformed(evt);
            }
        });
        jPanel4.add(jbRegistrarMascota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 520, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 560, 350));

        jbCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jbCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cerrarSesion.png"))); // NOI18N
        jbCerrarSesion.setToolTipText("Cerrar la sesión actual...");
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jbCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 600, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarProtectoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarProtectoraActionPerformed
        // TODO add your handling code here:
        VentanaEditarProtectora vEditarProtectora = new VentanaEditarProtectora(protectora);
        this.setVisible(false);
        vEditarProtectora.setVisible(true);
    }//GEN-LAST:event_jbModificarProtectoraActionPerformed

    private void jbRegistrarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarConsultasActionPerformed
        VentanaRegistroConsulta vRegistroConsulta = new VentanaRegistroConsulta(protectora);
        this.setVisible(false);
        vRegistroConsulta.setVisible(true);
    }//GEN-LAST:event_jbRegistrarConsultasActionPerformed

    private void jbCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSesionActionPerformed
        VentanaLogin vLogin = new VentanaLogin();
        this.setVisible(false);
        vLogin.setVisible(true);
    }//GEN-LAST:event_jbCerrarSesionActionPerformed

    private void jbListarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarConsultasActionPerformed
        VentanaListadoConsulta vListadoConsulta = new VentanaListadoConsulta();
        this.setVisible(false);
        vListadoConsulta.setVisible(true);
    }//GEN-LAST:event_jbListarConsultasActionPerformed

    private void jbEliminarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarConsultasActionPerformed
        VentanaEliminarConsulta vEliminarConsulta = new VentanaEliminarConsulta();
        this.setVisible(false);
        vEliminarConsulta.setVisible(true);
    }//GEN-LAST:event_jbEliminarConsultasActionPerformed

    private void jbListarMascotas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarMascotas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbListarMascotas1ActionPerformed

    private void jbEliminarMascota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarMascota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarMascota1ActionPerformed

    private void jbModificarMascota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarMascota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbModificarMascota1ActionPerformed

    private void jbRegistrarMascota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarMascota1ActionPerformed
        // TODO add your handling code here:
        VentanaRegistroMascota vRegistroMascota = new VentanaRegistroMascota(protectora);
        this.setVisible(false);
        vRegistroMascota.setVisible(true);
    }//GEN-LAST:event_jbRegistrarMascota1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalProtectora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalProtectora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalProtectora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalProtectora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalProtectora(protectora).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbCerrarSesion;
    private javax.swing.JButton jbEliminarConsultas;
    private javax.swing.JButton jbEliminarMascota1;
    private javax.swing.JButton jbListarConsultas;
    private javax.swing.JButton jbListarMascotas1;
    private javax.swing.JButton jbModificarMascota1;
    private javax.swing.JButton jbModificarProtectora;
    private javax.swing.JButton jbRegistrarConsultas;
    private javax.swing.JButton jbRegistrarMascota1;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jltitulo2;
    // End of variables declaration//GEN-END:variables

}
