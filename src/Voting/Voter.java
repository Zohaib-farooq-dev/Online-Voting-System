
package Voting;

import java.io.Serializable;


public class Voter implements Serializable{
    
   private String name;
   private String fatherName;
   private long  CnicId;
   private String ContactNo;
   private int  VoterId;
   private String Password;

    public Voter() {
    }

    public Voter(String name, String fatherName, long CnicId, String ContactNo, int VoterId, String Password) {
        this.name = name;
        this.fatherName = fatherName;
        this.CnicId = CnicId;
        this.ContactNo = ContactNo;
        this.VoterId = VoterId;
        this.Password = Password;
    }

   

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getFatherName() {
        return fatherName;
    }
     public void setCnicId(long CnicId) {
        this.CnicId = CnicId;
    }
    public long getCnicId() {
        return CnicId;
    }
     public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }
    public String getContactNo() {
        return ContactNo;
    }
    public void setVoterId(int VoterId) {
        this.VoterId = VoterId;
    }
    public int getVoterId() {
        return VoterId;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }
    

    
   
   
    
}
