import java.util.*;


public class OfferCatalog {

	private int counter;
	private List<Offer> offers = new ArrayList<>();
	
    public OfferCatalog() {
    	counter = 0;
    }

    public void delete(Offer o) {
        for(int i = 1; i <= offers.size(); i++) {
        	if(offers.get(1).getID() == o.getID()) {
        		offers.set(i, null);
        		return;
        	}
        }
    }

    private int generateOfferID() {
    	  return counter++;

    }


    public Offer getOffer(int offerID) {
        return offers.get(offerID);
    }


    public int makeOffer(Actor a, String offerType, Product p, int quantity, double price) {
    	int id = generateOfferID();
    	Offer offer = new Offer(a, p, id, offerType, quantity, price);
    	offers.add(id, offer);
        return id;
    }

}