/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Protectora.Mascota;

import static Controlador.Constantes.CR_OK_DELETE;
import Controlador.GestionarMascota;
import Modelo.Mascota;
import Modelo.Protectora;
import Vista.Principal.VentanaPrincipalProtectora;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UsuarioPracticas
 */
public class VentanaEliminarMascota extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private static Protectora protectora;

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaEliminarMascota(Protectora protectora) {
        initComponents();
        otherComponents(protectora);
    }

    private void otherComponents(Protectora protectora1) {
        this.protectora = protectora1;
        setLocationRelativeTo(null);
        modelo = (DefaultTableModel) jtMascota.getModel();
        jtMascota.setAutoResizeMode(jtMascota.AUTO_RESIZE_ALL_COLUMNS);
        jtMascota.getTableHeader().setFont(new Font("TAHOMA", Font.PLAIN, 14));
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
        jlError = new javax.swing.JLabel();
        jlLogo = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jtfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMascota = new javax.swing.JTable();
        jltitulo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Mascota");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, 20));

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
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, 40));

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

        jtfCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 160, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/busqueda25px.png"))); // NOI18N
        jbBuscar.setToolTipText("Pulse este boton para buscar una protectora...");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, 40));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtMascota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nombre", "Especie", "Raza", "Fecha Acogida", "CIF Protectora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtMascota);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 520, 70));

        jltitulo3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jltitulo3.setText("Eliminar Mascota");
        jPanel1.add(jltitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        String codMascota = (String) jtMascota.getValueAt(0, 0);
        Mascota mascotaEliminar = GestionarMascota.obtenerMascotaCodCifProtectora(codMascota, protectora.getCif());
        if (jtMascota.getValueAt(0, 0) != null) {
            if (GestionarMascota.eliminarConsulta(mascotaEliminar).equals(CR_OK_DELETE)) {
                borradoCorrecto();
            } else {
                borradoIncorrecto();
            }
        } else {
            System.out.println("aaaaa");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        if (!jtfCodigo.getText().isEmpty()) {
            defaultBorders();
            vaciarTabla();
            buscarMascota();
        } else {
            jtfCodigo.setBorder(new LineBorder(Color.red, 1));
        }
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
            java.util.logging.Logger.getLogger(VentanaEliminarMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarMascota.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEliminarMascota(protectora).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jltitulo3;
    private javax.swing.JTable jtMascota;
    private javax.swing.JTextField jtfCodigo;
    // End of variables declaration//GEN-END:variables

    private void borradoCorrecto() {
        JOptionPane.showMessageDialog(this, "¡Mascota eliminada correctamente!");
        jbEliminar.setEnabled(false);
        jlError.setText("");
        jtfCodigo.setText("");
        jtMascota.setModel(null);
        jbEliminar.setPreferredSize(new Dimension(jbEliminar.getWidth(), jbEliminar.getHeight()));
        jbEliminar.setBorder(new LineBorder(Color.green));
    }

    private void borradoIncorrecto() {
        jlError.setText("¡¡ERROR!!");
        jtMascota.setModel(null);
        jtfCodigo.setBorder(new LineBorder(Color.red));
        jbEliminar.setPreferredSize(new Dimension(jbEliminar.getWidth(), jbEliminar.getHeight()));
        jbEliminar.setBorder(new LineBorder(Color.red));
    }

    private void defaultBorders() {
        jtfCodigo.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        jbEliminar.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("Button.border"));
        jlError.setText("");
    }

    private void vaciarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

    }

    private void buscarMascota() {
        try {
            jlError.setText("");
            Mascota mascota = GestionarMascota.obtenerMascotaCodCifProtectora(jtfCodigo.getText().trim(), protectora.getCif());
            System.out.println(mascota);
            modelo = (DefaultTableModel) jtMascota.getModel();
            Object[] ob = new Object[6];
            ob[0] = mascota.getCodIdentificador();
            ob[1] = mascota.getNombre();
            ob[2] = mascota.getEspecie();
            ob[3] = mascota.getRaza();
            ob[4] = mascota.getFechaAcogida();
            ob[5] = mascota.getCifProtectora();
            modelo.addRow(ob);
            jtMascota.setModel(modelo);
            jbEliminar.setEnabled(true);
        } catch (NullPointerException e) {
            jbEliminar.setEnabled(false);
            jlError.setText("¡La Mascota no existe!");
        }
    }
}
