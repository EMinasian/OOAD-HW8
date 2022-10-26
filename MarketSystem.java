import java.time.LocalTime;

public class MarketSystem {
    private double amount;
    private double commissionPrctg;
    private ActorCatalog actorCatalog;
    private OfferCatalog offerCatalog;
    private ProductCatalog productCatalog;
    private TransactionCatalog transactionCatalog;
    
    public MarketSystem() {
    	actorCatalog = new ActorCatalog();
    	offerCatalog = new OfferCatalog();
    	productCatalog = new ProductCatalog();
    	transactionCatalog = new TransactionCatalog();
    }

    public int makeActor(String personalData, double amount) {
        return actorCatalog.makeActor(personalData, amount);
    }

    public int makeOffer(int actorID, String offerType, int productID, int quantity, double price) {
    	Actor a = actorCatalog.getActor(actorID);
    	Product p = productCatalog.getProduct(productID);
    	return offerCatalog.makeOffer(a, offerType, p, quantity, price);
    }

    public int makeTransaction(LocalTime time, int offerID) {
        Offer o = offerCatalog.getOffer(offerID);
        offerCatalog.delete(o);
        LocalTime now = LocalTime.now();
        int transactionID = transactionCatalog.makeTransaction(time, o);
        Actor a = o.getActor();
        a.updateAmount(commissionPrctg, o);
        updateAmount(o);
        return transactionID;
    }

    private void updateAmount(Offer o) {
    	this.amount = o.getTotalPrice() * commissionPrctg + this.amount;
    }
}
