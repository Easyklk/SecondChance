/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Protectora;

import Controlador.Constantes;
import Controlador.GestionarProtectora;
import Controlador.GestionarUsuario;
import Modelo.Protectora;
import Modelo.Usuario;
import Vista.Principal.VentanaPrincipalAdmin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UsuarioPracticas
 */
public class VentanaEliminarProtectora extends javax.swing.JFrame implements Constantes {

    private DefaultTableModel modelo;

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaEliminarProtectora() {
        initComponents();
        modelo = (DefaultTableModel) jtProtectoras.getModel();
        jtProtectoras.getTableHeader().setFont(new Font("TAHOMA", Font.PLAIN, 14));
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
        jtfCif = new javax.swing.JTextField();
        jlError = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProtectoras = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jltitulo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Protectora...");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jltitulo2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo2.setText("Eliminar Protectora");
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
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 110, 35));

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

        jtfCif.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtfCif.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfCifFocusGained(evt);
            }
        });
        jPanel1.add(jtfCif, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 160, 40));

        jlError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/busqueda25px.png"))); // NOI18N
        jbBuscar.setToolTipText("Pulse este boton para buscar una protectora...");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, 40));

        jtProtectoras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtProtectoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CIF", "Email", "Nombre", "Razón Social"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProtectoras);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, 46));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CIF:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jltitulo3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo3.setText("Eliminar Protectora");
        jPanel1.add(jltitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling scode here:
        String cif = (String) jtProtectoras.getValueAt(0, 0);
        Protectora protectoraEliminar = GestionarProtectora.obtenerProtectoraCif(cif);
        Usuario usuario = GestionarUsuario.obtenerUsuario(protectoraEliminar.getEmail());
        if (jtProtectoras.getValueAt(0, 0) != null) {
            if (GestionarProtectora.eliminarPortectora(protectoraEliminar).equals(CR_OK_DELETE) && GestionarUsuario.eliminarUsuario(usuario).equals(CR_OK_DELETE)) {
                borradoCorrecto();
            } else {
                borradoIncorrecto();
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        if (!jtfCif.getText().isEmpty()) {
            defaultBorders();
            vaciarTabla();
            buscarProtectora();
        } else {
            jtfCif.setBorder(new LineBorder(Color.red, 1));
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void defaultBorders() {
        jtfCif.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jbEliminar.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("Button.border"));
        jlError.setText("");
    }

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        // TODO add your handling code here:
        VentanaPrincipalAdmin vPrincipalAdmin = new VentanaPrincipalAdmin();
        this.setVisible(false);
        vPrincipalAdmin.setVisible(true);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jtfCifFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCifFocusGained
        // TODO add your handling code here:
        jbEliminar.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("Button.border"));
        jtfCif.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jlError.setText("");
    }//GEN-LAST:event_jtfCifFocusGained

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
            java.util.logging.Logger.getLogger(VentanaEliminarProtectora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarProtectora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarProtectora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarProtectora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEliminarProtectora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jltitulo2;
    private javax.swing.JLabel jltitulo3;
    private javax.swing.JTable jtProtectoras;
    private javax.swing.JTextField jtfCif;
    // End of variables declaration//GEN-END:variables

    private void vaciarTabla() {
        // TODO add your handling code here:ç
        if (modelo.getRowCount() > 0) {
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }
        }
    }

    private void buscarProtectora() {
        try {
            jlError.setText("");
            Protectora protectora = GestionarProtectora.obtenerProtectoraCif(jtfCif.getText().trim());
            modelo = (DefaultTableModel) jtProtectoras.getModel();
            Object[] ob = new Object[4];
            ob[0] = protectora.getCif();
            ob[1] = protectora.getEmail();
            ob[2] = protectora.getRazonSocial();
            ob[3] = protectora.getNombreProtectora();
            modelo.addRow(ob);
            jtProtectoras.setModel(modelo);
            jbEliminar.setEnabled(true);
        } catch (NullPointerException e) {
            jlError.setText("¡La protectora no existe!");
        }

    }

    private void borradoCorrecto() {
        jlError.setText("");
        jtfCif.setText("");
        jbEliminar.setPreferredSize(new Dimension(jbEliminar.getWidth(), jbEliminar.getHeight()));
        jbEliminar.setBorder(new LineBorder(Color.green));
    }

    private void borradoIncorrecto() {
        jlError.setText("¡¡Elimine las mascotas antes!!");
        jtfCif.setBorder(new LineBorder(Color.red));
        jbEliminar.setPreferredSize(new Dimension(jbEliminar.getWidth(), jbEliminar.getHeight()));
        jbEliminar.setBorder(new LineBorder(Color.red));
    }
}
