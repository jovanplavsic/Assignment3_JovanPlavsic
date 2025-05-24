package Factories;

import Animals.Triassic.*;
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
        return Arrays.asList(new Plateosaurus(), new Coelophysis());
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Tanystropheus(), new Nothosaurus());
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Preondactylus(), new Eudimorphodon());
    }
}
