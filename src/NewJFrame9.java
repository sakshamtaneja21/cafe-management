/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * NewJFrame9.java
 *
 * Created on Nov 26, 2017, 2:37:35 AM
 */
/**
 *
 * @author dell
 */
public class NewJFrame9 extends javax.swing.JFrame {

    /** Creates new form NewJFrame9 */
    public NewJFrame9() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(251, 220, 235));
        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 24));
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("DELETE A MEMBER RECORD");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 490, 35);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("CUSTOMER_ID");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 160, 26);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(240, 90, 100, 20);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18));
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 180, 130, 35);

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18));
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 180, 120, 35);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pillar-of-salt.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 450, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    Class.forName("java.sql.DriverManager");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","root");
    String customer_id,sql;
    customer_id=jTextField1.getText();

    sql="delete from customer where customer_id="+customer_id;
    Statement st=con.createStatement();
    st.executeUpdate(sql);
    JOptionPane.showMessageDialog(this,"member record deleted");
}
catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
NewJFrame2 f=new NewJFrame2();
f.show();
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new NewJFrame9().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
