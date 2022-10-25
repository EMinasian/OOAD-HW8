//package Design Class Diagram;

import java.util.*;

/**
 * 
 */
public class System {

    /**
     * Default constructor
     */


    /**
     * 
     */
    private double amount;
    private double commissionPrctg;
    private ActorCatalog actorCatalog;
    private OfferCatalog offerCatalog;
    private ProductCatalog productCatalog;
    private TransactionCatalog transactionCatalog;
    
    public System() {
    	actorCatalog = new ActorCatalog();
    }


//    public void create() {
//        // TODO implement here
//    }


    public int makeActor(String personalData, double amount) {
        return actorCatalog.makeActor(personalData, amount);
    }

    /**
     * @param actorID 
     * @param offerType 
     * @param productID 
     * @param quantity 
     * @param price 
     * @return
     */
    public OfferID makeOffer(void actorID, void offerType, void productID, void quantity, void price) {
        // TODO implement here
        return null;
    }

    /**
     * @param time 
     * @param offerID 
     * @return
     */
    public TransactionID makeTransaction(void time, void offerID) {
        // TODO implement here
        return null;
    }

    /**
     * @param o
     */
    private void updateAmount(void o) {
        // TODO implement here
    }

}