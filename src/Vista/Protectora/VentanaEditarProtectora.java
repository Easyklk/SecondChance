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
import Vista.Principal.VentanaPrincipalProtectora;
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
 * @author UsuarioPracticas
 */
public class VentanaEditarProtectora extends javax.swing.JFrame {

    private static Protectora protectora;
    private MaskFormatter mascara;

    /**
     * Creates new form VentanaEditarProtectora
     *
     * @param protectora protectora logeada
     */
    public VentanaEditarProtectora(Protectora protectora) {
        formatoTlfn();
        initComponents();
        othersComponents(protectora);
    }

    private void othersComponents(Protectora protectora) {
        this.protectora = protectora;
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

        jPanel4 = new javax.swing.JPanel();
        jlError = new javax.swing.JLabel();
        jlLogo3 = new javax.swing.JLabel();
        jlTitulo3 = new javax.swing.JLabel();
        jtfCif = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfRazonSocial = new javax.swing.JTextField();
        jtfUbicacion = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jcbShowPass = new javax.swing.JCheckBox();
        jbVolver = new javax.swing.JButton();
        jltitulo6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jltitulo7 = new javax.swing.JLabel();
        jtfTlfn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Protectora");
        setPreferredSize(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jlLogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoSC.png"))); // NOI18N
        jPanel4.add(jlLogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlTitulo3.setFont(new java.awt.Font("Segoe Print", 0, 52)); // NOI18N
        jlTitulo3.setText("Second Chance");
        jPanel4.add(jlTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jtfCif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCif.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfsFocusGained(evt);
            }
        });
        jPanel4.add(jtfCif, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, 30));

        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfsFocusGained(evt);
            }
        });
        jPanel4.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 150, 30));

        jtfRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfRazonSocial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfsFocusGained(evt);
            }
        });
        jPanel4.add(jtfRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 150, 30));

        jtfUbicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfUbicacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfsFocusGained(evt);
            }
        });
        jPanel4.add(jtfUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 150, 30));

        jpfPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfsFocusGained(evt);
            }
        });
        jPanel4.add(jpfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 150, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CIF Nuevo:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Protectora:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Razón Social:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ubicación:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jbModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/modificar16px.png"))); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setToolTipText("Pulse este boton para modificar...");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel4.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        jcbShowPass.setBackground(new java.awt.Color(255, 255, 255));
        jcbShowPass.setToolTipText("Mostrar/Ocultar contraseña");
        jcbShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/verPass.png"))); // NOI18N
        jcbShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbShowPassActionPerformed(evt);
            }
        });
        jPanel4.add(jcbShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, 30));

        jbVolver.setBackground(new java.awt.Color(255, 255, 255));
        jbVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/volver.png"))); // NOI18N
        jbVolver.setToolTipText("Pulse este boton para ir al menu principal...");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel4.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jltitulo6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo6.setText("Modificar Protectora");
        jPanel4.add(jltitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setText("Minimo 8 char, A-z,0-9,@-+");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 150, -1));

        jltitulo7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jltitulo7.setText("Rellene solo los campos a modificar");
        jPanel4.add(jltitulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jtfTlfn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfTlfn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfsFocusGained(evt);
            }
        });
        jPanel4.add(jtfTlfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 150, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        protectora = GestionarProtectora.obtenerProtectoraCif(protectora.getCif());
        if (jtfCif.getText().isEmpty() && jtfNombre.getText().isEmpty() && jtfRazonSocial.getText().isEmpty()
                && jpfPassword.getPassword().length == 0 && jtfTlfn.getText().isEmpty() && jtfUbicacion.getText().isEmpty()) {
            errorCamposVacios();
        } else {
            Protectora protectoraModificar = new Protectora();
            Usuario usuarioModificar = new Usuario();
            String pass = String.valueOf(jpfPassword.getPassword());
            if (!jtfCif.getText().isEmpty()) {
//                if (Utilidades.validarCif(jtfCif.getText())) {
                protectoraModificar.setCif(jtfCif.getText());
//                } else {
//                    jtfCif.setBorder(new LineBorder(Color.red));
//                    jlError.setText("¡¡Formato incorrecto!!");
//                }
            } else {
                protectoraModificar.setCif(protectora.getCif());
            }
            if (!jtfNombre.getText().isEmpty()) {
                protectoraModificar.setNombreProtectora(jtfNombre.getText());
            } else {
                protectoraModificar.setNombreProtectora(protectora.getNombreProtectora());
            }
            if (!jtfRazonSocial.getText().isEmpty()) {
                protectoraModificar.setRazonSocial(jtfRazonSocial.getText());
            } else {
                protectoraModificar.setRazonSocial(protectora.getRazonSocial());
            }
            if (!pass.isEmpty()) {
//                if (Utilidades.validarPass(pass)) {
                pass = Utilidades.getMD5(pass);
                usuarioModificar.setPassword(pass);
//                }
                usuarioModificar.setEmail(GestionarUsuario.obtenerUsuario(protectora.getEmail()).getEmail());
                System.out.println(usuarioModificar.toString());
                if (GestionarUsuario.modificarUsuarioPass(usuarioModificar).equals(CR_OK_INSERT)) {
                    System.out.println("PASS MODIFICADA");
                }
            }
            if (!jtfUbicacion.getText().isEmpty()) {
                protectoraModificar.setUbicacion(jtfUbicacion.getText());
            } else {
                protectoraModificar.setUbicacion(protectora.getUbicacion());
            }
            if (!jtfTlfn.getText().isEmpty()) {
                if (Utilidades.validarTelefono(jtfTlfn.getText())) {
                    protectoraModificar.setTelefono(jtfTlfn.getText());
                } else {
                    jlError.setText("¡¡Formato incorrecto!!");
                    jtfTlfn.setBorder(new LineBorder(Color.red));
                }
            } else {
                protectoraModificar.setTelefono(protectora.getTelefono());
            }
            if (GestionarProtectora.modificarProtectora(protectoraModificar, protectora.getCif()).equals(CR_OK_INSERT)) {
                jlError.setText("");
                jbModificar.setPreferredSize(new Dimension(jbModificar.getWidth(), jbModificar.getHeight()));
                jbModificar.setBorder(new LineBorder(Color.green));
                protectora = GestionarProtectora.obtenerProtectoraCif(protectoraModificar.getCif());
            }
        }
    }//GEN-LAST:event_jbModificarActionPerformed
    private void defaultBorders() {
        jtfCif.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfNombre.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfRazonSocial.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jpfPassword.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfTlfn.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfUbicacion.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
    }

    private void jcbShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbShowPassActionPerformed
        // TODO add your handling code here:
        if (jcbShowPass.isSelected()) {
            jpfPassword.setEchoChar((char) 0);
        } else {
            jpfPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbShowPassActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        VentanaPrincipalProtectora vPrincipalProtectora = new VentanaPrincipalProtectora(protectora);
        this.setVisible(false);
        vPrincipalProtectora.setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jtfsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfsFocusGained
        // TODO add your handling code here:
        jbModificar.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("Button.border"));
        jlError.setText("");
        defaultBorders();
    }//GEN-LAST:event_jtfsFocusGained

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
            java.util.logging.Logger.getLogger(VentanaEditarProtectora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarProtectora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarProtectora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarProtectora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEditarProtectora(protectora).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JCheckBox jcbShowPass;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlLogo3;
    private javax.swing.JLabel jlTitulo3;
    private javax.swing.JLabel jltitulo6;
    private javax.swing.JLabel jltitulo7;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JTextField jtfCif;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRazonSocial;
    private javax.swing.JTextField jtfTlfn;
    private javax.swing.JTextField jtfUbicacion;
    // End of variables declaration//GEN-END:variables

    private void errorCamposVacios() {
        jlError.setText("¡¡RELLENE ALGÚN CAMPO!!");
        jtfCif.setBorder(new LineBorder(Color.red, 1));
        jtfNombre.setBorder(new LineBorder(Color.red, 1));
        jtfTlfn.setBorder(new LineBorder(Color.red, 1));
        jpfPassword.setBorder(new LineBorder(Color.red, 1));
        jtfRazonSocial.setBorder(new LineBorder(Color.red, 1));
        jtfUbicacion.setBorder(new LineBorder(Color.red, 1));
    }

    private void modificarCorrecto() {
        defaultBorders();
        jbModificar.setPreferredSize(new Dimension(jbModificar.getWidth(), jbModificar.getHeight()));
        jbModificar.setBorder(new LineBorder(Color.green));
        jtfCif.setText("");
        jtfNombre.setText("");
        jtfRazonSocial.setText("");
        jpfPassword.setText("");
        jtfUbicacion.setText("");
    }
}
