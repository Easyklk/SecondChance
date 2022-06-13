/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Protectora.Mascota;

import static Controlador.Constantes.*;
import Controlador.GestionarMascota;
import Controlador.HttpRequest;
import Modelo.Mascota;
import Modelo.Protectora;
import Vista.Principal.VentanaPrincipalProtectora;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author UsuarioPracticas
 */
public class VentanaEditarMascota extends javax.swing.JFrame {

    private File archivo;
    private static Protectora protectora;

    /**
     * Creates new form VentanaRegistro
     * @param protectora Protectora logeada
     */
    public VentanaEditarMascota(Protectora protectora) {
        initComponents();
        otherComponents();
        this.protectora = protectora;
    }

    private void otherComponents() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jltitulo2 = new javax.swing.JLabel();
        jlLogo = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbEditar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jtfCodigo = new javax.swing.JTextField();
        jbSeleccionarFoto = new javax.swing.JButton();
        jlError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jltitulo6 = new javax.swing.JLabel();
        jlNumChar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Mascota");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jltitulo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo2.setText("Modificar Mascota");
        jPanel1.add(jltitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoSC.png"))); // NOI18N
        jPanel1.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlTitulo.setFont(new java.awt.Font("Segoe Print", 0, 52)); // NOI18N
        jlTitulo.setText("Second Chance");
        jPanel1.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código: (Obligatorio)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Foto:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jbEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/modificar16px.png"))); // NOI18N
        jbEditar.setText("Modificar");
        jbEditar.setToolTipText("Pulse este boton para registrase...");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jbVolver.setBackground(new java.awt.Color(255, 255, 255));
        jbVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/volver.png"))); // NOI18N
        jbVolver.setToolTipText("Pulse este boton para ir al menu principal...");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jtfCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfsFocusGained(evt);
            }
        });
        jPanel1.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, 30));

        jbSeleccionarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/busqueda25px.png"))); // NOI18N
        jbSeleccionarFoto.setText("Seleccionar");
        jbSeleccionarFoto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfsFocusGained(evt);
            }
        });
        jbSeleccionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarFotoActionPerformed(evt);
            }
        });
        jPanel1.add(jbSeleccionarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 160, 30));

        jlError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtaDescripcion.setLineWrap(true);
        jtaDescripcion.setRows(5);
        jtaDescripcion.setToolTipText("");
        jtaDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfsFocusGained(evt);
            }
        });
        jtaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtaDescripcionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtaDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 350, 140));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Descripción:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));
        jPanel1.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 80, 90));

        jltitulo6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jltitulo6.setText("Rellene solo los campos a modificar");
        jPanel1.add(jltitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jlNumChar.setText("0/300");
        jPanel1.add(jlNumChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        if (jtfCodigo.getText().isEmpty()) {
            jtfCodigo.setBorder(new LineBorder(Color.RED, 1));
        } else {
            Mascota mascota = GestionarMascota.obtenerMascotaCodCifProtectora(jtfCodigo.getText(), protectora.getCif());
            if (mascota != null) {
                if (!jtaDescripcion.getText().isEmpty() && jtaDescripcion.getText().length() <= 3) {
                    mascota.setDescripcion(jtaDescripcion.getText());
                } else if (jtaDescripcion.getText().length() > 300) {
                    jlError.setText("¡¡300 Caracteres max.!!");
                    jtaDescripcion.setBorder(new LineBorder(Color.red, 1));
                }
                if (archivo != null) {
                    mascota.setFoto("/Imagenes/" + mascota.getNombre() + "_" + jtfCodigo.getText() + "." + obtenerExtension(archivo));
                    HttpRequest.insertarImage(archivo, mascota.getNombre(), jtfCodigo.getText());
                    jLabelFoto.setIcon(null);
                }
                if ((!jtaDescripcion.getText().isEmpty() && jtaDescripcion.getText().length() <= 300) || archivo != null) {
                    mascota.setDescripcion(jtaDescripcion.getText().trim());
                    if (GestionarMascota.modificarMascota(mascota).equals(CR_OK_INSERT)) {
                        modificarCorrecto();
                    }
                } else if (jtaDescripcion.getText().isEmpty() && archivo == null) {
                    errorCamposVacios();
                }
            } else {
                jlError.setText("!La mascota no existe¡");
            }
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void errorCamposVacios() {
        jlError.setText("¡¡RELLENE ALGUN CAMPO!!");
        jtaDescripcion.setBorder(new LineBorder(Color.red));
        jbSeleccionarFoto.setBorder(new LineBorder(Color.red));
    }

    private static String obtenerExtension(File file) {
        String extension = "";
        int i = file.getName().lastIndexOf('.');
        if (i > 0) {
            extension = file.getName().substring(i + 1);
        }
        return extension;
    }

    private void jbSeleccionarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarFotoActionPerformed
        // TODO add your handling code here:
        JFileChooser jfcFoto = new JFileChooser();
        jfcFoto.setDialogTitle("Seleccionar Foto");
        String directoryName = System.getProperty("user.home");
        jfcFoto.setCurrentDirectory(new File(directoryName + "\\Pictures")); //Seleccionar ruta por defecto cuando se abre el fileChooser
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Ficheros de imagen", "jpeg", "jpg", "png");
        jfcFoto.setFileFilter(filter);
        int ventanaFoto = jfcFoto.showOpenDialog(this);
        if (ventanaFoto == JFileChooser.APPROVE_OPTION) {
            archivo = jfcFoto.getSelectedFile();
            Image foto = getToolkit().getImage(String.valueOf(archivo));
            foto = foto.getScaledInstance(70, 70, Image.SCALE_DEFAULT);
            jLabelFoto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_jbSeleccionarFotoActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        // TODO add your handling code here:
        VentanaPrincipalProtectora vPrincipalProtectora = new VentanaPrincipalProtectora();
        this.setVisible(false);
        vPrincipalProtectora.setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jtaDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaDescripcionKeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < jtaDescripcion.getText().length(); i++) {
            if (jtaDescripcion.getText().isEmpty()) {
                jlNumChar.setText("0" + "/300");
            } else {
                jlNumChar.setText(jtaDescripcion.getText().length() + "/300");
            }
            if (jtaDescripcion.getText().length() > 300) {
                jlNumChar.setForeground(Color.red);
            } else {
                jlNumChar.setForeground(Color.black);
            }
        }
    }//GEN-LAST:event_jtaDescripcionKeyReleased

    private void jtfsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfsFocusGained
        // TODO add your handling code here:
        defaultBorders();
        jlError.setText("");
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
            java.util.logging.Logger.getLogger(VentanaEditarMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEditarMascota(protectora).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbSeleccionarFoto;
    private javax.swing.JButton jbVolver;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlNumChar;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jltitulo2;
    private javax.swing.JLabel jltitulo6;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfCodigo;
    // End of variables declaration//GEN-END:variables

    private void modificarCorrecto() {
        JOptionPane.showMessageDialog(this, "¡Mascota modificada correctamente!");
        jlNumChar.setText("0/300");
        jlError.setText("");
        jtaDescripcion.setBorder(null);
        jtaDescripcion.setText("");
        jLabelFoto.setIcon(null);
        archivo = null;
        defaultBorders();
    }

    private void defaultBorders() {
        jtaDescripcion.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextArea.border"));
        jtfCodigo.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jbSeleccionarFoto.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("Button.border"));
        jbEditar.setPreferredSize(new Dimension(jbEditar.getWidth(), jbEditar.getHeight()));
        jbEditar.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("Button.border"));
    }
}
