
package Voting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Voting extends javax.swing.JFrame {

    private int pti=0;
    private int tlp=0;
    private int pmln=0;
    private int ppp=0;
    private int bap=0;
    private int pmlq=0;
    private int anp=0;
    private int jui=0;
    private int jamateislami=0;
    int j=0;
    ArrayList<Vote> votes = new ArrayList<>();
   
    public Voting() {
        initComponents();
    }
    ArrayList<Vote> alreadyVoted = new ArrayList<>();
    ArrayList<Voter> voter;
    int i ;
    Voting(ArrayList<Voter>  voters , int index ){
        this();
        i = index;
        voter = voters;
        
        name.setText(voter.get(i).getName());
        fathername.setText(voter.get(i).getFatherName());
        String id = ""+voter.get(i).getVoterId();
        voterid.setText(id);
        String cnic = "" + voter.get(i).getCnicId();
        this.cnicid.setText(cnic);
        
        name.setEditable(false);
        fathername.setEditable(false);
        voterid.setEditable(false);
        cnicid.setEditable(false);
        
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        vote = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        fathername = new javax.swing.JTextField();
        voterid = new javax.swing.JTextField();
        cnicid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        results = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Voting System");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("Online Voting System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        vote.setBackground(new java.awt.Color(0, 0, 0));
        vote.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        vote.setForeground(new java.awt.Color(255, 255, 255));
        vote.setText("Vote");
        vote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteActionPerformed(evt);
            }
        });
        getContentPane().add(vote, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 122, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 165, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("CNIC ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Voter ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 209, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[----Select One -----]", "Pakistan Tehreek Labaik", "Pakistan Muslim League (N)", "Pakistan Peoples Party", "Pakistan Tehreek Insaaf", "Pakistan Muslim League (Q)", "ANP", "Jamat-e-Islami", "JUI (F)", "Balochistan Awaami Party(BAP)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 307, 180, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 122, 178, -1));
        getContentPane().add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 165, 178, -1));

        voterid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteridActionPerformed(evt);
            }
        });
        getContentPane().add(voterid, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 209, 178, -1));
        getContentPane().add(cnicid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Select Party");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 307, -1, -1));

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Back");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        results.setBackground(new java.awt.Color(0, 0, 0));
        results.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        results.setForeground(new java.awt.Color(255, 255, 255));
        results.setText("View Election Results");
        results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultsActionPerformed(evt);
            }
        });
        getContentPane().add(results, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Muhammad Zohaib Ali\\Downloads\\Capture.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 780, 530));

        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu8.setText("About Us");
        jMenu8.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jMenu8HierarchyChanged(evt);
            }
        });
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu8MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
        
    }//GEN-LAST:event_jMenu2MousePressed

    private void voteridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteridActionPerformed

    }//GEN-LAST:event_voteridActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        JFrame frame = new JFrame();
        if(JOptionPane.showConfirmDialog(frame,"Are you sure to Exit!!", "Voting",
                JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
            this.dispose();
            new MainUI().setVisible(true);
        }
    }//GEN-LAST:event_exitActionPerformed

    private boolean alreadyVoted(){
        
        ArrayList<Vote> list = new ArrayList<>();
        try{
            FileInputStream fsin = new FileInputStream("Vote.txt");
            ObjectInputStream in = new ObjectInputStream(fsin);;
            list = (ArrayList) in.readObject();
            in.close();
            fsin.close();
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        for(Vote vote1: list ){
            if(name.getText().equals(vote1.getName()) && !vote1.isVoted()){
                return true;
            }
        }
        return false;
    }
    private void voteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteActionPerformed

        
       if(j==0 && !alreadyVoted()){
           
        String party =  jComboBox1.getSelectedItem().toString();
        
        try {
            FileInputStream fsin = new FileInputStream("Vote.txt");
            ObjectInputStream in = new ObjectInputStream(fsin);
            votes = (ArrayList) in.readObject();
            in.close(); fsin.close();
        }catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            FileOutputStream fsout = new FileOutputStream("Vote.txt");
            ObjectOutputStream out = new ObjectOutputStream(fsout);
            if(party.equals("Pakistan Tehreek Labaik")){
            tlp++;
            Vote v = new Vote(party,tlp);
            votes.add(v);
            out.writeObject(votes);
            out.close();fsout.close();  
            
         }else if(party.equals("Pakistan Muslim League (N)")){
            pmln++;
            Vote v = new Vote("Pakistan Muslim League(N)",pmln,name.getText(),false);
            votes.add(v);
            out.writeObject(votes);
            out.close();fsout.close();
         }else if(party.equals("Pakistan Peoples Party")){
            ppp++;
            Vote v = new Vote("Pakistan Peoples Party",ppp,name.getText(),false);
            votes.add(v);
            out.writeObject(votes);
            out.close();fsout.close();
         }else if(party.equals("Pakistan Tehreek Insaaf")){
             pti++;
             Vote v = new Vote("Pakistan Tehreek Insaaf",pti,name.getText(),false);
            votes.add(v);
            out.writeObject(votes);
            out.close();fsout.close();
         }else if(party.equals("Pakistan Muslim League (Q)")){
             pmlq++;
             Vote v = new Vote("Pakistan Muslim League(Q)",pmlq,name.getText(),false);
            votes.add(v);
            out.writeObject(votes);
            out.close();fsout.close();
         }else if(party.equals("ANP")){
             anp++;
             Vote v = new Vote("ANP",anp,name.getText(),false);
            votes.add(v);
            out.writeObject(votes);
            out.close();fsout.close();
         }else if(party.equals("Jamat-e-Islami")){
             jamateislami++;
             Vote v = new Vote("Jamate-e-Islami",jamateislami,name.getText(),false);
            votes.add(v);
            out.writeObject(votes);
            out.close();fsout.close();
         }else if(party.equals("JUI (F)")){
             jui++;
             Vote v = new Vote("JUI (F)",jui,name.getText(),false);
            votes.add(v);
            out.writeObject(votes);
            out.close();fsout.close();
         }else if(party.equals("Balochistan Awaami Party(BAP)")){
             bap++;
             Vote v = new Vote("BAP",bap,name.getText(),false);
            votes.add(v);
            out.writeObject(votes);
            out.close();fsout.close();
         }
            
                
      } catch (IOException ex) {
               System.out.println(ex.getMessage());
      }
          JOptionPane.showMessageDialog(Voting.this, "Successfully casted your vote!!!");
     }else{
           JOptionPane.showMessageDialog(Voting.this, "You have already casted your vote !!!");
       }
    }//GEN-LAST:event_voteActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void resultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultsActionPerformed

         ArrayList<Vote> list = new ArrayList<>();
        try {
            FileInputStream fsin = new FileInputStream("Vote.txt");
            ObjectInputStream in = new ObjectInputStream(fsin);
            list = (ArrayList) in.readObject();
            in.close();
            fsin.close();
            } catch (IOException |ClassNotFoundException  ex) {
                ex.printStackTrace();
            }
        
        Vote votes[] = new Vote[9];
        for(int i =0; i<votes.length;i++){
            votes[i]= new Vote();
        }
        int tlp = 0 ;
        int pmln =0;
        int pti =0;
        int ppp=0;
        int bap=0;
        int pmlq=0;
        int anp=0;
        int jui=0;
        int jamateislami=0; 
        
        
        votes[0].setPartyName("Pakistan Tehreek Labaik");
        votes[1].setPartyName("Pakistan Muslim League(N)");
        votes[2].setPartyName("Pakistan Muslim League(Q)");
        votes[3].setPartyName("Pakistan Peoples Party");
        votes[4].setPartyName("Pakistan Tehreek Insaaf");
        votes[5].setPartyName("ANP");
        votes[6].setPartyName("JUI (F)");
        votes[7].setPartyName("Jamat-e-Islami");
        votes[8].setPartyName("Balochistan Awamy Party(BAP)");
        for(Vote vote : list){
            
            if(vote.getPartyName().equals("Pakistan Tehreek Labaik")){
                tlp = tlp + vote.getVotes();
                votes[0].setVotes(tlp);
            }else if(vote.getPartyName().equals("Pakistan Muslim League(N)")){
                pmln = pmln + vote.getVotes();
                votes[1].setVotes(pmln);
            }else if(vote.getPartyName().equals("Pakistan Muslim League (Q)")){
                pmlq = pmlq + vote.getVotes();
                votes[2].setVotes(pmlq);
            }else if(vote.getPartyName().equals("Pakistan Peoples Party")){
                ppp = ppp + vote.getVotes();
                votes[3].setVotes(ppp);
            }else if(vote.getPartyName().equals("Pakistan Tehreek Insaaf")){
                pti = pti + vote.getVotes();
                votes[4].setVotes(pti);
            }else if(vote.getPartyName().equals("ANP")){
                anp = anp + vote.getVotes();
                votes[5].setVotes(anp);
            }else if(vote.getPartyName().equals("JUI (F)")){
                jui = jui + vote.getVotes();
                votes[6].setVotes(jui);
            }else if(vote.getPartyName().equals("Jamat-e-Islami")){
                jamateislami = jamateislami + vote.getVotes();
                votes[7].setVotes(jamateislami);
            }else if(vote.getPartyName().equals("Balochistan Awamy Party(BAP)")){
                bap = bap + vote.getVotes();
                votes[8].setVotes(bap);
            }
        }
        

        j++;
       new Elections(votes).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_resultsActionPerformed

    private void jMenu8HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jMenu8HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu8HierarchyChanged

    private void jMenu8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MousePressed
        new AboutUs().setVisible(true);
    }//GEN-LAST:event_jMenu8MousePressed
;
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
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnicid;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fathername;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JTextField name;
    private javax.swing.JButton results;
    private javax.swing.JButton vote;
    private javax.swing.JTextField voterid;
    // End of variables declaration//GEN-END:variables
}
