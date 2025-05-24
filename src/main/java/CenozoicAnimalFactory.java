import Animals.*;

import java.util.Arrays;
import java.util.List;

public class CenozoicAnimalFactory extends AnimalAbstractFactory {

    @Override
    public String getEra(){
        return "Cenozoic";
    };

    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Mamoth());
    }

    @Override
    List<SeaAnimal> createSeaAnimals(){
        return Arrays.asList(new Megalodon());
    }

    @Override
    List<SkyAnimal> createSkyAnimals(){
        return Arrays.asList(new Bat());
    }
}
