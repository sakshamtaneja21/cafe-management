/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * NewJFrame8.java
 *
 * Created on Nov 26, 2017, 2:37:24 AM
 */
/**
 *
 * @author dell
 */
public class NewJFrame8 extends javax.swing.JFrame {

    /** Creates new form NewJFrame8 */
    public NewJFrame8() {
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

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("GENDER");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 200, 80, 21);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14));
        jButton1.setForeground(new java.awt.Color(255, 0, 102));
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(149, 482, 120, 29);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(303, 265, 225, 20);

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14));
        jButton2.setForeground(new java.awt.Color(255, 0, 102));
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 480, 120, 29);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jRadioButton1.setFont(new java.awt.Font("Arial Black", 1, 12));
        jRadioButton1.setForeground(new java.awt.Color(153, 102, 255));
        jRadioButton1.setText("MALE");
        jRadioButton1.setBorderPainted(true);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);

        jRadioButton2.setFont(new java.awt.Font("Arial Black", 1, 12));
        jRadioButton2.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton2.setText("FEMALE");
        jRadioButton2.setBorderPainted(true);
        jPanel1.add(jRadioButton2);

        jRadioButton3.setFont(new java.awt.Font("Arial Black", 1, 12));
        jRadioButton3.setForeground(new java.awt.Color(204, 51, 255));
        jRadioButton3.setText("OTHER");
        jRadioButton3.setBorderPainted(true);
        jPanel1.add(jRadioButton3);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(318, 186, 240, 53);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 24));
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("UPDATE A MEMBER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 360, 33);

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("CUSTOMER ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 76, 140, 21);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(315, 148, 213, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(315, 73, 191, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(303, 433, 225, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(303, 319, 225, 96);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 204, 255));
        jLabel8.setText("PHONE NO.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 436, 110, 21);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setText("ADDRESS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 320, 81, 21);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 150, 70, 21);

        jLabel5.setFont(new java.awt.Font("Arial Black", 3, 18));
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("ENTER YOUR NEW DETAILS HERE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 30, 380, 37);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 204, 204));
        jLabel4.setText("EMAIL ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 270, 90, 21);

        jButton3.setBackground(new java.awt.Color(255, 204, 255));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 18));
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setText("FETCH DETAILS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(190, 110, 250, 31);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Flower-Cart640.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 10, 630, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","root");
            String customer_id,name,gender=" ",email_id,address,contact_no,sql;
            customer_id=jTextField1.getText();
            name=jTextField2.getText();
            if(jRadioButton1.isSelected())
                gender="male";
            else if(jRadioButton2.isSelected())
                gender="female";
            else if(jRadioButton3.isSelected())
                gender="other";
            email_id=jTextField3.getText();
            address=jTextArea1.getText();
            contact_no=jTextField4.getText();
            sql="update customer set name='"+name+"',gender='"+gender+"',email_id='"+email_id+"',address='"+address+"',contact_no="+contact_no+" where customer_id="+customer_id;
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this," member updated");
        } catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NewJFrame2 f=new NewJFrame2();
        f.show();
        this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{
    Class.forName("java.sql.DriverManager");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","root");
    String customer_id,sql;
    customer_id=jTextField1.getText();

    sql="select* from customer where customer_id=" +customer_id;
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(sql);
    if(!rs.next())
    JOptionPane.showMessageDialog(this,"No Such Member");
    else{
        jTextField2.setText(rs.getString("name"));
        if(rs.getString("gender").equals("male"))
            jRadioButton1.setSelected(true);
        else if(rs.getString("gender").equals("female"))
            jRadioButton2.setSelected(true);
        else if(rs.getString("gender").equals("other"))
            jRadioButton3.setSelected(true);
            
        jTextField3.setText(rs.getString("email_id"));
        jTextArea1.setText(rs.getString("address"));
        jTextField4.setText(rs.getString("contact_no"));
    }
}
catch(Exception e){JOptionPane.showMessageDialog(this,"Error"+e.getMessage());}
    
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new NewJFrame8().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
