package Factories;

import Animals.LandAnimal;
import Animals.SeaAnimal;
import Animals.SkyAnimal;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JurassicAnimalFactoryTest {
private final JurassicAnimalFactory factory  = new JurassicAnimalFactory();

    @Test
    void getEra() {
        assertEquals("Jurassic", factory.getEra());
    }

    @Test
    void createLandAnimals() {
        List<LandAnimal> a = factory.createLandAnimals();

        assertEquals(2, a.size());

        assertTrue(a.stream().anyMatch(x -> x.getName().equals("Stegosaurus")));
        assertTrue(a.stream().anyMatch(x -> x.getName().equals("Allosaurus")));
    }

    @Test
    void createSeaAnimals() {
        List<SeaAnimal> b = factory.createSeaAnimals();

        assertEquals(2, b.size());

        assertTrue(b.stream().anyMatch(x -> x.getName().equals("Liopleurodon")));
        assertTrue(b.stream().anyMatch(x -> x.getName().equals("Plesiosaurus")));
    }

    @Test
    void createSkyAnimals() {
        List<SkyAnimal> c = factory.createSkyAnimals();

        assertEquals(2, c.size());

        assertTrue(c.stream().anyMatch(x -> x.getName().equals("Pterodactylus")));
        assertTrue(c.stream().anyMatch(x -> x.getName().equals("Rhamphorhynchus")));
    }
}