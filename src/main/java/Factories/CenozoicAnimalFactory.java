package Factories;

import Animals.*;
import Animals.Cenozoic.Bat;
import Animals.Cenozoic.Mamoth;
import Animals.Cenozoic.Megalodon;

import java.util.Arrays;
import java.util.List;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {

    @Override
    public String getEra(){
        return "Cenozoic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Mamoth());
    }

    @Override
    public List<SeaAnimal> createSeaAnimals(){
        return Arrays.asList(new Megalodon());
    }

    @Override
    public List<SkyAnimal> createSkyAnimals(){
        return Arrays.asList(new Bat());
    }
}
