package Factories;

import Animals.LandAnimal;
import Animals.SeaAnimal;
import Animals.SkyAnimal;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TriassicAnimalFactoryTest {
private final TriassicAnimalFactory factory  = new TriassicAnimalFactory();

    @Test
    void getEra() {
        assertEquals("Triassic", factory.getEra());
    }

    @Test
    void createLandAnimals() {
        List<LandAnimal> a = factory.createLandAnimals();

        assertEquals(2, a.size());

        assertTrue(a.stream().anyMatch(x -> x.getName().equals("Plateosaurus")));
        assertTrue(a.stream().anyMatch(x -> x.getName().equals("Coelophysis")));
    }

    @Test
    void createSeaAnimals() {
        List<SeaAnimal> b = factory.createSeaAnimals();

        assertEquals(2, b.size());

        assertTrue(b.stream().anyMatch(x -> x.getName().equals("Tanystropheus")));
        assertTrue(b.stream().anyMatch(x -> x.getName().equals("Nothosaurus")));
    }

    @Test
    void createSkyAnimals() {
        List<SkyAnimal> c = factory.createSkyAnimals();

        assertEquals(2, c.size());

        assertTrue(c.stream().anyMatch(x -> x.getName().equals("Preondactylus")));
        assertTrue(c.stream().anyMatch(x -> x.getName().equals("Eudimorphodon")));
    }
}