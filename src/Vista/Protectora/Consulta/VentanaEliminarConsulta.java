/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Protectora.Consulta;

import Controlador.GestionarConsulta;
import Modelo.Consulta;
import Vista.Principal.VentanaPrincipalProtectora;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Isaac-PC
 */
public class VentanaEliminarConsulta extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaEliminarConsulta() {
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
        jltitulo2 = new javax.swing.JLabel();
        jlLogo = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jtaListado = new javax.swing.JTextArea();
        jtfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Mascota");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jltitulo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo2.setText("Eliminar Consulta");
        jPanel1.add(jltitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoSC.png"))); // NOI18N
        jPanel1.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlTitulo.setFont(new java.awt.Font("Segoe Print", 0, 52)); // NOI18N
        jlTitulo.setText("Second Chance");
        jPanel1.add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jbEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/borrar.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setToolTipText("Pulse este boton para eliminar la protectora...");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 100, 50));

        jbVolver.setBackground(new java.awt.Color(255, 255, 255));
        jbVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/volver.png"))); // NOI18N
        jbVolver.setToolTipText("Pulse este boton para ir al menu principal...");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jtaListado.setColumns(20);
        jtaListado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtaListado.setRows(5);
        jtaListado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jtaListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 380, 80));

        jtfCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 160, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Código:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/busqueda25px.png"))); // NOI18N
        jbBuscar.setToolTipText("Pulse este boton para buscar una protectora...");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        Consulta consulta = GestionarConsulta.obtenerConsultaCod(jtfCodigo.getText().trim());
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        // TODO add your handling code here:
        VentanaPrincipalProtectora vPrincipalProtectora = new VentanaPrincipalProtectora();
        this.setVisible(false);
        vPrincipalProtectora.setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEliminarConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEliminarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jltitulo2;
    private javax.swing.JTextArea jtaListado;
    private javax.swing.JTextField jtfCodigo;
    // End of variables declaration//GEN-END:variables
}
