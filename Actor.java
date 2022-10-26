import java.util.*;


public class Actor {

    private int actorID;
    private double amount;
    private String personalData;


    public Actor(int actorID, String personalData, double amount) {
    	this.actorID = actorID;
    	this.personalData = personalData;
    	this.amount = amount;
    }
    
    public int getID() {
    	return this.actorID;
    }
    
    public double getAmount()
    {
    	return this.amount;
    }
    
    public String getPersonalData()
    {
    	return this.personalData;
    }
    
   public void setPersonalData(String str)
   {
	   this.personalData = str;
   }
    public void updateAmount(double commissionPrctg, Offer o) {
    	
    	if(o.getType().equals("sell")) {
    		this.amount = this.amount + o.getTotalPrice() * (1 - commissionPrctg);
    	} else {
    		this.amount = this.amount - o.getTotalPrice() * (1 + commissionPrctg);
    	}
    }

}
