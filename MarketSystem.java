import java.time.LocalTime;

public class MarketSystem {
    private double amount;
    private double commissionPrctg;
    private ActorCatalog actorCatalog;
    private OfferCatalog offerCatalog;
    private ProductCatalog productCatalog;
    private TransactionCatalog transactionCatalog;
    
    public MarketSystem(double cp) {
    	commissionPrctg = cp;
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

    public double getAmount(){
    	return this.amount;
    }
    
    public double getCommissionPrctg(){
    	return this.commissionPrctg;
    }
    
    public ActorCatalog getActorCatalog () {
    	return this.actorCatalog;
    }
    
    public ProductCatalog getProductCatalog() {
    	return this.productCatalog;
    }
    
    public OfferCatalog getOfferCatalog() {
    	return this.offerCatalog;
    }
    
    public TransactionCatalog getTransactionCatalog() {
    	return this.transactionCatalog;
    }
    
    public void setCommissionPrctg(double cp) {
    	this.commissionPrctg = cp;
    }
    
    
    private void updateAmount(Offer o) {
    	this.amount = o.getTotalPrice() * commissionPrctg + this.amount;
    }
}