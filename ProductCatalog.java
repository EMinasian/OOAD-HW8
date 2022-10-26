
import java.util.*;

/**
 * 
 */
public class ProductCatalog {


	Map<Integer, Product> products = new HashMap<>();
	
    public ProductCatalog() {
    }

    
    public Product getProduct(int productID) {
        if(products.containsKey(productID)) {
        	return products.get(productID);
        }
        return null;
    }


//    private void load() {
//        // TODO implement here
//    }

}