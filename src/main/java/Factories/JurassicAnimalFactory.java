package Factories;

import Animals.*;
import Animals.Jurassic.*;

import java.util.Arrays;
import java.util.List;

public class JurassicAnimalFactory implements AnimalAbstractFactory {
    @Override
    public String getEra() {
        return "Jurassic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Stegosaurus(), new Allosaurus());
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Liopleurodon(), new Plesiosaurus());
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Pterodactylus(), new Rhamphorhynchus());
    }
}
