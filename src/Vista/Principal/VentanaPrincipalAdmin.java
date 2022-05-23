/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Principal;

import Controlador.Constantes;
import Vista.Protectora.VentanaEliminarProtectora;
import Vista.Protectora.VentanaListadoProtectora;
import Vista.Protectora.VentanaRegistroProtectora;
import Vista.Usuario.VentanaEliminarUsuario;
import Vista.Usuario.VentanaListadoUsuario;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author UsuarioPracticas
 */
public class VentanaPrincipalAdmin extends javax.swing.JFrame implements Constantes{

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipalAdmin() {
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
        jbListarProtectoras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbEliminarProtectora = new javax.swing.JButton();
        jbRegistrarProtectora = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jbListarUsuarios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbEliminarUsuario = new javax.swing.JButton();
        jbCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Administrador");
        setResizable(false);
        setSize(new java.awt.Dimension(629, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("Principal"); // NOI18N
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoSC.png"))); // NOI18N
        jlLogo.setAlignmentY(0.0F);
        jPanel1.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 190, 150));

        jltitulo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo2.setText("Menu Principal");
        jPanel1.add(jltitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 195, 166)));

        jbListarProtectoras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbListarProtectoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/listados.png"))); // NOI18N
        jbListarProtectoras.setText("Listado");
        jbListarProtectoras.setToolTipText("Menu para listar protectoras...");
        jbListarProtectoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarProtectorasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Protectoras");

        jbEliminarProtectora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEliminarProtectora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/borrar.png"))); // NOI18N
        jbEliminarProtectora.setText("Eliminar");
        jbEliminarProtectora.setToolTipText("Menu para eliminar protectoras...");
        jbEliminarProtectora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarProtectoraActionPerformed(evt);
            }
        });

        jbRegistrarProtectora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbRegistrarProtectora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/añadir.png"))); // NOI18N
        jbRegistrarProtectora.setText("Registrar");
        jbRegistrarProtectora.setToolTipText("Menu para registrar protectoras...");
        jbRegistrarProtectora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarProtectoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbListarProtectoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbRegistrarProtectora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jbEliminarProtectora)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(137, 137, 137))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbListarProtectoras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminarProtectora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegistrarProtectora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 350, 90));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 195, 166)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbListarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbListarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/listados.png"))); // NOI18N
        jbListarUsuarios.setText("Listado");
        jbListarUsuarios.setToolTipText("Menu para listar usuarios...");
        jbListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarUsuariosActionPerformed(evt);
            }
        });
        jPanel4.add(jbListarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Usuarios");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jbEliminarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/borrar.png"))); // NOI18N
        jbEliminarUsuario.setText("Eliminar");
        jbEliminarUsuario.setToolTipText("Menu para eliminar usuarios...");
        jbEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel4.add(jbEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 250, 80));

        jbCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jbCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cerrarSesion.png"))); // NOI18N
        jbCerrarSesion.setToolTipText("Cerrar la sesión actual...");
        jbCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jbCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarProtectoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarProtectoraActionPerformed
        // TODO add your handling code here:
        VentanaRegistroProtectora vRegistroProtectora = new VentanaRegistroProtectora();
        this.setVisible(false);
        vRegistroProtectora.setVisible(true);
    }//GEN-LAST:event_jbRegistrarProtectoraActionPerformed

    private void jbListarProtectorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarProtectorasActionPerformed
        // TODO add your handling code here:
        VentanaListadoProtectora vListadoProtectora = new VentanaListadoProtectora();
        this.setVisible(false);
        vListadoProtectora.setVisible(true);
    }//GEN-LAST:event_jbListarProtectorasActionPerformed

    private void jbEliminarProtectoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarProtectoraActionPerformed
        // TODO add your handling code here:
        VentanaEliminarProtectora vEliminarProtectora = new VentanaEliminarProtectora();
        this.setVisible(false);
        vEliminarProtectora.setVisible(true);
    }//GEN-LAST:event_jbEliminarProtectoraActionPerformed

    private void jbListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarUsuariosActionPerformed
        // TODO add your handling code here:
        VentanaListadoUsuario vListadoUsuario = new VentanaListadoUsuario();
        this.setVisible(false);
        vListadoUsuario.setVisible(true);
    }//GEN-LAST:event_jbListarUsuariosActionPerformed

    private void jbEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarUsuarioActionPerformed
        // TODO add your handling code here:
        VentanaEliminarUsuario vEliminarUsuario = new VentanaEliminarUsuario();
        this.setVisible(false);
        vEliminarUsuario.setVisible(true);
    }//GEN-LAST:event_jbEliminarUsuarioActionPerformed

    private void jbCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSesionActionPerformed
        // TODO add your handling code here:
        VentanaLogin vLogin = new VentanaLogin();
        this.setVisible(false);
        vLogin.setVisible(true);
    }//GEN-LAST:event_jbCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbCerrarSesion;
    private javax.swing.JButton jbEliminarProtectora;
    private javax.swing.JButton jbEliminarUsuario;
    private javax.swing.JButton jbListarProtectoras;
    private javax.swing.JButton jbListarUsuarios;
    private javax.swing.JButton jbRegistrarProtectora;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jltitulo2;
    // End of variables declaration//GEN-END:variables
}
