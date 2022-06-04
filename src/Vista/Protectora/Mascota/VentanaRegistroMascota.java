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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author UsuarioPracticas
 */
public class VentanaRegistroMascota extends javax.swing.JFrame {
    
    private MaskFormatter mascara;
    private static Protectora protectora;
    private File archivo;
    private Date fechaAdopcion;
    private Date fechaActual;

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistroMascota(Protectora protectora) {
        this.protectora = protectora;
        fechaActual = new Date();
        formatoFecha();
        initComponents();
        setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Resources/iconSC.png")).getImage();
        setIconImage(icon);
    }
    
    private void formatoFecha() {
        try {
            // TODO add your handling code here:
            mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholder("dd/mm/aaaa");
            mascara.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            Logger.getLogger(VentanaRegistroMascota.class.getName()).log(Level.SEVERE, null, ex);
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
        jbRegisrar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jtfCodigo = new javax.swing.JTextField();
        jcbEspecie = new javax.swing.JComboBox<>();
        jbSeleccionarFoto = new javax.swing.JButton();
        jftfFechaAcogida = new javax.swing.JFormattedTextField(mascara);
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jLabelFoto = new javax.swing.JLabel();
        jltitulo3 = new javax.swing.JLabel();

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
        jPanel1.add(jtfRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 150, 30));

        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        jbRegisrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbRegisrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/añadir.png"))); // NOI18N
        jbRegisrar.setText("Registrar");
        jbRegisrar.setToolTipText("Pulse este boton para registrase...");
        jbRegisrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegisrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 515, -1, 30));

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
        jPanel1.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, 30));

        jcbEspecie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Perro", "Gato", "Ave", "Otro" }));
        jPanel1.add(jcbEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 150, 30));

        jbSeleccionarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/busqueda25px.png"))); // NOI18N
        jbSeleccionarFoto.setText("Seleccionar");
        jbSeleccionarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarFotoActionPerformed(evt);
            }
        });
        jPanel1.add(jbSeleccionarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 160, 30));

        jftfFechaAcogida.setToolTipText("dd/mm/aaaa");
        jftfFechaAcogida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jftfFechaAcogida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jftfFechaAcogidaFocusLost(evt);
            }
        });
        jftfFechaAcogida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jftfFechaAcogidaMouseEntered(evt);
            }
        });
        jPanel1.add(jftfFechaAcogida, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 160, 30));

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
                jtaDescripcionFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jtaDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 250, 100));
        jPanel1.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 70, 70));

        jltitulo3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo3.setText("Registro de Mascota");
        jPanel1.add(jltitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 700, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegisrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisrarActionPerformed
        // TODO add your handling code here:

        if (jtfCodigo.getText().isEmpty() || jtfNombre.getText().isEmpty() || jcbEspecie.getSelectedItem().toString().equalsIgnoreCase("Seleccionar") == true || jtfRaza.getText().isEmpty() || jftfFechaAcogida.getText().equalsIgnoreCase("dd/mm/aaaa") == true || archivo == null || protectora.getCif() == null || jtaDescripcion.getText().isEmpty()) {
            errorCamposVacios();
        } else if (jtaDescripcion.getText().length() > 300) {
            jlError.setText("¡¡300 Caracteres max.!!");
        } else {
            obtenerDate();
            if (fechaAdopcion.before(fechaActual)) {
                String nombreMascota = jtfNombre.getText().trim();
                String codMascota = jtfCodigo.getText().trim();
                
                Mascota mascota = new Mascota(jtfCodigo.getText().trim(), jtfNombre.getText().trim(), jcbEspecie.getSelectedItem().toString(), jtfRaza.getText(), jftfFechaAcogida.getText(), SERVERIMAGENES + nombreMascota + "_" + codMascota + "." + obtenerExtension(archivo), protectora.getCif(), jtaDescripcion.getText());
                HttpRequest.insertarImage(archivo, jtfNombre.getText(), jtfCodigo.getText());
                if (GestionarMascota.insertarMascota(mascota).equals(CR_OK_INSERT)) {
                    registroCorrecto();
                }
            } else {
                jlError.setText("¡¡FECHA INCORRECCTA!!");
                jftfFechaAcogida.setBorder(new LineBorder(Color.red, 1));
            }
        }
    }//GEN-LAST:event_jbRegisrarActionPerformed
    
    private void registroCorrecto() {
        jbRegisrar.setPreferredSize(new Dimension(jbRegisrar.getWidth(), jbRegisrar.getHeight()));
        jbRegisrar.setBorder(new LineBorder(Color.green));
        jbRegisrar.setBorder(new LineBorder(Color.green, 1));
        jftfFechaAcogida.setText("dd/mm/aaaa");
        jtfCodigo.setText("");
        jtfNombre.setText("");
        jcbEspecie.setSelectedIndex(0);
        jLabelFoto.setIcon(null);
        jtaDescripcion.setText("");
        jtfRaza.setText("");
    }
    
    private void obtenerDate() {
        try {
            fechaAdopcion = new SimpleDateFormat("dd/MM/yyyy").parse(jftfFechaAcogida.getText());
        } catch (ParseException ex) {
            Logger.getLogger(VentanaRegistroMascota.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void errorCamposVacios() {
        jlError.setText("¡¡RELLENE TODOS LOS CAMPOS!!");
        jtfCodigo.setBorder(new LineBorder(Color.red, 1));
        jtfNombre.setBorder(new LineBorder(Color.red, 1));
        jcbEspecie.setBorder(new LineBorder(Color.red, 1));
        jtfRaza.setBorder(new LineBorder(Color.red, 1));
        jftfFechaAcogida.setBorder(new LineBorder(Color.red, 1));
        jbSeleccionarFoto.setBorder(new LineBorder(Color.red, 1));
        jtaDescripcion.setBorder(new LineBorder(Color.red, 1));
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
    

    private void jftfFechaAcogidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jftfFechaAcogidaMouseEntered
        mascara.setPlaceholder(" ");
    }//GEN-LAST:event_jftfFechaAcogidaMouseEntered

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        VentanaPrincipalProtectora vPrincipalProtectora = new VentanaPrincipalProtectora(protectora);
        this.setVisible(false);
        vPrincipalProtectora.setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jftfFechaAcogidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftfFechaAcogidaFocusLost
        mascara.setPlaceholder("dd/mm/aaaa");
    }//GEN-LAST:event_jftfFechaAcogidaFocusLost

    private void jtaDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaDescripcionFocusGained
        // TODO add your handling code here:
        jtaDescripcion.setText("");
    }//GEN-LAST:event_jtaDescripcionFocusGained
    
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

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
    private javax.swing.JButton jbRegisrar;
    private javax.swing.JButton jbSeleccionarFoto;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbEspecie;
    private javax.swing.JFormattedTextField jftfFechaAcogida;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jltitulo3;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRaza;
    // End of variables declaration//GEN-END:variables
}
