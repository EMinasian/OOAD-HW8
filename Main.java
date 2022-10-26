import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.of(10,43,12); 
		

		MarketSystem system = new MarketSystem(0.5);
		
		int actorId1 = system.makeActor("Erik", 10000);
		int actorId2 = system.makeActor("Anna", 60000);
		
		
		System.out.println("The first actor id is " + actorId1 + " and the second is " + actorId2);
		
		int offerId1 = system.makeOffer(actorId1, "sell", 1, 3, 500);
		int offerId2 = system.makeOffer(actorId2, "sell", 2, 2, 330.5);
		
		System.out.println("The first offer id is " + offerId1 + " and the second is " + offerId2);
		
		int transId1 = system.makeTransaction(time, offerId1);
		int transId2 = system.makeTransaction(time, offerId2);
		
		System.out.println("The first transaction id is " + transId1 + " and the second is " + transId2);
		Actor anna = system.getActorCatalog().getActor(actorId2);
		Actor erik = system.getActorCatalog().getActor(actorId1);
		if(system.getAmount() == 1080.5 && erik.getAmount() == 10750.0 && anna.getAmount() == 60330.5) {
			System.out.println("The test is passed");
		}
		else{
			System.out.println("Faliure");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("We choose the commissionPrctg equal to 0.5 to make amount calculations easier for us! "
				+ "In case of other values we should calculate the amounts one more time");
		
		
	}

}