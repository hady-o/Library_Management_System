/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author Hady Ahmed
 */
public class Admin_GUI extends javax.swing.JFrame {
    public Admin_GUI() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ic_logo.png")));
    }
    public static contaner cont =new contaner();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jButton17 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 10));

        jButton17.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton17.setText("Return Rented Book");
        jButton17.setToolTipText("To Return Rented Book");
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setFocusPainted(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 180, 50));

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton1.setText("Add Reader");
        jButton1.setToolTipText("To Add Reader");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 180, 50));

        jButton16.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton16.setText("Show All Rented Books");
        jButton16.setToolTipText("To Show All Rented Books");
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
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 180, 50));

        jButton15.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton15.setText("Show All Readers");
        jButton15.setToolTipText("To Show All Readers");
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setFocusPainted(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 180, 50));

        jButton13.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton13.setText("Show All Books");
        jButton13.setToolTipText("To Show All Books");
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setFocusPainted(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 180, 50));

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton2.setText("Add User To List");
        jButton2.setToolTipText("To Add User To List");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 180, 50));

        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton3.setText(" Search For Book");
        jButton3.setToolTipText("To  Search For Book");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 180, 50));

        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton4.setText("Remove Reader");
        jButton4.setToolTipText("To Remove Reader");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 180, 50));

        jButton5.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton5.setText("Remove Book");
        jButton5.setToolTipText("To Remove Book");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 180, 50));

        jButton6.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton6.setText("Remove User From List");
        jButton6.setToolTipText("To Remove User From List");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 180, 50));

        jButton7.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton7.setText(" Search For Member");
        jButton7.setToolTipText("To  Search For Member");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 180, 50));

        jButton8.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton8.setText(" Rent Book");
        jButton8.setToolTipText("To  Rent Book");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 180, 50));

        jButton9.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton9.setText("Add Book");
        jButton9.setToolTipText("To Add Book");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setFocusPainted(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 180, 50));

        jButton10.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton10.setText("Block User");
        jButton10.setToolTipText("To Block User");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setFocusPainted(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 180, 50));

        jButton12.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/logout 1.png"))); // NOI18N
        jButton12.setText("Logout");
        jButton12.setToolTipText("Logout");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setDefaultCapable(false);
        jButton12.setFocusPainted(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/logout 2.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 50));

        jButton18.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton18.setText("Unblock User");
        jButton18.setToolTipText("To Unblock User");
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.setFocusPainted(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 180, 50));

        jButton14.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/home 1.png"))); // NOI18N
        jButton14.setText("Home");
        jButton14.setToolTipText("Home");
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setDefaultCapable(false);
        jButton14.setFocusPainted(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/home 2.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 50));

        jButton19.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton19.setText("Show All Blocked Users");
        jButton19.setToolTipText("To Show All Blocked Users");
        jButton19.setBorder(null);
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.setFocusPainted(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton2_1.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 180, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/diff logo.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/lefte.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 490));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Librarian Menu");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 250, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/right.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 740, 490));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cont.Admin.setVisible(false);
        cont.remov_book.setVisible(true);
        cont.remov_book.setResizable(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        cont.Admin.setVisible(false);
        cont.add_user.setVisible(true);
        cont.add_user.setResizable(false);
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        // TODO add your handling code here:
        cont.Admin.setVisible(false);
        cont.add_book.setVisible(true);
        cont.add_book.setResizable(false);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cont.Admin.setVisible(false);
        cont.remove_user.setVisible(true);
        cont.remove_user.setResizable(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cont.Admin.setVisible(false);
        cont.op_search.setVisible(true);
        cont.op_search.setResizable(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        cont.Admin.setVisible(false);
        cont.se_member.setVisible(true);
        cont.se_member.setResizable(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        cont.show_reders.show_r(Home.readers[0].First_Name,Home.readers[0].Last_Name, String.valueOf(Home.readers[0].ID), Home.readers[0].Address, String.valueOf(Home.readers[0].Cellphone), Home.readers[0].Email);
        cont.Admin.setVisible(false);
        cont.show_reders.setVisible(true);
        cont.show_reders.setResizable(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        cont.Admin.setVisible(false);
        cont.home.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cont.Admin.setVisible(false);
        cont.a_list.setVisible(true);
        cont.a_list.setResizable(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        cont.Admin.setVisible(false);
        cont.rem_list.setVisible(true);
        cont.rem_list.setResizable(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        cont.Admin.setVisible(false);
        cont.option.setVisible(true);
        cont.option.setResizable(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        cont.Admin.setVisible(false);
        cont.block.setVisible(true);
        cont.block.setResizable(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        
        cont.show.show(Home.books[0].getBook_Name(), String.valueOf(Home.books[0].getBook_ID()), Home.books[0].getProduction_year(), Home.books[0].getAuthor_name(), Home.books[0].getCategory(),String.valueOf(Home.books[0].getNo_of_existing_copies()));
        cont.show.i=0;
         //all.setVisible(true);
         cont.Admin.setVisible(false);
        cont.show.setVisible(true);
        cont.show.setResizable(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        Home.login=false;
        cont.log.setVisible(true);
        cont.log.setResizable(false);
        cont.Admin.setVisible(false);
        cont.read.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        
        if(Home.rented_book_index==-1)
        {
            JOptionPane.showMessageDialog(new Admin_GUI(), "There are no rented books to rent","Failed",JOptionPane.WARNING_MESSAGE);
        }
        
 
        else
        {
         int i=0;
         cont.show_rented.show_rented(Home.Rented_books[i].getBook_Name(), String.valueOf(Home.Rented_books[i].getBook_ID()), Home.Rented_books[i].getProduction_year(), Home.Rented_books[i].getAuthor_name(), Home.Rented_books[i].getCategory(),String.valueOf(Home.Rented_books[i].getNo_of_existing_copies()));

         cont.show_rented.i=0;
         cont.Admin.setVisible(false);
         cont.show_rented.setVisible(true);
         cont.show_rented.setResizable(false);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if(Home.rented_book_index==-1)
        {
            JOptionPane.showMessageDialog(new Admin_GUI(), "There are no rented books to return","Failed",JOptionPane.WARNING_MESSAGE);
        }
        else{
            cont.ret_book.setVisible(true);
            cont.ret_book.setResizable(false);
            cont.Admin.setVisible(false);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        if(Home.blocked_user_index ==-1)
        {
            JOptionPane.showMessageDialog(new Admin_GUI(), "There are no blocked users to unblock them","Failed",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            cont.show_all_blocked.show_blocked(Home.blocked_readers[0].First_Name,Home.blocked_readers[0].Last_Name, String.valueOf(Home.blocked_readers[0].ID), Home.blocked_readers[0].Address, String.valueOf(Home.blocked_readers[0].Cellphone), Home.blocked_readers[0].Email);
            cont.Admin.setVisible(false);
            cont.unblock.setVisible(true);
            cont.unblock.setResizable(false);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        if(Home.blocked_user_index ==-1)
        {
            JOptionPane.showMessageDialog(new Admin_GUI(), "There are no blocked users to show them","Failed",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            cont.show_all_blocked.show_blocked(Home.blocked_readers[0].First_Name,Home.blocked_readers[0].Last_Name, String.valueOf(Home.blocked_readers[0].ID), Home.blocked_readers[0].Address, String.valueOf(Home.blocked_readers[0].Cellphone), Home.blocked_readers[0].Email);
            cont.show_all_blocked.setVisible(true);
            cont.show_all_blocked.setResizable(false);
            cont.Admin.setVisible(false);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
