package Animals;

/**
 * Represents a land animal
 * Implementations provide its name and a brief description of its movement
 */
public interface LandAnimal {

    /**
     * Returns the name of this animal
     *
     * @return the animal’s name
     */
    public String getName();

    /**
     * Returns the movement of this animal
     *
     * @return the animal’s movement
     */
    public String getWalking();
}
