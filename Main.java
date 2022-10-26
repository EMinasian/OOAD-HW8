
public class Main {

	public static void main(String[] args) {
		

		MarketSystem system = new MarketSystem();
		
		int actorId1 = system.makeActor("Erik", 10000);
		int actorId2 = system.makeActor("Anna", 60000);
		
		System.out.println("The first actor id is " + actorId1 + " and the second is " + actorId2);
	}

}
