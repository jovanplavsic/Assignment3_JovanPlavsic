package Factories;

import Animals.*;
import Animals.Jurassic.*;

import java.util.Arrays;
import java.util.List;

/**
 * JurassicAnimalFactory implements AnimalAbstractFactory and makes animals from the Jurassic era
 * It separates them into lists of land, sea, and sky animals
 */
public class JurassicAnimalFactory implements AnimalAbstractFactory {
     /**
     * Return the era it represents
     */
    @Override
    public String getEra() {
        return "Jurassic";
    }

    /**
     * Creates a list of land animals from the Jurassic era
     *
     * @return a List of {@link LandAnimal} instances
     */
    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Stegosaurus(), new Allosaurus());
    }

    /**
     * Creates a list of sea animals from the Jurassic era
     *
     * @return a List of {@link SeaAnimal} instances
     */
    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Liopleurodon(), new Plesiosaurus());
    }

     /**
     * Creates a list of sky animals from the Jurassic era
     *
     * @return a List of {@link SkyAnimal} instances
     */
    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Pterodactylus(), new Rhamphorhynchus());
    }
}
