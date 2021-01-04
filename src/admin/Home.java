/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static admin.Admin_GUI.cont;
import javax.swing.JList;

/**
 *
 * @author Hady Ahmed
 */
public class Home extends javax.swing.JFrame {
        static int userid=101; //automatic id for the new user 
        static int librarianid=2;//automatic id for the new librarian
        static int bookid=1004;//automatic id for the new boook
        static int r_index=1;//the last index of the reader array
        static int l_index=1;//the last index of the librarian array
        static int b_index=4;//the last index of the book array
        static int rented_book_index=-1; //the last index of the array of all rented books
        static int blocked_user_index=-1; //the last index of the array of all blocked readers
        static Book books[]=new Book[15];//array of book class and it refers to the books in the library
        static Book []Rented_books=new Book[100];//refers to all rented books in the library
        static Reader readers[]=new Reader[15];//refers to the readers in library
        static Reader blocked_readers[]=new Reader[15];//refers to the blocked readers in the library
        static librarian libs[]=new librarian[15];//refers to the admins in the library
        static int current_user_index;//refers to the index of current reader or admin
        static boolean login=false; //use to know if the user is reader or admin
        static boolean isgest =false;
    /**
     * Creates new form Home
     */
    public Home() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setName("Book"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, 150));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Library Management System");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, 60));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome To Our Library");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, 60));

        jButton9.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton9.setText(" Reader");
        jButton9.setToolTipText(" To Reader Form");
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
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, 50));

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton1.setText(" Librarian");
        jButton1.setToolTipText("To  Librarian");
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, 50));

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/botton.png"))); // NOI18N
        jButton2.setText("Guest");
        jButton2.setToolTipText("To Guest Form");
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/lib textuers/Home Background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 460));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
         cont.log.jTextField1.setText("Librarian Login");
        cont.home.setVisible(false);
        cont.log.setVisible(true);
        cont.log.setResizable(false);
        Home.login=true;
        Home.isgest=false;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        cont.log.jTextField1.setText("Reader Login");
        cont.home.setVisible(false);
        cont.log.setVisible(true);
        cont.log.setResizable(false);
        Home.login=false;
        Home.isgest=false;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cont.home.setVisible(false);
        cont.gest.setVisible(true);
        cont.gest.setResizable(false);
        Home.isgest=true;
    }//GEN-LAST:event_jButton2ActionPerformed
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        libs[0]=new librarian(1, "h5","l" , "Hadi", "Atef", "Cairo", "01027080999", "hadiatef@gmail.com", false);
        libs[1]=new librarian(2, "r3","l" , "Hadi", "Ahmed", "Paris", "01116074321", "hadiahmed@gmail.com", false);
        readers[0]=new Reader(100, "m5","r" , "Mo", "Salah", "Giza", "01003087968", "Mosalah@gmail.com", false);
        readers[1]=new Reader(101, "g5","r" , "Mahmoud", "Hamza", "Alexandria", "01023987654", "m_hamza1@gmail.com", false);
        books[0]=new Book(1000, "book1", "1998", 4,"Emad Sharaf","Horror");
        books[1]=new Book(1001, "book2", "2001", 0,"Mostafa ElBeltagi","Drama");
        books[2]=new Book(1002, "book3", "1925", 9,"Ahmed Khaled Tawfik","Romantic");
        books[3]=new Book(1003, "book4", "2000", 2,"Sayed Ibrahim","Fantasy");
        books[4]=new Book(1004, "book5", "2019", 8,"Mona elEgeezi","Novel");
        
        
       
        //User.rent_book();
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
            public void run() {
                //new Home().setVisible(true);
                cont.home.setVisible(true);
                cont.home.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
