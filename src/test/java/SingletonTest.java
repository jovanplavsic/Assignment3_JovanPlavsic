import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {
    @Test
    void testLazyInstantiation(){
        LazySingleton first  = LazySingleton.getInstance(0);
        LazySingleton second = LazySingleton.getInstance(0);
        LazySingleton third  = LazySingleton.getInstance(1);
        LazySingleton fourth = LazySingleton.getInstance(2);

        assertNotNull(first,  "Lazy instance should not be null");
        assertSame(first, second, "Lazy getInstance method should return the same object for the same index");
        assertNotSame(third, fourth, "Two Lazy instances should not equal each other");
    }

    @Test
    void testEagerInstantiation(){
        EagerSingleton first  = EagerSingleton.getInstance(0);
        EagerSingleton second = EagerSingleton.getInstance(0);
        EagerSingleton third = EagerSingleton.getInstance(1);
        EagerSingleton fourth = EagerSingleton.getInstance(2);

        assertNotNull(first,  "Eager instance should not be null");
        assertSame(first, second, "Eager getInstance method should return the same object for the same index");
        assertNotSame(third, fourth, "Two Eager instances should not equal each other");
    }

    @Test
    void testLazyListReturnsCorrectIdx(){
        for (int i = 0; i < 3; i++) {
            LazySingleton inst = LazySingleton.getInstance(i);
            assertEquals(String.valueOf(i), inst.getId(),
                "LazySingleton.getId should return \"" + i + "\" for index " + i);
        }
    }

    @Test
    void testEagerListReturnsCorrectIdx(){
        for (int i = 0; i < 3; i++) {
            EagerSingleton inst = EagerSingleton.getInstance(i);
            assertEquals(String.valueOf(i), inst.getId(),
                "EagerSingleton.getId should return \"" + i + "\" for index " + i);
        }
    }

    @Test
    void testLazyIllegalArgument(){
        assertAll(
            () -> assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(-1)),
            () -> assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(3))
        );
    }

    @Test
    void testEagerIllegalArgument(){
        assertAll(
            () -> assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(-1)),
            () -> assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(3))
        );
    }
}
