
//package Design Class Diagram;
import java.util.Random;
import java.util.ArrayList;
import java.util.*;

/**
 * 
 */
public class Transaction {
	
	private int actorID;
    private int productID;
    private int quantity = 0;
    private String time;
    private double totalPrice;
    private int transactionID;
    private String type;
  
    /**
     * @param time 
     * @param o
     */
    /**
     * Default constructor
     */
    public Transaction(Offer o, String time1) {
    	actorID = o.getActor().getID();
    	productID = o.getProduct().getID();
    	quantity = o.getQuantity();
    	time = time1;
    	totalPrice = o.getTotal();
    	transactionID = generateID();
    	type = o.getType();
    }
    
    private int generateID() {
    	Random rand = new Random(); 
        int upperbound = 1234567890;
        int int_random = rand.nextInt(upperbound); 
        // Should have some list of Ids to not have repetitions 
        return int_random;
    }
    /// Should we add getters and setters here ? 

   

}
