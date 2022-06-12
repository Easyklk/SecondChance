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
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author UsuarioPracticas
 */
public class VentanaRegistroMascota extends javax.swing.JFrame {

    private static Protectora protectora;
    private File archivo;
    private SimpleDateFormat sdf;
    private Date fechaAdopcion;
    private Date fechaActual;

    /**
     * Creates new form VentanaRegistro
     *
     * @param protectora Protectora que ha iniciado sesión
     */
    public VentanaRegistroMascota(Protectora protectora) {
        VentanaRegistroMascota.protectora = protectora;
        initComponents();
        otherComponents();
    }

    private void otherComponents() {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        jdcFechaAcogida.setLocale(new Locale("es"));
        fechaActual = new Date();
        jdcFechaAcogida.setMaxSelectableDate(fechaActual);
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
        jlError = new javax.swing.JLabel();
        jlLogo = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jtfRaza = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbRegistrar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jtfCodigo = new javax.swing.JTextField();
        jcbEspecie = new javax.swing.JComboBox<>();
        jbSeleccionarFoto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabelFoto = new javax.swing.JLabel();
        jltitulo3 = new javax.swing.JLabel();
        jdcFechaAcogida = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Mascota");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlError.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoSC.png"))); // NOI18N
        jPanel1.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlTitulo.setFont(new java.awt.Font("Segoe Print", 0, 52)); // NOI18N
        jlTitulo.setText("Second Chance");
        jPanel1.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jtfRaza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfRaza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                componentsFocusGained(evt);
            }
        });
        jtfRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfsKeyTyped(evt);
            }
        });
        jPanel1.add(jtfRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 150, 30));

        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                componentsFocusGained(evt);
            }
        });
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfsKeyTyped(evt);
            }
        });
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 150, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Especie:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Raza:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de Acogida:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Foto:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jbRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/añadir.png"))); // NOI18N
        jbRegistrar.setText("Registrar");
        jbRegistrar.setToolTipText("Pulse este boton para registrase...");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 515, -1, 30));

        jbVolver.setBackground(new java.awt.Color(255, 255, 255));
        jbVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/volver.png"))); // NOI18N
        jbVolver.setToolTipText("Pulse este boton para ir al menu principal...");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jtfCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                componentsFocusGained(evt);
            }
        });
        jPanel1.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, 30));

        jcbEspecie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Perro", "Gato", "Otro" }));
        jcbEspecie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                componentsFocusGained(evt);
            }
        });
        jPanel1.add(jcbEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 150, 30));

        jbSeleccionarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/busqueda25px.png"))); // NOI18N
        jbSeleccionarFoto.setText("Seleccionar");
        jbSeleccionarFoto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                componentsFocusGained(evt);
            }
        });
        jbSeleccionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarFotoActionPerformed(evt);
            }
        });
        jPanel1.add(jbSeleccionarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Descripción:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setLineWrap(true);
        jtaDescripcion.setRows(5);
        jtaDescripcion.setToolTipText("");
        jtaDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                componentsFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jtaDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 250, 100));
        jPanel1.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 70, 70));

        jltitulo3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo3.setText("Registro de Mascota");
        jPanel1.add(jltitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jdcFechaAcogida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                componentsFocusGained(evt);
            }
        });
        jPanel1.add(jdcFechaAcogida, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
        if (jtfCodigo.getText().isEmpty() || jtfNombre.getText().isEmpty() || 
                jcbEspecie.getSelectedItem().toString().equalsIgnoreCase("Seleccionar") == true 
                || jtfRaza.getText().isEmpty() || archivo == null || protectora.getCif() == null || jtaDescripcion.getText().isEmpty()) {
            errorCamposVacios();
        } else if (jtaDescripcion.getText().length() > 300) {
            jlError.setText("¡¡300 Caracteres max.!!");
        } else {
            if (GestionarMascota.obtenerMascotaCod(jtfCodigo.getText().trim()) == null) {
                String fechaString = sdf.format(jdcFechaAcogida.getDate());
                String nombreMascota = jtfNombre.getText().trim();
                String codMascota = jtfCodigo.getText().trim();
                Mascota mascota = new Mascota(jtfCodigo.getText().trim(), jtfNombre.getText().trim(), 
                        jcbEspecie.getSelectedItem().toString(), jtfRaza.getText(), fechaString, 
                        SERVERIMAGENES + nombreMascota + "_" + codMascota + "." + obtenerExtension(archivo), protectora.getCif(), jtaDescripcion.getText());
                if (GestionarMascota.insertarMascota(mascota).equals(CR_OK_INSERT)) {
                    HttpRequest.insertarImage(archivo, jtfNombre.getText(), jtfCodigo.getText());
                    registroCorrecto();
                }
            } else {
                jlError.setText("¡¡Ya existe una mascota con ese codigo!!");
                jbRegistrar.setBorder(new LineBorder(Color.red));
            }
        }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void registroCorrecto() {
        JOptionPane.showMessageDialog(this, "¡Mascota registrada correctamente!");
        jbRegistrar.setPreferredSize(new Dimension(jbRegistrar.getWidth(), jbRegistrar.getHeight()));
        jbRegistrar.setBorder(new LineBorder(Color.green));
        defaultBorders();
        vaciarCampos();
    }

    private void vaciarCampos() {
        jtfCodigo.setText("");
        jtfNombre.setText("");
        jcbEspecie.setSelectedIndex(0);
        jLabelFoto.setIcon(null);
        jdcFechaAcogida.setDate(null);
        jtaDescripcion.setText("");
        jtfRaza.setText("");
        jlError.setText("");
    }

    private void errorCamposVacios() {
        jlError.setText("¡¡RELLENE TODOS LOS CAMPOS!!");
        jtfCodigo.setBorder(new LineBorder(Color.red, 1));
        jdcFechaAcogida.setBorder(new LineBorder(Color.red, 1));
        jtfNombre.setBorder(new LineBorder(Color.red, 1));
        jcbEspecie.setBorder(new LineBorder(Color.red, 1));
        jtfRaza.setBorder(new LineBorder(Color.red, 1));
        jbSeleccionarFoto.setBorder(new LineBorder(Color.red, 1));
        jtaDescripcion.setBorder(new LineBorder(Color.red, 1));
    }

    /**
     * Metodo para seleccionar una foto desde la carpeta de imagenes del usuario
     */
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
        VentanaPrincipalProtectora vPrincipalProtectora = new VentanaPrincipalProtectora(protectora);
        this.setVisible(false);
        vPrincipalProtectora.setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void componentsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_componentsFocusGained
        // TODO add your handling code here:
        jbRegistrar.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("Button.border"));
        jlError.setText("");
        defaultBorders();
    }//GEN-LAST:event_componentsFocusGained

    private void jtfsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfsKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            jtfNombre.setEditable(true);
            jtfRaza.setEditable(true);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfsKeyTyped

    /**
     * Obtiene la extension de la imagen a subir
     *
     * @param File fichero de la imagen
     * @return extension del fichero
     */
    private static String obtenerExtension(File file) {
        String extension = "";
        int i = file.getName().lastIndexOf('.');
        if (i > 0) {
            extension = file.getName().substring(i + 1);
        }
        return extension;
    }

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
            java.util.logging.Logger.getLogger(VentanaRegistroMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>s

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroMascota(protectora).setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbSeleccionarFoto;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbEspecie;
    private com.toedter.calendar.JDateChooser jdcFechaAcogida;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jltitulo3;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRaza;
    // End of variables declaration//GEN-END:variables

    private void defaultBorders() {
        jtfNombre.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfCodigo.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jtfRaza.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jcbEspecie.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("ComboBox.border"));
        jtaDescripcion.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextArea.border"));
        jdcFechaAcogida.setBorder(new EmptyBorder(1, 1, 1, 1));
        jbSeleccionarFoto.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("Button.border"));
    }
}
