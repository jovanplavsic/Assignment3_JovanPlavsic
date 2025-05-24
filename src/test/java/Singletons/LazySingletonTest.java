package Singletons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonTest {
    LazySingleton first = LazySingleton.getInstance(0);
    LazySingleton second = LazySingleton.getInstance(0);
    LazySingleton third = LazySingleton.getInstance(1);
    LazySingleton fourth = LazySingleton.getInstance(2);

    @Test
    void getInstance() {
        assertNotNull(first,  "Lazy instance should not be null");
        assertSame(first, second, "Lazy getInstance method should return the same object for the same index");
        assertNotSame(third, fourth, "Two Lazy instances should not equal each other");
    }

    @Test
    void getId() {
        for (int i = 0; i < 3; i++) {
            LazySingleton inst = LazySingleton.getInstance(i);
            assertEquals(String.valueOf(i), inst.getId(),
                "Singletons.LazySingleton.getId should return \"" + i + "\" for index " + i);
        }
    }

    @Test
    void testLazyIllegalArgument(){
        assertAll(
            () -> assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(-1)),
            () -> assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(3))
        );
    }
}