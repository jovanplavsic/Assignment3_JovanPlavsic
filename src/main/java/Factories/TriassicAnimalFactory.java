package Factories;

import Animals.LandAnimal;
import Animals.SeaAnimal;
import Animals.SkyAnimal;

import java.util.Arrays;
import java.util.List;

public class TriassicAnimalFactory implements AnimalAbstractFactory{
    @Override
    public String getEra() {
        return "Triassic";
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
