/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Protectora.Mascota;

import Controlador.Constantes;
import Controlador.HttpRequest;
import Controlador.Utilidades;
import Modelo.Mascota;
import Vista.Principal.VentanaPrincipalProtectora;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author UsuarioPracticas
 */
public class VentanaRegistroMascota extends javax.swing.JFrame {

    private MaskFormatter mascara;
    private Image foto;
    private File archivo;

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistroMascota() {
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

    private static boolean insertarMascota(Mascota mascota) {
        String values = "codIdentificador=" + mascota.getCodIdentificador() + "&nombre=" + mascota.getNombre() + "&especie=" + mascota.getEspecie() + "&raza=" + mascota.getRaza()
                + "&fechaAcogida=" + mascota.getFechaAcogida() + "&foto=" + mascota.getFoto() + "&cifProtectora=" + mascota.getCifProtectora()
                + "&descripcion=" + mascota.getDescripcion();
        String resultado = Controlador.HttpRequest.GET_REQUEST(Constantes.URL_INSERT_MASCOTA, values);
        System.out.println(resultado);
        if (resultado.equals("false")) {
            return false;
        }
        return true;
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
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Mascota");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jltitulo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo2.setText("Registro de Mascota");
        jPanel1.add(jltitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoSC.png"))); // NOI18N
        jPanel1.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlTitulo.setFont(new java.awt.Font("Segoe Print", 0, 52)); // NOI18N
        jlTitulo.setText("Second Chance");
        jPanel1.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jtfRaza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRazaActionPerformed(evt);
            }
        });
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
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jtfCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, 30));

        jcbEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        jftfFechaAcogida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfFechaAcogidaActionPerformed(evt);
            }
        });
        jPanel1.add(jftfFechaAcogida, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Descripción:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("(300 Char Max.)");
        jTextArea1.setToolTipText("");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 250, 100));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 70, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRazaActionPerformed

    private void jbRegisrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisrarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jbRegisrarActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoActionPerformed

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
            jLabel8.setIcon(new ImageIcon(foto));
            HttpRequest.insertarImage(archivo.getPath(), archivo);
        }
    }//GEN-LAST:event_jbSeleccionarFotoActionPerformed


    private void jftfFechaAcogidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfFechaAcogidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfFechaAcogidaActionPerformed

    private void jftfFechaAcogidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jftfFechaAcogidaMouseEntered
        mascara.setPlaceholder(" ");
    }//GEN-LAST:event_jftfFechaAcogidaMouseEntered

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        VentanaPrincipalProtectora vPrincipalProtectora = new VentanaPrincipalProtectora();
        this.setVisible(false);
        vPrincipalProtectora.setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jftfFechaAcogidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftfFechaAcogidaFocusLost
        mascara.setPlaceholder("dd/mm/aaaa");
    }//GEN-LAST:event_jftfFechaAcogidaFocusLost

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
                new VentanaRegistroMascota().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbRegisrar;
    private javax.swing.JButton jbSeleccionarFoto;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbEspecie;
    private javax.swing.JFormattedTextField jftfFechaAcogida;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jltitulo2;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRaza;
    // End of variables declaration//GEN-END:variables
}
