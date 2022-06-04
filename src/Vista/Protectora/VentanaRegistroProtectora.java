/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Protectora;

import static Controlador.Constantes.CR_OK_INSERT;
import Controlador.GestionarProtectora;
import Controlador.GestionarUsuario;
import Controlador.Utilidades;
import Modelo.Protectora;
import Modelo.Usuario;
import Vista.Principal.VentanaPrincipalAdmin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Isaac-PC
 */
public class VentanaRegistroProtectora extends javax.swing.JFrame {

    private Protectora protectora;
    private Usuario usuario;
    private MaskFormatter mascara;

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistroProtectora() {
        formatoTlfn();
        initComponents();
        jpfPassword.setEchoChar('*');
        setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Resources/iconSC.png")).getImage();
        setIconImage(icon);
    }

    private void formatoTlfn() {
        try {
            mascara = new MaskFormatter("#########");
        } catch (ParseException ex) {
            Logger.getLogger(VentanaRegistroProtectora.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jlError = new javax.swing.JLabel();
        jlLogo = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jtfCif = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfRazonSocial = new javax.swing.JTextField();
        jtfUbicacion = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbRegistrar = new javax.swing.JButton();
        jcbShowPass = new javax.swing.JCheckBox();
        jbVolver = new javax.swing.JButton();
        jltitulo3 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfTlfn = new javax.swing.JFormattedTextField(mascara);
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Protectora");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoSC.png"))); // NOI18N
        jPanel1.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlTitulo.setFont(new java.awt.Font("Segoe Print", 0, 52)); // NOI18N
        jlTitulo.setText("Second Chance");
        jPanel1.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jtfCif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCifActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCif, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, 30));

        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 150, 30));

        jtfRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 150, 30));

        jtfUbicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 340, 30));

        jpfPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jpfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 150, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CIF:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Protectora:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Razón Social:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ubicación:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        jbRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/añadir.png"))); // NOI18N
        jbRegistrar.setText("Registrar");
        jbRegistrar.setToolTipText("Pulse este boton para registrase...");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 120, 30));

        jcbShowPass.setBackground(new java.awt.Color(255, 255, 255));
        jcbShowPass.setToolTipText("Mostrar/Ocultar Contraseña");
        jcbShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/verPass.png"))); // NOI18N
        jcbShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbShowPassActionPerformed(evt);
            }
        });
        jPanel1.add(jcbShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, 30));

        jbVolver.setBackground(new java.awt.Color(255, 255, 255));
        jbVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/volver.png"))); // NOI18N
        jbVolver.setToolTipText("Pulse este boton para ir al menu principal...");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jltitulo3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo3.setText("Registro de Protectora");
        jPanel1.add(jltitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jtfEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jtfTlfn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfTlfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 150, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setText("Minimo 8 char, A-z,0-9,@-]");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 150, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Contraseña:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCifActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
        if (jtfCif.getText().isEmpty() || jtfNombre.getText().isEmpty() || jtfRazonSocial.getText().isEmpty()
                || jtfEmail.getText().isEmpty() || jpfPassword.getPassword().length == 0 || jtfTlfn.getText().isEmpty() || jtfUbicacion.getText().isEmpty()) {
            errorCamposVacios();
        } else {
            if (!Utilidades.validarCif(jtfCif.getText().trim())) {
                defaultBorders();
                jtfCif.setBorder(new LineBorder(Color.red));
                jlError.setText("¡¡Formato incorrecto!!");
            } else if (!Utilidades.validarEmail(jtfEmail.getText().trim())) {
                defaultBorders();
                jtfEmail.setBorder(new LineBorder(Color.red));
                jlError.setText("¡¡Formato incorrecto!!");
            } else if (!Utilidades.validarPass(String.valueOf(jpfPassword.getPassword()))) {
                defaultBorders();
                jpfPassword.setBorder(new LineBorder(Color.red));
                jlError.setText("¡¡Requisitos Insuficientes!!");
            } else if (!Utilidades.validarTelefono(jtfTlfn.getText().trim())) {
                defaultBorders();
                jtfTlfn.setBorder(new LineBorder(Color.red));
                jlError.setText("¡¡Formato incorrecto!!");
            } else {
                defaultBorders();
                String pass = Utilidades.getMD5(String.valueOf(jpfPassword.getPassword()));
                usuario = new Usuario(jtfEmail.getText().trim(), pass, 0, 1, 0);
                protectora = new Protectora(jtfCif.getText().trim(), jtfNombre.getText().trim(), jtfRazonSocial.getText().trim(),
                        jtfEmail.getText().trim(), jtfTlfn.getText().trim(), jtfUbicacion.getText());
                if (GestionarUsuario.insertarUsuario(usuario).equals(CR_OK_INSERT) && GestionarProtectora.insertarProtectora(protectora).equals(CR_OK_INSERT)) {
                    registroCorrecto();
                }
            }
        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void defaultBorders() {
        jtfCif.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfEmail.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfNombre.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfRazonSocial.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfTlfn.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jpfPassword.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfUbicacion.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
    }

    private void registroCorrecto() {
        jbRegistrar.setPreferredSize(new Dimension(jbRegistrar.getWidth(), jbRegistrar.getHeight()));
        jbRegistrar.setBorder(new LineBorder(Color.green));
        jtfCif.setText("");
        jtfNombre.setText("");
        jtfRazonSocial.setText("");
        jtfEmail.setText("");
        jpfPassword.setText("");
        jtfTlfn.setText("");
        jtfUbicacion.setText("");
    }

    private void errorCamposVacios() {
        jlError.setText("¡RELLENE TODOS LOS CAMPOS!");
        jtfCif.setBorder(new LineBorder(Color.red, 1));
        jtfNombre.setBorder(new LineBorder(Color.red, 1));
        jtfRazonSocial.setBorder(new LineBorder(Color.red, 1));
        jtfEmail.setBorder(new LineBorder(Color.red, 1));
        jpfPassword.setBorder(new LineBorder(Color.red, 1));
        jtfTlfn.setBorder(new LineBorder(Color.red, 1));
        jtfUbicacion.setBorder(new LineBorder(Color.red, 1));
    }

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        VentanaPrincipalAdmin vPrincipalAdmin = new VentanaPrincipalAdmin();
        this.setVisible(false);
        vPrincipalAdmin.setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    /**
     * Muestra/oculta el texto del jTextField de la contraseña
     *
     * @param evt evento de la acción
     */
    private void jcbShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbShowPassActionPerformed
        // TODO add your handling code here:
        if (jcbShowPass.isSelected()) {
            jpfPassword.setEchoChar((char) 0);
        } else {
            jpfPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbShowPassActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistroProtectora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroProtectora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroProtectora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroProtectora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroProtectora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JCheckBox jcbShowPass;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jltitulo3;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JTextField jtfCif;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRazonSocial;
    private javax.swing.JFormattedTextField jtfTlfn;
    private javax.swing.JTextField jtfUbicacion;
    // End of variables declaration//GEN-END:variables

}
