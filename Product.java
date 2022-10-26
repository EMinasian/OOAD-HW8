import java.util.*;

/**
 * 
 */
public class Product {

    private String description;
    private int productID;
    
    public Product(int id, String description) {
    	this.description = description;
    	this.productID = id;
    }

    public int getID() {
    	return this.productID;
    }

}