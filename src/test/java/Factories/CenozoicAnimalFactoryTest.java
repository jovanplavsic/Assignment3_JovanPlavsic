package Factories;

import Animals.LandAnimal;
import Animals.SeaAnimal;
import Animals.SkyAnimal;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CenozoicAnimalFactoryTest {
private final CenozoicAnimalFactory factory  = new CenozoicAnimalFactory();

    @Test
    void getEra() {
        assertEquals("Cenozoic", factory.getEra());
    }

    @Test
    void createLandAnimals() {
        List<LandAnimal> a = factory.createLandAnimals();

        assertEquals(2, a.size());

        assertTrue(a.stream().anyMatch(x -> x.getName().equals("Mamoth")));
        assertTrue(a.stream().anyMatch(x -> x.getName().equals("Sabertooth")));
    }

    @Test
    void createSeaAnimals() {
        List<SeaAnimal> b = factory.createSeaAnimals();

        assertEquals(2, b.size());

        assertTrue(b.stream().anyMatch(x -> x.getName().equals("Megalodon")));
        assertTrue(b.stream().anyMatch(x -> x.getName().equals("Whale")));
    }

    @Test
    void createSkyAnimals() {
        List<SkyAnimal> c = factory.createSkyAnimals();

        assertEquals(2, c.size());

        assertTrue(c.stream().anyMatch(x -> x.getName().equals("Bat")));
        assertTrue(c.stream().anyMatch(x -> x.getName().equals("Eagle")));
    }
}