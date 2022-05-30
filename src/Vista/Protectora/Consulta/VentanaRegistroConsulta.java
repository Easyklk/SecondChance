/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Protectora.Consulta;

import Controlador.GestionarConsulta;
import Modelo.Consulta;
import Vista.Principal.VentanaPrincipalProtectora;
import Vista.Protectora.Mascota.VentanaRegistroMascota;
import java.awt.Color;
import java.awt.Image;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Isaac-PC
 */
public class VentanaRegistroConsulta extends javax.swing.JFrame {

    private MaskFormatter mascara;
    private Consulta consulta;

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistroConsulta() {
        formatoFecha();
        initComponents();
        rellenarComboBox();
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

    public void rellenarComboBox() {
        jcbHora.addItem("00");
        for (int i = 1; i <= 23; i++) {
            jcbHora.addItem(String.valueOf(i));
        }
        jcbMinutos.addItem("00");
        for (int i = 1; i <= 59; i++) {
            jcbMinutos.addItem(String.valueOf(i));
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
        jtfDniVoluntario = new javax.swing.JTextField();
        jtfCodMascota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbRegisrar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jftfFecha = new javax.swing.JFormattedTextField(mascara);
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaInformacion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jlNumChar = new javax.swing.JLabel();
        jcbMinutos = new javax.swing.JComboBox<>();
        jcbHora = new javax.swing.JComboBox<>();
        jltitulo3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Consulta");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(null);
        setPreferredSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoSC.png"))); // NOI18N
        jPanel1.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlTitulo.setFont(new java.awt.Font("Segoe Print", 0, 52)); // NOI18N
        jlTitulo.setText("Second Chance");
        jPanel1.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jtfDniVoluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfDniVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniVoluntarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtfDniVoluntario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 150, 30));

        jtfCodMascota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfCodMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código de mascota:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DNI Voluntario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText(":");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        jbRegisrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbRegisrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/añadir.png"))); // NOI18N
        jbRegisrar.setText("Registrar");
        jbRegisrar.setToolTipText("Pulse este boton para registrase una nueva consulta...");
        jbRegisrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegisrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, 30));

        jbVolver.setBackground(new java.awt.Color(255, 255, 255));
        jbVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/volver.png"))); // NOI18N
        jbVolver.setToolTipText("Pulse este boton para ir al menu principal...");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jftfFecha.setToolTipText("Desde HH:MM - Hasta HH:MM");
        jftfFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jftfFechaFocusLost(evt);
            }
        });
        jftfFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jftfFechaMouseEntered(evt);
            }
        });
        jftfFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfFechaActionPerformed(evt);
            }
        });
        jPanel1.add(jftfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Información:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtaInformacion.setColumns(20);
        jtaInformacion.setLineWrap(true);
        jtaInformacion.setRows(5);
        jtaInformacion.setText("(300 Char Max.)");
        jtaInformacion.setToolTipText("");
        jtaInformacion.setBorder(null);
        jtaInformacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtaInformacionFocusGained(evt);
            }
        });
        jtaInformacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtaInformacionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtaInformacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 250, 210));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 70, 70));

        jlNumChar.setText("0/300");
        jPanel1.add(jlNumChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        jPanel1.add(jcbMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        jPanel1.add(jcbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jltitulo3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo3.setText("Registro de Consulta");
        jPanel1.add(jltitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Hora:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDniVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDniVoluntarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDniVoluntarioActionPerformed

    private void jbRegisrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisrarActionPerformed
        // TODO add your handling code here:
        if (jtfCodMascota.getText().isEmpty() || jtfDniVoluntario.getText().isEmpty()
                || jftfFecha.getText().isEmpty() || jtaInformacion.getText().isEmpty()) {
            jlError.setText("¡RELLENE TODOS LOS CAMPOS!");
            jtfCodMascota.setBorder(new LineBorder(Color.red, 1));
            jtfDniVoluntario.setBorder(new LineBorder(Color.red, 1));
            jtaInformacion.setBorder(new LineBorder(Color.red, 1));
            jftfFecha.setBorder(new LineBorder(Color.red, 1));
        } else {
            String horario = jftfFecha.getText().trim() + " " + jcbHora.getSelectedIndex() + ":" + jcbMinutos.getSelectedItem();
            consulta = new Consulta(jtfCodMascota.getText().trim(), jtfDniVoluntario.getText().trim(), horario, jtaInformacion.getText().trim());
//            System.out.println(GestionarConsulta.insertarConsulta(consulta));
            System.out.println(consulta.toString());
        }
    }//GEN-LAST:event_jbRegisrarActionPerformed


    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        VentanaPrincipalProtectora vPrincipalProtectora = new VentanaPrincipalProtectora();
        this.setVisible(false);
        vPrincipalProtectora.setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jftfFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfFechaActionPerformed

    private void jftfFechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jftfFechaMouseEntered
        mascara.setPlaceholder(" ");
    }//GEN-LAST:event_jftfFechaMouseEntered

    private void jftfFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftfFechaFocusLost
        mascara.setPlaceholder("HH:MM - HH:MM");
    }//GEN-LAST:event_jftfFechaFocusLost

    private void jtaInformacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaInformacionFocusGained
        // TODO add your handling code here:
        jtaInformacion.setText("");
    }//GEN-LAST:event_jtaInformacionFocusGained

    private void jtaInformacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaInformacionKeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < jtaInformacion.getText().length(); i++) {
            jlNumChar.setText(jtaInformacion.getText().length() + "/300");
            if (jtaInformacion.getText().length() > 300) {
                jlNumChar.setForeground(Color.red);
            } else {
                jlNumChar.setForeground(Color.black);
            }
        }
    }//GEN-LAST:event_jtaInformacionKeyReleased

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
            java.util.logging.Logger.getLogger(VentanaRegistroConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbRegisrar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbHora;
    private javax.swing.JComboBox<String> jcbMinutos;
    private javax.swing.JFormattedTextField jftfFecha;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlNumChar;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jltitulo3;
    private javax.swing.JTextArea jtaInformacion;
    private javax.swing.JTextField jtfCodMascota;
    private javax.swing.JTextField jtfDniVoluntario;
    // End of variables declaration//GEN-END:variables
}
