import java.util.*;

/**
 * 
 */
public class ProductCatalog {


	private Map<Integer, Product> products = new HashMap<>();
	
    public ProductCatalog() {
    	load();
    }

    
    public Product getProduct(int productID) {
        if(products.containsKey(productID)) {
        	return products.get(productID);
        }
        return null;
    }


    private void load() {
    	Product p1 = new Product(1,"TV");
    	Product p2 = new Product(2,"Stacking rings has never been more fun with the Stacks of Circles! The center of each ring is the same size, allowing it to be stacked in any direction for frustration-free play. The Stacks of Circles promotes early STEM learning by teaching a child about sorting, size, sequencing and building.");
    	Product p3 = new Product(3,"Dove Original Beauty Bar and gentle skin cleanser combines a gentle cleansing formula with our signature 1/4 moisturizing cream to hydrate and nourish skin, instead of leaving skin feeling dry and tight like an ordinary bar soap might. ");
    	
    	products.put(1,p1);
    	products.put(2, p2);
    	products.put(3, p3);
    }

}