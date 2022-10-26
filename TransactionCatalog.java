
import java.util.*;
import java.time.LocalTime;

/**
 * 
 */
public class TransactionCatalog {

    Map<Integer, Transaction> transactions = new HashMap<>();
    
    public TransactionCatalog() {

    }

    private int generateID() {
    	int id = 0;
    	for(; id <= transactions.size(); id++) {
    		if(transactions.get(id) == null) {
    			return id;
    		}
    	}
    	return id++;
    }


    public int makeTransaction(LocalTime time, Offer o) {
        int id = generateID();
        Transaction transaction = new Transaction(id, time, o);
        transactions.put(id, transaction);
        return id;
    }

}