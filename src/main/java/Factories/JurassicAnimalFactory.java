package Factories;

import Animals.*;

import java.util.Arrays;
import java.util.List;

public class JurassicAnimalFactory implements AnimalAbstractFactory {
    @Override
    public String getEra() {
        return "Jurassic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList();
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList();
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList();
    }
}
