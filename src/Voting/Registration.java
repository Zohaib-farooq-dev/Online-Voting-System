
package Voting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        fathername = new javax.swing.JTextField();
        cnic = new javax.swing.JTextField();
        voterid = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        registration = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Voting System");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("CNIC ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Contact");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Voter ID ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 160, -1));

        fathername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fathernameKeyPressed(evt);
            }
        });
        getContentPane().add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 160, -1));

        cnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicActionPerformed(evt);
            }
        });
        cnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnicKeyPressed(evt);
            }
        });
        getContentPane().add(cnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 160, -1));

        voterid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voteridKeyPressed(evt);
            }
        });
        getContentPane().add(voterid, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 160, -1));

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 160, -1));

        registration.setBackground(new java.awt.Color(0, 0, 0));
        registration.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        registration.setForeground(new java.awt.Color(255, 255, 255));
        registration.setText("Register");
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });
        getContentPane().add(registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactKeyPressed(evt);
            }
        });
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 160, -1));

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Back");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Muhammad Zohaib Ali\\Downloads\\register.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean  specialCharacter(char c ){
        ArrayList<Character> letters = new ArrayList<>();
        String b = "[],.{};;-_=+'@#$%^&*(){}|/?><~!\\\"";
        for(int i =0;i<b.length(); i++){
          letters.add(b.charAt(i));
        }
        for(int j =0;j<b.length();j++){
            if(letters.contains(c)){
                return true;
            }
        }
        return false;
    }
    private boolean UpperCase( String str){
        for(int i =0; i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                return true;
            }
        }
        return false;
    }
    
     private boolean isDigit(String str){
         for(int i =0;i<str.length();i++){
             if(Character.isDigit(str.charAt(i))){
                 return true;
             }
         }
         return false;
     }
    
    private void voteridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voteridKeyPressed
        char c = evt.getKeyChar();
        String s = voterid.getText();
        if((s.length() >4 && !Character.isISOControl(c))
                || Character.isLetter(c)|| specialCharacter(c)){
            voterid.setEditable(false);
          JOptionPane.showMessageDialog(this, " You can't enter special character or "
                    + "letter in voter id and its length should be 5",
                    "Registration",JOptionPane.ERROR_MESSAGE);
            voterid.setEditable(true);
        }else{
            voterid.setEditable(true);
        }
    }//GEN-LAST:event_voteridKeyPressed

    private void cnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicActionPerformed
        
    }//GEN-LAST:event_cnicActionPerformed

    private void cnicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnicKeyPressed
        char c = evt.getKeyChar();
        String s = cnic.getText();
        if( (s.length()>12 && !Character.isISOControl(c))
                || Character.isLetter(c) || specialCharacter(c)){
            cnic.setEditable(false);
            JOptionPane.showMessageDialog(this, " You can't enter special character or "
                    + "letter  in cnic and it's length should be 13 ",
                    "Registration",JOptionPane.ERROR_MESSAGE);
            cnic.setEditable(true);
        }else{
            cnic.setEditable(true);
        }
    }//GEN-LAST:event_cnicKeyPressed

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
      
          if(name.getText().trim().isEmpty() ||fathername.getText().trim().isEmpty()
                  || cnic.getText().trim().isEmpty() 
                  || voterid.getText().trim().isEmpty()
                  || password.getText().trim().isEmpty()
                  || contact.getText().trim().isEmpty())
        {
          JOptionPane.showMessageDialog(Registration.this, "Please enter the information in all fields");
          return;
        }
        
       ArrayList<Voter> vote = new ArrayList<>();        
       String name = this.name.getText();
       String fathername = this.fathername.getText();
       long cnic = Long.parseLong(this.cnic.getText());
       int voterId = Integer.parseInt(this.voterid.getText());
       String password = this.password.getText();
       String contactno = contact.getText();
       
        if(UpperCase(password) 
                && isDigit(password)
                && password.length()>6 && password.length()<15){
                 
                         
       Voter voter = new Voter(name,fathername,cnic,contactno,voterId,password);
        boolean flag1 = false;
       try {
             FileInputStream file1 = new FileInputStream("Register.txt");
             ObjectInputStream in = new ObjectInputStream(file1);
             vote = (ArrayList) in.readObject();
             for(Voter vt : vote){
                 if(vt.getCnicId() == cnic){
                     flag1 = true;
                 }
             }
             in.close();
             file1.close();
                        
            } catch (IOException | ClassNotFoundException ex) {
              System.out.println(ex.getMessage());
            }
    if(flag1 == false){
        try {
               FileOutputStream fsout = new FileOutputStream("Register.txt");
               vote.add(voter);
               ObjectOutputStream out = new ObjectOutputStream(fsout);
               out.writeObject(vote);
               out.close();
               fsout.close();            
               JOptionPane.showMessageDialog(Registration.this,"Successfully registered!!!");
               this.name.setText("");
               this.fathername.setText("");
               this.cnic.setText("");
               this.voterid.setText("");
               this.password.setText("");
               contact.setText("");
               
           } catch (IOException ex) {
               System.out.println(ex.getMessage());
           }   
         }else{
             JOptionPane.showMessageDialog(this, " Cnic already registred!!! ",
                    "Registration",JOptionPane.ERROR_MESSAGE);
        }       
        
     } else{
            JOptionPane.showMessageDialog(this, " Password length should >6 & <15 "
                    + "It should contain special character or atleast one uppercase",
                    "Registration",JOptionPane.ERROR_MESSAGE); 
        }
               
    }//GEN-LAST:event_registrationActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed

        char c  = evt.getKeyChar();
        String str= name.getText();
        if(Character.isDigit(c) || specialCharacter(c)){
            name.setEditable(false);
            JOptionPane.showMessageDialog(this, " You can't enter special character or "
                    + "number in name ",
                    "Registration",JOptionPane.ERROR_MESSAGE);
            name.setEditable(true);
        }else{
            name.setEditable(true);
        }
        
    }//GEN-LAST:event_nameKeyPressed

    private void fathernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fathernameKeyPressed

        char c  = evt.getKeyChar();
        String str = fathername.getText();
        if(Character.isDigit(c) || specialCharacter(c)){
            fathername.setEditable(false);
            JOptionPane.showMessageDialog(this, " You can't enter special character or "
                    + "number in name ",
                    "Registration",JOptionPane.ERROR_MESSAGE);
            fathername.setEditable(true);
        }else{
            fathername.setEditable(true);
        }
    }//GEN-LAST:event_fathernameKeyPressed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        JFrame frame = new JFrame();
        if(JOptionPane.showConfirmDialog(frame,"Are you sure to Exit!!", 
                "Voting",JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
            this.dispose();
            new MainUI().setVisible(true);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

    }//GEN-LAST:event_nameActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        char c = evt.getKeyChar();
        String password = this.password.getText();
    }//GEN-LAST:event_passwordKeyPressed

    private void contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyPressed
        char c = evt.getKeyChar();
        String contactno = contact.getText();
        if((contactno.length() >10 && !Character.isISOControl(c))
                || Character.isLetter(c)
                || specialCharacter(c) ){
            contact.setEditable(false);
             JOptionPane.showMessageDialog(this, " Contact No length should be 11  "
                    + " and you can't enter letter and special character",
                    "Registration",JOptionPane.ERROR_MESSAGE);
             contact.setEditable(true);
        }else{
            contact.setEditable(true);
        }
    }//GEN-LAST:event_contactKeyPressed

   
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnic;
    private javax.swing.JTextField contact;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fathername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JButton registration;
    private javax.swing.JTextField voterid;
    // End of variables declaration//GEN-END:variables
}
