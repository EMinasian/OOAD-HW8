//package Design Class Diagram;

import java.util.*;
import java.time.LocalTime;
/**
 * 
 */
public class Transaction {



    private int productID;
    private int actorID;
    private int quantity;
    private LocalTime time;
    private double totalPrice;
    private int transactionID;
    private String type;

  
    public Transaction(int id, LocalTime time, Offer o) {
    	this.time = time;
    	this.transactionID = id;
    	this.quantity = o.getQuantity();
    	this.totalPrice = o.getTotalPrice();
    	this.type = o.getType();
    	this.actorID = o.getActor().getID();
    	this.productID = o.getProduct().getID();
    }

}