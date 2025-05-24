package Singletons;

/**
 * Implements Eager Singleton pattern for only 3 instances. All instances are created when class is loaded.
 */
public class EagerSingleton {

    /**
     * Array of instances holds a max of 3 instances
     */
    private static EagerSingleton[] INSTANCES = new EagerSingleton[3];

    /** Instantiates all three instances when class is loaded */
    static {
        for (int i = 0; i < INSTANCES.length; i++) {
            INSTANCES[i] = new EagerSingleton(i);
            System.out.println("Eager Singleton " + i + " instantiated");
        }
    }

    /**
     * Unique identifier for each instance
     */
    private final String id;

    /**
     * Instantiates an eager singleton
     *
     * @param id is the unique identifier for that instance
     */
    private EagerSingleton(int id) {
        this.id = Integer.toString(id);
    }

    /**
     * Returns an instance dependingon it's index in the list which corresponds with its id
     *
     * @param idx is the identifier and location and list
     * @return an EagerSingleton object
     * @throws IllegalArgumentException if idx is outside of possible locations
     */
    public static EagerSingleton getInstance(int idx) {

        if (idx >= 0 && idx < INSTANCES.length) {
            return INSTANCES[idx];
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns the id for this eager singleton instance
     */
    public String getId() {
        return this.id;
    }
}