package Singletons;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * Create order so that the testInstancesInitializedLazily is run first
 * and other tests don't interfere by calling .getInstance early
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

/**
 * Unit tests for the {@link LazySingleton} class.
 * Verifies that the lazy singleton instances behave correctly
 */
class LazySingletonTest {

    /**
     * Checks that no instances have been created right after class loads,
     * and before any call to .getInstance()
     */
    @Order(1)
    @Test
    void testInstancesInitializedLazily() throws Exception {
        Field instField = LazySingleton.class.getDeclaredField("INSTANCES");
        instField.setAccessible(true);

        LazySingleton[] all = (LazySingleton[]) instField.get(null);

        for (int i = 0; i < all.length; i++) {
            assertNull(
                    all[i],
                    "INSTANCES[" + i + "] should not be created yet"
            );
        }

    }

    /**
     * Tests {@code getInstance}
     * Make sure existing instance doesn't return null
     * Same index points to the same object
     * Different indexes point to different objects
     */

    @Order(2)
    @Test
    void getInstance() {
        /**
         * First instance created with index 0
         * Second instance created with index 0 (same object as first)
         * Third instance created with index 1
         * Fourth instance created with index 2
         */
        LazySingleton first = LazySingleton.getInstance(0);
        LazySingleton second = LazySingleton.getInstance(0);
        LazySingleton third = LazySingleton.getInstance(1);
        LazySingleton fourth = LazySingleton.getInstance(2);

        assertNotNull(first, "Lazy instance should not be null");
        assertSame(first, second, "Lazy getInstance method should return the same object for the same index");
        assertNotSame(third, fourth, "Two Lazy instances should not equal each other");
    }

    /**
     * Tests that each objects returnID returns the proper ID
     */
    @Order(3)
    @Test
    void getId() {
        for (int i = 0; i < 3; i++) {
            LazySingleton inst = LazySingleton.getInstance(i);
            assertEquals(String.valueOf(i), inst.getId(),
                    "Singletons.LazySingleton.getId should return \"" + i + "\" for index " + i);
        }
    }

    /**
     * Tests that it throws an error when given index is out of bounds
     */
    @Order(4)
    @Test
    void testLazyIllegalArgument() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(-1)),
                () -> assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(3))
        );
    }
}