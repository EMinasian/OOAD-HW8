//package Design Class Diagram;

import java.util.*;

/**
 * 
 */
public class ActorCatalog {
	
	private int counter;
	private List<Actor> actors = new ArrayList<>();


    public ActorCatalog() {
    	counter = 0;
    }

    /**
     * 
     */
//    private Actor actors {List};

    /**
     * @return
     */
    private int generateActorID() {
        return counter++;
    }

    /**
     * @param actorID 
     * @return
     */
    public Actor getActor(int actorID) {
        return actors.get(actorID);
    }

    /**
     * 
     */
    private void load() {
        // TODO implement here
    }

    /**
     * @param personalData 
     * @param amount 
     * @return
     */
    public int makeActor(String personalData, double amount) {
        int actorID = generateActorID();
        Actor actor = new Actor(actorID, personalData, amount);
        actors.add(actorID, actor);
        return actorID;
    }

}