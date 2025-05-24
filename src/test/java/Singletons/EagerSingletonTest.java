package Singletons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EagerSingletonTest {
    EagerSingleton first = EagerSingleton.getInstance(0);
    EagerSingleton second = EagerSingleton.getInstance(0);
    EagerSingleton third = EagerSingleton.getInstance(1);
    EagerSingleton fourth = EagerSingleton.getInstance(2);

    @Test
    void getInstance() {
        assertNotNull(first,  "Eager instance should not be null");
        assertSame(first, second, "Eager getInstance method should return the same object for the same index");
        assertNotSame(third, fourth, "Two Eager instances should not equal each other");
    }

    @Test
    void getId() {
        for (int i = 0; i < 3; i++) {
            EagerSingleton inst = EagerSingleton.getInstance(i);
            assertEquals(String.valueOf(i), inst.getId(),
                "Singletons.EagerSingleton.getId should return \"" + i + "\" for index " + i);
        }
    }

    @Test
    void testEagerIllegalArgument(){
        assertAll(
            () -> assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(-1)),
            () -> assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(3))
        );
    }
}