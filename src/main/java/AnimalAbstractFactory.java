import Animals.LandAnimal;
import Animals.SeaAnimal;
import Animals.SkyAnimal;

import java.util.List;

public interface AnimalAbstractFactory {
    String getEra();

    public List<LandAnimal> createLandAnimals();

    public List<SeaAnimal> createSeaAnimals();

    public List<SkyAnimal> createSkyAnimals();
}
