/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gstiondestock.Famille;

import gstiondestock.Db;
import gstiondestock.Dialog;
import gstiondestock.Home;
import static gstiondestock.Famille.add_famille.RET_OK;
import static gstiondestock.Famille.up_famille.RET_OK;
import gstiondestock.message;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author bel
 */
public class Show_Famille extends javax.swing.JFrame {

    /**
     * Creates new form FALLILE
     */
    public Show_Famille() {
        initComponents();
        getFamille("");

    }

    private void getFamille(String searsh) {
        boolean state = is_archiver.isSelected();
        String sql = "";
        if (searsh == "") {
            sql = "SELECT id_familles AS ID, nom_familles AS NOM FROM familles WHERE archivage=" + state;
        } else {
            sql = "SELECT id_familles AS ID, nom_familles AS NOM FROM familles WHERE archivage=" + state + " AND nom_familles LIKE '" + searsh + "%'";
        }

        ResultSet rs = Db.SelectAll(sql);
        tab_famillles.setModel(DbUtils.resultSetToTableModel(rs));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_famillles = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ar = new javax.swing.JButton();
        is_archiver = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jTextFiel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(38, 45, 53));

        tab_famillles.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        tab_famillles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_famillles.setToolTipText("");
        tab_famillles.setShowHorizontalLines(false);
        tab_famillles.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tab_famillles);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/archive_1.png"))); // NOI18N
        ar.setContentAreaFilled(false);
        ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arActionPerformed(evt);
            }
        });

        is_archiver.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        is_archiver.setForeground(new java.awt.Color(255, 255, 255));
        is_archiver.setText("Archivage");
        is_archiver.setContentAreaFilled(false);
        is_archiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                is_archiverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 157, 215));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fmilles");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 204, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(63, 157, 215));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jTextFiel.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jTextFiel.setToolTipText("");
        jTextFiel.setBorder(null);
        jTextFiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielActionPerformed(evt);
            }
        });
        jTextFiel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFielKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rechercher");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFiel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(is_archiver, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFiel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(is_archiver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(962, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add_famille your handling code here:

        add_famille g = new add_famille(this, true);
        g.setVisible(true);
        getFamille("");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add_famille your handling code here:
        jTextFiel.setText("");

        int row = tab_famillles.getSelectedRow();

        if (row != -1) {
            String s = tab_famillles.getModel().getValueAt(row, 0).toString();
            String nom = tab_famillles.getModel().getValueAt(row, 1).toString();
            int id = Integer.parseInt(s);
            up_famille g = new up_famille(this, true, id, nom);
            g.setVisible(true);

        } else {
            message d = new message(this, true, "Choisissez la ligne que vous souhaitez modifier");
            d.setVisible(true);
            // selct line
        }

        getFamille("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arActionPerformed
        // TODO add your handling code here:
        jTextFiel.setText("");

        int row = tab_famillles.getSelectedRow();
        if (row != -1) {
            String s = tab_famillles.getModel().getValueAt(row, 0).toString();
            int id = Integer.parseInt(s);

            boolean state = !is_archiver.isSelected();
            String sql = "UPDATE familles SET archivage=" + state + " WHERE id_familles=" + id;

            if (Db.Update(sql)) {
                sql = "UPDATE produits SET archivage_pro=" + state + " WHERE id_familles=" + id;
                if (Db.Update(sql)) {
                    if (state) {
                        getFamille("");
                        message d = new message(this, true, "Archivage avac succes");
                        d.setVisible(true);

                    } else {
                        getFamille("");
                        message d = new message(this, true, "Extrait des archives");
                        d.setVisible(true);

                    }
                }
            } else {
                if (state) {
                    message d = new message(this, true, "Ne pas Archivage");
                    d.setVisible(true);
                } else {
                    message d = new message(this, true, "Ne pas Extrait des archives");
                    d.setVisible(true);

                }
            }

        } else {
            message d = new message(this, true, "Choisissez la ligne que vous souhaitez archivage");
            d.setVisible(true);
            // selct line
        }

    }//GEN-LAST:event_arActionPerformed

    private void is_archiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_is_archiverActionPerformed
        // TODO add your handling code here:
        jTextFiel.setText("");
        getFamille("");

    }//GEN-LAST:event_is_archiverActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextFielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFielActionPerformed

    private void jTextFielKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielKeyTyped
        String searsh = jTextFiel.getText();
        getFamille(searsh);

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox is_archiver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFiel;
    private javax.swing.JTable tab_famillles;
    // End of variables declaration//GEN-END:variables
}
