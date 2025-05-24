package Singletons;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link EagerSingleton} class.
 * Verifies that the eager singleton instances behave correctly
 */
class EagerSingletonTest {

    /**
     * Tests that the instances have been created as soon as class was loaded
     */
    @Test
    void testInstancesInitializedEagerly() throws Exception {
        Field instField = EagerSingleton.class.getDeclaredField("INSTANCES");
        instField.setAccessible(true);

        EagerSingleton[] all = (EagerSingleton[]) instField.get(null);

        for (int i = 0; i < all.length; i++) {
            assertNotNull(
                    all[i],
                    "INSTANCES[" + i + "] should have been created eagerly"
            );
        }
    }


    /**
     * Tests {@code getInstance}
     * Make sure existing instance doesn't return null
     * Same index points to the same object
     * Different indexes point to different objects
     */

    @Test
    void getInstance() {
        /**
         * First instance created with index 0
         * Second instance created with index 0 (same object as first)
         * Third instance created with index 1
         * Fourth instance created with index 2
         */
        EagerSingleton first = EagerSingleton.getInstance(0);
        EagerSingleton second = EagerSingleton.getInstance(0);
        EagerSingleton third = EagerSingleton.getInstance(1);
        EagerSingleton fourth = EagerSingleton.getInstance(2);

        assertNotNull(first, "Eager instance should not be null");
        assertSame(first, second, "Eager getInstance method should return the same object for the same index");
        assertNotSame(third, fourth, "Two Eager instances should not equal each other");
    }

    /**
     * Tests that each objects returnID returns the proper ID
     */
    @Test
    void getId() {
        for (int i = 0; i < 3; i++) {
            EagerSingleton inst = EagerSingleton.getInstance(i);
            assertEquals(String.valueOf(i), inst.getId(),
                    "Singletons.EagerSingleton.getId should return \"" + i + "\" for index " + i);
        }
    }

    /**
     * Tests that it throws an error when given index is out of bounds
     */
    @Test
    void testEagerIllegalArgument() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> EagerSingleton.getInstance(-1)),
                () -> assertThrows(IllegalArgumentException.class, () -> EagerSingleton.getInstance(3))
        );
    }
}