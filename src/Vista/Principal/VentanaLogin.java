/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Principal;

import Controlador.GestionarLogin;
import Controlador.GestionarProtectora;
import Controlador.Utilidades;
import Modelo.Protectora;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

/**
 *
 * @author Easyklk
 */
public class VentanaLogin extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLogin
     */
    public VentanaLogin() {
        initComponents();
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
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
        jlTitulo = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlPassword = new javax.swing.JLabel();
        jpfPassword = new javax.swing.JPasswordField();
        jlLogo = new javax.swing.JLabel();
        jlCerrar = new javax.swing.JLabel();
        jbLogin = new javax.swing.JButton();
        jlError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTitulo.setFont(new java.awt.Font("Segoe Print", 0, 52)); // NOI18N
        jlTitulo.setText("Second Chance");
        jPanel1.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 11, -1, -1));

        jlUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlUsuario.setText("Email:");
        jPanel1.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 128, -1, -1));

        jtfEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 156, 211, -1));

        jlPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlPassword.setText("Contraseña:");
        jPanel1.add(jlPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 183, -1, -1));

        jpfPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jpfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 211, 211, -1));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoSC.png"))); // NOI18N
        jPanel1.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jlCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cerrar32px.png"))); // NOI18N
        jlCerrar.setToolTipText("Cerrar la aplicación...");
        jlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        jbLogin.setText("Iniciar Sesión");
        jbLogin.setToolTipText("Pulse este boton para iniciar sesión...");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, -1));

        jlError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 105, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jlCerrarMouseClicked

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        // TODO add your handling code here:
        if (!jtfEmail.getText().trim().isEmpty() && jpfPassword.getPassword().length != 0) {
            String pass = Utilidades.getMD5(String.valueOf(jpfPassword.getPassword()));
            String email = jtfEmail.getText().trim();
            if (GestionarLogin.logueoAdmin(email, pass) == true) {
                VentanaPrincipalAdmin vPrincipalAdmin = new VentanaPrincipalAdmin();
                vPrincipalAdmin.setVisible(true);
                this.setVisible(false);
            } else if (GestionarLogin.logueoProtectora(email, pass) == true) {
                Protectora protectora = GestionarProtectora.obtenerProtectoraEmail(email);
                VentanaPrincipalProtectora vPrincipalProtectora = new VentanaPrincipalProtectora(protectora);
                vPrincipalProtectora.setVisible(true);
                this.setVisible(false);
            } else {
                jlError.setText("¡Email y/o contraseña incorrectos!");
                jtfEmail.setBorder(new LineBorder(Color.red, 1));
                jpfPassword.setBorder(new LineBorder(Color.red, 1));
            }
        } else {
            jlError.setText("¡Rellene todos los campos!");
            jtfEmail.setBorder(new LineBorder(Color.red, 1));
            jpfPassword.setBorder(new LineBorder(Color.red, 1));
        }
    }//GEN-LAST:event_jbLoginActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbLogin;
    private javax.swing.JLabel jlCerrar;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JTextField jtfEmail;
    // End of variables declaration//GEN-END:variables
}
