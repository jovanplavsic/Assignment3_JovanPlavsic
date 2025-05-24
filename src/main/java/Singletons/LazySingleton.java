package Singletons;

/**
 * Implements Lazy Singleton pattern for only 3 instances. All instances are created only when first called
 */
public class LazySingleton {
    /**
     * Array of instances holds a max of 3 instances
     */
    private static LazySingleton[] INSTANCES = new LazySingleton[3];

    /**
     * Unique identifier for each instance
     */
    private final String id;

    /**
     * Instantiates a lazy singleton
     *
     * @param id is the unique identifier for that instance
     */
    private LazySingleton(int id) {
        this.id = String.valueOf(id);
    }

    /**
     * Returns an instance depending on it's index in the list which corresponds with its id
     * If id is within bounds of list but has no singleton, the singleton is instantiated and returned
     *
     * @param idx is the identifier and location and list
     * @return an LazySingleton object
     * @throws IllegalArgumentException if idx is outside of list bounds
     */
    public static LazySingleton getInstance(int idx) {
        if (idx < 0 || idx >= INSTANCES.length) {
            throw new IllegalArgumentException();
        }
        if (INSTANCES[idx] == null) {
            INSTANCES[idx] = new LazySingleton(idx);
            System.out.println("Lazy Singleton " + idx + " instantiated");
        }
        return INSTANCES[idx];
    }

    /**
     * Returns the id for this singleton instance
     */
    public String getId() {
        return this.id;
    }
}
