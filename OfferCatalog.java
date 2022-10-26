

import java.util.*;


public class OfferCatalog {


	private List<Offer> offers = new ArrayList<>();
	
    public OfferCatalog() {
    }

    public void delete(Offer o) {
        for(int i = 0; i < offers.size(); i++) {
        	if(offers.get(i).equals(o)) {
        		offers.set(i, null);
        		return;
        	}
        }
    }

    private int generateOfferID() {
    	int id = 0;
    	for(; id < offers.size(); id++) {
    		if(offers.get(id) == null) return id;
    	}
    	return id++;

    }


    public Offer getOffer(int offerID) {
        return offers.get(offerID);
    }


    public int makeOffer(Actor a, String offerType, Product p, int quantity, double price) {
    	int id = generateOfferID();
    	Offer offer = new Offer(a, p, id, offerType, quantity, price);
    	offers.set(id, offer);
        return id;
    }

}