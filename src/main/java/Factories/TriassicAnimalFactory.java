package Factories;

import Animals.Triassic.*;
import Animals.LandAnimal;
import Animals.SeaAnimal;
import Animals.SkyAnimal;

import java.util.Arrays;
import java.util.List;

/**
 * TriassicAnimalFactory implements AnimalAbstractFactory and makes animals from the Triassic era
 * It separates them into lists of land, sea, and sky animals
 */
public class TriassicAnimalFactory implements AnimalAbstractFactory {
    /**
     * Return the era it represents
     */
    @Override
    public String getEra() {
        return "Triassic";
    }

    /**
     * Creates a list of land animals from the Triassic era
     *
     * @return a List of {@link LandAnimal} instances
     */
    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Plateosaurus(), new Coelophysis());
    }

    /**
     * Creates a list of sea animals from the Triassic era
     *
     * @return a List of {@link SeaAnimal} instances
     */
    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Tanystropheus(), new Nothosaurus());
    }

    /**
     * Creates a list of sky animals from the Triassic era
     *
     * @return a List of {@link SkyAnimal} instances
     */
    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Preondactylus(), new Eudimorphodon());
    }
}
