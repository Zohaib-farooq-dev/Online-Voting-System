
package Voting;

import java.io.Serializable;

public class Vote implements Serializable {
    
    private String name ;
    private boolean voted;
    private String partyName;
    private int Votes;

    public Vote() {
    }
public Vote(String paryname, int votes){
     this.partyName = partyName;
        this.Votes = Votes;
}
    public Vote(String partyName, int Votes,String name, boolean voted) {
        this.partyName = partyName;
        this.Votes = Votes;
        this.name = name;
        this.voted = voted;
    }

    
   

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }
    public String getPartyName() {
        return partyName;
    }
    public void setVotes(int Votes) {
        this.Votes = Votes;
    }
    public int getVotes() {
        return Votes;
    }

    public void setName(String name) {
        this.name = name;
    } public String getName() {
        return name;
    }
    public void setVoted(boolean voted) {
        this.voted = voted;
    } public boolean isVoted() {
        return voted;
    }


    
    @Override
    public String toString() {
        return "Vote{" + "partyName=" + partyName + ", Votes=" + Votes ;
    }
    

    

    
    
    
    
}
