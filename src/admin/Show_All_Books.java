/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static admin.Admin_GUI.cont;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hady Ahmed
 */
public class Show_All_Books extends javax.swing.JFrame {
   static int i=0;
    public void show (String name, String id,String year , String a_name,String category,String num) {
        jTextField3.setText(name);
        jTextField4.setText(id);
        jTextField5.setText(a_name);
        jTextField6.setText(year);
        jTextField7.setText(category);
        jTextField8.setText(num);
    }
    /**
     * Creates new form Show_All_Books
     */
    public Show_All_Books() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton19 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jButton20 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Book Information");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 310, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("The Book Name :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(17, 9, 50));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("the book name is uneditable");
        jTextField3.setBorder(null);
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.setOpaque(false);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 200, 20));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID : ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Author :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 70, 30));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Production Year :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 30));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Waiting List :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, 30));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Number of copies");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 160, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 180, -1));

        jButton19.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton19.setText("Next Book");
        jButton19.setBorder(null);
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.setFocusPainted(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 180, 50));

        jButton17.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton17.setText("Previous Book");
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
        jPanel3.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 180, 50));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(17, 9, 50));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("number of copies is uneditable");
        jTextField7.setBorder(null);
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 200, -1));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(17, 9, 50));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("production year is uneditable");
        jTextField6.setBorder(null);
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField6.setOpaque(false);
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 210, 30));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Category :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 90, 30));

        jTextField8.setBackground(new java.awt.Color(17, 9, 50));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setText("the book category is uneditable");
        jTextField8.setBorder(null);
        jTextField8.setOpaque(false);
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
        });
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, 30));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 400, 10));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(17, 9, 50));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("the book author is uneditable");
        jTextField5.setBorder(null);
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField5.setOpaque(false);
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 210, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(17, 9, 50));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("the book ID is uneditable");
        jTextField4.setBorder(null);
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField4.setOpaque(false);
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 200, 20));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 10));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 10));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 400, 10));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 400, 10));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 400, 10));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 400, 10));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 400, 10));

        jButton20.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton20.setText("Rent This One");
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.setFocusPainted(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 180, 50));

        jButton24.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Main Menu");
        jButton24.setBorder(null);
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.setDefaultCapable(false);
        jButton24.setFocusPainted(false);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 50));

        jButton25.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Logout");
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton25.setDefaultCapable(false);
        jButton25.setFocusPainted(false);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 50));

        jButton26.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Home");
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.setDefaultCapable(false);
        jButton26.setFocusPainted(false);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/diff logo.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/lefte.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/right.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 740, 490));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/right.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 740, 490));

        jButton18.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton18.setText("Back");
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.setFocusPainted(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 180, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3FocusGained

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      
       if(i==0)
        {
            JOptionPane.showMessageDialog(new Show_All_Books(), "Sorry, there are no more books");
        }
       else
       {
         i--;
        cont.show.show(Home.books[i].getBook_Name(), String.valueOf(Home.books[i].getBook_ID()), Home.books[i].getProduction_year(), Home.books[i].getAuthor_name(), Home.books[i].getCategory(),String.valueOf(Home.books[i].getNo_of_existing_copies()));
       }
        // TODO add your handling code here:
        //ont.Dis_Book.setVisible(false);
        //cont.se_book.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4FocusGained

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
       if (Home.login)
        {
            cont.show.setVisible(false);
            cont.Admin.setVisible(true);
        }
        if (Home.login==false)
        {
           cont.show.setVisible(false);
           cont.read.setVisible(true);
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        cont.show.setVisible(false);
        cont.home.setVisible(true);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        
         
        String name=Home.books[i].getBook_Name();
        if(Home.login)
       {
           Home.libs[Home.current_user_index].rent_book(name);
       }
       else
       {
           Home.readers[Home.current_user_index].rent_book(name);
       }
       
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        if(i==Home.b_index)
        {
            JOptionPane.showMessageDialog(new Show_All_Books(), "Sorry, there are no more books");
        }
        else
        {
            i++;
           cont.show.show(Home.books[i].getBook_Name(), String.valueOf(Home.books[i].getBook_ID()), Home.books[i].getProduction_year(), Home.books[i].getAuthor_name(), Home.books[i].getCategory(),String.valueOf(Home.books[i].getNo_of_existing_copies()));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8FocusGained

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        cont.show.setVisible(false);
        cont.log.setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

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
            java.util.logging.Logger.getLogger(Show_All_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_All_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_All_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_All_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
   
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Show_All_Books().setVisible(true);
                cont.show.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
