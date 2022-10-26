//package Design Class Diagram;

import java.util.*;

/**
 * 
 */
public class Offer {

    private int offerID;
    private int quantity;
    private double totalPrice;
    private String type;
    private Actor actor;
    private Product product;

    public Offer(Actor a, Product p, int offerID, String offerType, int quantity, double price) {
    	this.actor = a;
    	this.offerID = offerID;
    	this.type = offerType;
    	this.quantity = quantity;
    	this.totalPrice = price * this.quantity;
    	this.product = p;
    }

    public int getID() {
    	return this.offerID;
    }
    public Actor getActor() {
        return this.actor;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public double getTotalPrice() {
        return this.totalPrice;
    }
    
    public String getType() {
        return this.type;
    }
    
    public Product getProduct() {
        return this.product;
    }

}