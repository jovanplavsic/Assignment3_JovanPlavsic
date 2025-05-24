package Factories;

import Animals.*;
import Animals.Cenozoic.*;

import java.util.Arrays;
import java.util.List;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {

    @Override
    public String getEra(){
        return "Cenozoic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Mamoth(), new Sabertooth());
    }

    @Override
    public List<SeaAnimal> createSeaAnimals(){
        return Arrays.asList(new Megalodon(), new Whale());
    }

    @Override
    public List<SkyAnimal> createSkyAnimals(){
        return Arrays.asList(new Bat(), new Eagle());
    }
}
