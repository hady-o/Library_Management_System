/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static admin.Admin_GUI.cont;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JList;

/**
 *
 * @author Hady Ahmed
 */
public class Search_For_Book extends javax.swing.JFrame {
    String name;
    
    /**
     * Creates new form Search_For_Book
     */
    public Search_For_Book() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Search For Book");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 190, 20));
        jPanel6.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 200, 10));
        jPanel6.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 10));
        jPanel6.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 10));
        jPanel6.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 10));

        jLabel26.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Book Name");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/diff logo.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 80));

        jTextField1.setBackground(new java.awt.Color(17, 9, 50));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Enter book's name");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 204, 200, 20));

        jButton33.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("Back");
        jButton33.setBorder(null);
        jButton33.setBorderPainted(false);
        jButton33.setContentAreaFilled(false);
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.setDefaultCapable(false);
        jButton33.setFocusPainted(false);
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 50));

        jButton34.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Logout");
        jButton34.setBorder(null);
        jButton34.setBorderPainted(false);
        jButton34.setContentAreaFilled(false);
        jButton34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton34.setDefaultCapable(false);
        jButton34.setFocusPainted(false);
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 50));

        jButton35.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("Home");
        jButton35.setBorder(null);
        jButton35.setBorderPainted(false);
        jButton35.setContentAreaFilled(false);
        jButton35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton35.setDefaultCapable(false);
        jButton35.setFocusPainted(false);
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 50));

        jButton17.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton17.setText("Search For The Book");
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setFocusPainted(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 180, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/lefte.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/right.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 740, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        if (Home.login)
        {
        cont.se_book.setVisible(false);
        cont.Admin.setVisible(true);
        }
        else if (Home.login==false)
        {
            if (Home.isgest==false)
            {
                cont.se_book.setVisible(false);
                cont.read.setVisible(true);
            }
            else if (Home.isgest==true)
            {
                cont.se_book.setVisible(false);
                cont.gest.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        cont.se_book.setVisible(false);
        cont.home.setVisible(true);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        //cont.Dis_Book.
       /* name=jTextField1.getText();
        DefaultListModel<String> model2 = new DefaultListModel<>();
        if(User.search_for_book(name, Home.b_index, Home.books))
        {
               
            if(Home.books[User.currentbook_id].watting_list_index==0)
            {
                cont.se_book.setVisible(false);
               cont.Dis_Book.setVisible(true);
            }
            else
            {
            for (int i = 0; i <= Home.books[User.currentbook_id].watting_list_index; i++) {
                model2.addElement(String.valueOf(Home.books[User.currentbook_id].waitting_list[i].ID));
                cont.Dis_Book.jList1.setModel(model2);
                 cont.se_book.setVisible(false);
               cont.Dis_Book.setVisible(true);
            }
            }
        }
        else 
            JOptionPane.showMessageDialog(new Search_For_Book(), "This book has not been found!!", "Alert", JOptionPane.WARNING_MESSAGE);*/
       
       
        
  if(Validation.valid2(jTextField1.getText())){
      name=jTextField1.getText();
        DefaultListModel<String> model2 = new DefaultListModel<>();
        if(User.search_for_book(name, Home.b_index, Home.books))
        {
               
            if(Home.books[User.currentbook_id].watting_list_index==0)
            {
                Home.books[User.currentbook_id].waitting_list[0]=new Reader(0, " ", "r", " ", " ", " ", 0, " ", false);
                model2.addElement(String.valueOf(Home.books[User.currentbook_id].waitting_list[0].ID));
                 cont.Dis_Book.jList1.setModel(model2);
                cont.se_book.setVisible(false);
               cont.Dis_Book.setVisible(true);
            }
            else
            {
            for (int i = 0; i < Home.books[User.currentbook_id].watting_list_index; i++) {
                model2.addElement(String.valueOf(Home.books[User.currentbook_id].waitting_list[i].ID));
                 cont.Dis_Book.jList1.setModel(model2);
                 cont.se_book.setVisible(false);
                 cont.Dis_Book.setVisible(true);
            }
            }
        }
        else 
            JOptionPane.showMessageDialog(new Search_For_Book(), "This book has not been found!!", "Alert", JOptionPane.WARNING_MESSAGE);
            
     
          
        }else{
                    JOptionPane.showMessageDialog(new Add_Book(), "wrong data");

        }

            
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
      cont.se_book.setVisible(false );
      cont.log.setVisible(true);
      Home.login=false;
    }//GEN-LAST:event_jButton34ActionPerformed

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
            java.util.logging.Logger.getLogger(Search_For_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_For_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_For_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_For_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Search_For_Book().setVisible(true);
                
                cont.se_book.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
