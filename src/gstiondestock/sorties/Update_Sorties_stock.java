/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gstiondestock.sorties;

import gstiondestock.Client.Ajout_Client;
import gstiondestock.Entre.*;
import gstiondestock.produit.add_Produit;
import gstiondestock.Fournisseurs.add_fournisseurs;

import gstiondestock.Db;
import static gstiondestock.Famille.add_famille.RET_OK;
import gstiondestock.message;
import static gstiondestock.produit.update_produit.RET_OK;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author bel
 */
public class Update_Sorties_stock extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;
    int ids = -1;
    float oldqte=0;

    /**
     * Creates new form add_Produit
     */
    public Update_Sorties_stock(javax.swing.JDialog parent, boolean modal,int ide,String nom_p,String nom_fo,float qut,float prix_A) {
        super(parent, modal);
        initComponents();
         Db.getConnection();
     this.ids=ide;
     oldqte=qut;
     txt_Qte_entre.setText(""+qut);
     txt_Prix_Achat_entre.setText(""+prix_A);
     Db.RemplirِComboBox(CBox_entre_produit,"SELECT nom_pro AS nom  FROM produits ORDER BY   id_pro DESC");
     Db.RemplirِComboBox(CBox_Client, "SELECT nom_fournisseurs AS nom  FROM fournisseurs ORDER BY   id_fournisseurs  DESC");
     CBox_entre_produit.setSelectedItem(nom_p);
     CBox_Client.setSelectedItem(nom_p);

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }
     public Update_Sorties_stock(javax.swing.JFrame parent, boolean modal,int ide,String nom_p,String nom_fu,float qut,float prix_A) {
        super(parent, modal);
        initComponents();
         Db.getConnection();
     this.ids=ide;
     oldqte=qut;
     txt_Qte_entre.setText(""+qut);
     txt_Prix_Achat_entre.setText(""+prix_A);
     Db.RemplirِComboBox(CBox_entre_produit,"SELECT nom_pro AS nom  FROM produits ORDER BY   id_pro DESC");
     Db.RemplirِComboBox(CBox_Client, "SELECT nom_client AS nom  FROM clients ORDER BY   id_client  DESC");
     CBox_entre_produit.setSelectedItem(nom_p);
     CBox_Client.setSelectedItem(nom_p);

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txt_Qte_entre = new javax.swing.JTextField();
        txt_Prix_Achat_entre = new javax.swing.JTextField();
        CBox_entre_produit = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CBox_Client = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_add_product = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(38, 45, 53));

        txt_Qte_entre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Qte_entreKeyTyped(evt);
            }
        });

        txt_Prix_Achat_entre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Prix_Achat_entreKeyTyped(evt);
            }
        });

        CBox_entre_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_entre_produitActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ajout Client");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 157, 215));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modification Sorties De Stock");

        CBox_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_ClientActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ajout Produit");
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("prix");

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("produit");

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Client");

        jPanel3.setBackground(new java.awt.Color(63, 157, 215));

        btn_add_product.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btn_add_product.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_product.setText("Enregistrer");
        btn_add_product.setContentAreaFilled(false);
        btn_add_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_productActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_add_product, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_add_product, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CBox_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_Prix_Achat_entre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBox_entre_produit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Qte_entre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txt_Qte_entre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Prix_Achat_entre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3)
                                .addComponent(CBox_entre_produit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBox_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(62, 62, 62)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(500, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void btn_add_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_productActionPerformed
        // TODO add your handling code here:
        String qte =txt_Qte_entre.getText();
        String prix =txt_Prix_Achat_entre.getText();
        if (qte.equals("") || prix.equals("") ) {
            message d=new message(this,true,"Remplissez toutes les cases");
            d.setVisible(true);
        }else{
String  sql;
        float qte_sortie=Float.parseFloat(this.txt_Qte_entre.getText());
        float prix_V=Float.parseFloat(this.txt_Prix_Achat_entre.getText());
        String nom_pro =this.CBox_entre_produit.getSelectedItem().toString();
        String nom_client =this.CBox_Client.getSelectedItem().toString();
       sql="SELECT id_pro AS id FROM produits WHERE nom_pro='"+nom_pro+"'";
        int id_Pro=Db.getIdByName(sql);
       sql="SELECT id_client AS id FROM clients WHERE nom_client='"+nom_client+"'";
        int id_client=Db.getIdByName(sql);
      
        
               sql ="UPDATE produits SET qte_stock =qte_stock+"+oldqte+" WHERE id_pro="+id_Pro;   
           
         Db.Update(sql);
        sql="SELECT qte_stock AS flot FROM produits WHERE archivage_pro=0 AND nom_pro='"+nom_pro+"'";

       double qte_now=Db.Statistiqueff(sql);
             if(qte_sortie <=qte_now)  {
           
         sql ="UPDATE produits SET qte_stock =qte_stock-"+qte_sortie+" WHERE id_pro="+id_Pro;  
                   

        boolean b= Db.Update(sql);
        if (b) {
            
         sql="UPDATE sorte SET id_client="+id_client+",qte_sorte="+qte_sortie+",id_pro="+id_Pro+",prix_vente="+prix_V+" WHERE id="+ids;

         b= Db.Update(sql);
        if (b) {
            message d=new message(this,true,"Modification enregistrée");
            d.setVisible(true);
           doClose(RET_OK);
        }else{
            message d=new message(this,true,"N'a pas enregistré la modification");
            d.setVisible(true);
       }
        
       }else{
          message d=new message(this,true,"N'a pas enregistré la modification");
            d.setVisible(true);
       }
    }else{
           sql ="UPDATE produits SET qte_stock =qte_stock-"+oldqte+" WHERE id_pro="+id_Pro;             
            Db.Update(sql);
            message d=new message(this,true,"Quantité non disponible");
            d.setVisible(true);
            }
      
        }


    }//GEN-LAST:event_btn_add_productActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Ajout_Client  g= new Ajout_Client(new javax.swing.JFrame(),true);
        g.setVisible(true);
        String sql="SELECT nom_client AS nom  FROM clients ORDER BY   id_client  DESC";
        Db.RemplirِComboBox(CBox_Client,sql);
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CBox_entre_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_entre_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBox_entre_produitActionPerformed

    private void CBox_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_ClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBox_ClientActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
           add_Produit  g= new add_Produit(new javax.swing.JFrame(),true);
        g.setVisible(true);
        String sql="SELECT nom_pro AS nom FROM produits WHERE archivage_pro=0 ORDER BY id_pro DESC";
         Db.RemplirِComboBox(CBox_entre_produit,sql);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        doClose(RET_CANCEL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_Qte_entreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Qte_entreKeyTyped
        // TODO add your handling code here:
         char char_input = evt.getKeyChar();
            String ss=txt_Qte_entre.getText();
                   
        if ((!Character.isDigit(char_input)) ) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_Qte_entreKeyTyped

    private void txt_Prix_Achat_entreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Prix_Achat_entreKeyTyped
      
         char char_input = evt.getKeyChar();
            String ss=txt_Prix_Achat_entre.getText();
                   
        if ((!Character.isDigit(char_input))) {
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_Prix_Achat_entreKeyTyped
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBox_Client;
    private javax.swing.JComboBox<String> CBox_entre_produit;
    private javax.swing.JButton btn_add_product;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_Prix_Achat_entre;
    private javax.swing.JTextField txt_Qte_entre;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}