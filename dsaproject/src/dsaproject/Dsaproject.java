/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsaproject;

/**
 *
 * @author MILINDA
 */

import java.util.Vector;
//import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractAction.*;
//import java.awt.GridLayout;
//import java.awt.HeadlessException;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    Vector det = new Vector();
    Vector det1 = new Vector(); 
    Vector n1;   
    
    public Home() {
        initComponents();      
        
                  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        txtisbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbtitle = new javax.swing.JComboBox();
        btnInsert = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBook = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtbookname = new javax.swing.JTextField();
        txtsearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("ISBN");

        txtisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtisbnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Author F Name");

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Author S Name");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Title");

        cmbtitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Java", "Php" }));
        cmbtitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtitleActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "fname", "sname", "title", "bookname"
            }
        ));
        jScrollPane1.setViewportView(tableBook);

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Book Name");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtbookname, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtisbn)
                                            .addComponent(txtfname)
                                            .addComponent(txtsname)
                                            .addComponent(cmbtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel5))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtbookname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtisbnActionPerformed(java.awt.event.ActionEvent evt) {                                        
      
        
        
    }                                       

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {                                          
         
       // public string test ;
        n1 = new Vector();
        
        n1.add(txtisbn.getText());
        n1.add(txtfname.getText());
        n1.add(txtsname.getText());
        n1.add(txtbookname.getText());
        n1.add(cmbtitle.getSelectedItem().toString());
        
        if((txtisbn.getText().length()==0))
            JOptionPane.showMessageDialog(null, "Enter ISBN ");
        else if(txtfname.getText().length()==0) {       
            n1.add(txtfname.getText());
            JOptionPane.showMessageDialog(null, " Enter Author first Name ");
        }
 
        else if(txtsname.getText().length()==0) {       
            n1.add(txtsname.getText());
            JOptionPane.showMessageDialog(null, "Enter Author Sur Name ");
        }
        else if(txtbookname.getText().length()==0) {       
            n1.add(txtbookname.getText());
            JOptionPane.showMessageDialog(null, "Enter Enter Book Name ");
        }
   
        else{
       // n1.add(cmbtitle.getSelectedItem().toString());
        //n1.add(txtbookname.getText());        
        
        det.add(n1);
        System.out.println(det);
               
        
        det1.add(txtisbn.getText());  
        JOptionPane.showMessageDialog(null, "successfully inserted");
        clearTextFields();
        
        DefaultTableModel model= (DefaultTableModel) tableBook.getModel();
        n1.add(txtisbn.getText());
        n1.add(txtfname.getText());
        n1.add(txtsname.getText());
        n1.add(cmbtitle.getSelectedItem().toString());
        n1.add(txtbookname.getText());
        
        model.addRow(n1);
        
        
        }
    }                                         

    public void clearTextFields(){
        txtisbn.setText("");
        txtsname.setText("");
        txtfname.setText("");
        txtsname.setText("");
        txtbookname.setText("");
    }
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        txtisbn.setText("");
        txtsname.setText("");
        txtfname.setText("");
        txtsname.setText("");
        txtbookname.setText("");
        
    }                                        

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
          Tree mytree = new Tree(); 
          
        

        for(int i=0;i<det1.size();i++)
                                          { 
                                              
             mytree.insert(Integer.parseInt(det1.get(i).toString()));
             
                                          }

        
        int t1 = Integer.parseInt(txtsearch.getText());
        TNode findingnode = mytree.searchNode(t1);        
        
        if(findingnode != null){            
                        
            System.out.println("\n ID found complete");
            
            
            System.out.println(t1);
                
                               }
        
        else
             System.out.println("\n ID found not complete");        
        
    }                                         

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
               
        Tree mytree = new Tree();
                
                int t1 = Integer.parseInt(txtsearch.getText());
                TNode findingnode = mytree.delete(t1);
                
        if(findingnode != null){
            
            System.out.println("\n ID found complete");
                  
            det1.remove(det1.indexOf(t1));
            
            
                                 
                               }
        
        else
             System.out.println("\n ID found not complete");
                
                
        
        
        
        
        
        
    }                                        

    private void cmbtitleActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Home nm = new Home();
                nm.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnclear;
    private javax.swing.JComboBox cmbtitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableBook;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsname;
    // End of variables declaration                   
}