/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static admin.Admin_GUI.cont;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javafx.scene.input.KeyCode;
import javax.swing.JOptionPane;

/**
 *
 * @author Hady Ahmed
 */
public class Add_Book extends javax.swing.JFrame {
int id ,no_copies;
String name,production_year,auther,category;
    /**
     * Creates new form Add_Book
     */
    public Add_Book() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ic_logo.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jTextField13 = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jButton16 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Add Book Form");
        jLabel12.setToolTipText("Add Book Form");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 170, -1));

        jTextField7.setBackground(new java.awt.Color(17, 9, 50));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("Enter Book Name");
        jTextField7.setToolTipText("Enter Book Name");
        jTextField7.setBorder(null);
        jTextField7.setOpaque(false);
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
        });
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 200, 20));
        jPanel5.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 200, 10));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Author");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));
        jPanel5.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 210, 10));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Name");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ID");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jTextField10.setBackground(new java.awt.Color(17, 9, 50));
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText("Enter Book  Author");
        jTextField10.setToolTipText("Enter Book  Author");
        jTextField10.setBorder(null);
        jTextField10.setOpaque(false);
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
        });
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 210, 20));
        jPanel5.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 200, 10));
        jPanel5.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 10));
        jPanel5.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 10));
        jPanel5.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 10));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Category");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 110, -1));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(17, 9, 50));
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setText("ID will be set automatically");
        jTextField14.setToolTipText("Enter Book ID");
        jTextField14.setBorder(null);
        jTextField14.setOpaque(false);
        jTextField14.setVerifyInputWhenFocusTarget(false);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 200, 20));

        jTextField11.setBackground(new java.awt.Color(17, 9, 50));
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setText("Enter Number Of Copies");
        jTextField11.setToolTipText("Enter Number Of Copies");
        jTextField11.setBorder(null);
        jTextField11.setOpaque(false);
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
        });
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 210, 20));
        jPanel5.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 210, 10));

        jButton30.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/back 1.png"))); // NOI18N
        jButton30.setText("Back");
        jButton30.setToolTipText("Back To The Previous Page");
        jButton30.setBorder(null);
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton30.setDefaultCapable(false);
        jButton30.setFocusPainted(false);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/back 2.png"))); // NOI18N
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 50));

        jButton31.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/logout 1.png"))); // NOI18N
        jButton31.setText("Logout");
        jButton31.setToolTipText("Logout");
        jButton31.setBorder(null);
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton31.setDefaultCapable(false);
        jButton31.setFocusPainted(false);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/logout 2.png"))); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        jButton32.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/home 1.png"))); // NOI18N
        jButton32.setText("Home");
        jButton32.setToolTipText("Home");
        jButton32.setBorder(null);
        jButton32.setBorderPainted(false);
        jButton32.setContentAreaFilled(false);
        jButton32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton32.setDefaultCapable(false);
        jButton32.setFocusPainted(false);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/home 2.png"))); // NOI18N
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 50));

        jLabel24.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Production Year");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 110, -1));

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Number Of Copies");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 130, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/diff logo.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 80));

        jTextField12.setBackground(new java.awt.Color(17, 9, 50));
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setText("Enter Category");
        jTextField12.setToolTipText("Enter Category");
        jTextField12.setBorder(null);
        jTextField12.setOpaque(false);
        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField12FocusGained(evt);
            }
        });
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 210, 20));
        jPanel5.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 210, 10));

        jTextField13.setBackground(new java.awt.Color(17, 9, 50));
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setText("Enter Production Year");
        jTextField13.setToolTipText("Enter Production Year");
        jTextField13.setBorder(null);
        jTextField13.setOpaque(false);
        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField13FocusGained(evt);
            }
        });
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 210, 20));
        jPanel5.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 210, 10));

        jButton16.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton16.setText("Save Book");
        jButton16.setToolTipText("Save This Information");
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setFocusPainted(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 180, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/lefte.jpg"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/right.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel1KeyTyped(evt);
            }
        });
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 740, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        cont.add_book.setVisible(false);
        cont.Admin.setVisible(true);
        cont.Admin.setResizable(false);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        // TODO add your handling code here:
        jTextField7.setText("");
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        // TODO add your handling code here:
        jTextField10.setText("");
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
        // TODO add your handling code here:
        jTextField11.setText("");
    }//GEN-LAST:event_jTextField11FocusGained

    private void jTextField13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusGained
        // TODO add your handling code here:
        jTextField13.setText("");
    }//GEN-LAST:event_jTextField13FocusGained

    private void jTextField12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusGained
        // TODO add your handling code here:
        jTextField12.setText("");
    }//GEN-LAST:event_jTextField12FocusGained

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        cont.add_book.setVisible(false);
        cont.home.setVisible(true);
        cont.home.setResizable(false);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if(Validation.valid2(jTextField10.getText())&&Validation.valid2(jTextField12.getText())&&Validation.valid1(jTextField11.getText())&&Validation.valid1(jTextField13.getText())){
        Home.b_index++;
        Home.bookid++;
        name=jTextField7.getText();
        id=Integer.valueOf(Home.bookid);
        jTextField14.setText(String.valueOf(id));
        auther=jTextField10.getText();
        no_copies=Integer.valueOf(jTextField11.getText());
        production_year=jTextField13.getText();
        category=jTextField12.getText();
        librarian.add_book(id, name, production_year, no_copies, auther, category);
        JOptionPane.showMessageDialog(new Add_Book(), "You have added a new book succesfully");
        }else{
                    JOptionPane.showMessageDialog(new Add_Book(), "There is invalid data or missing data","Error",JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        cont.add_book.setVisible(false );
        cont.log.setVisible(true);
        cont.log.setResizable(false);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
