package Factories;

import Animals.*;
import Animals.Cenozoic.*;

import java.util.Arrays;
import java.util.List;


/**
 * CenozoicAnimalFactory implements AnimalAbstractFactory and makes animals from the Cenozoic era
 * It separates them into lists of land, sea, and sky animals
 */
public class CenozoicAnimalFactory implements AnimalAbstractFactory {

    /**
     * Return the era it represents
     */
    @Override
    public String getEra() {
        return "Cenozoic";
    }

    /**
     * Creates a list of land animals from the Cenozoic era
     *
     * @return a List of {@link LandAnimal} instances
     */
    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Mamoth(), new Sabertooth());
    }

    /**
     * Creates a list of sea animals from the Cenozoic era
     *
     * @return a List of {@link SeaAnimal} instances
     */
    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Megalodon(), new Whale());
    }

    /**
     * Creates a list of sky animals from the Cenozoic era
     *
     * @return a List of {@link SkyAnimal} instances
     */
    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Bat(), new Eagle());
    }
}
