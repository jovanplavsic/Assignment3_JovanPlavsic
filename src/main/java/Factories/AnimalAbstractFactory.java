package Factories;

import Animals.LandAnimal;
import Animals.SeaAnimal;
import Animals.SkyAnimal;

/**
 * Defines a factory for grouping animals by its era
 * Each factory knows its own era and methods to create land, sea, and sky animal exhibits.
 */
import java.util.List;

public interface AnimalAbstractFactory {
    /**
     * Return the era it represents
     */
    String getEra();

    /**
     * Creates a list of land animals from the that era
     *
     * @return a List of {@link LandAnimal} instances
     */
    public List<LandAnimal> createLandAnimals();

    /**
     * Creates a list of sea animals from the that era
     *
     * @return a List of {@link SeaAnimal} instances
     */
    public List<SeaAnimal> createSeaAnimals();

    /**
     * Creates a list of sky animals from the that era
     *
     * @return a List of {@link SkyAnimal} instances
     */
    public List<SkyAnimal> createSkyAnimals();
}
