public class LazySingleton {
    private static LazySingleton[] INSTANCES = new LazySingleton[3];
    private final String id;

    private LazySingleton(int i) {
        this.id = String.valueOf(i);
    }

    public static LazySingleton getInstance(int idx) {
        if (idx < 0 || idx >= INSTANCES.length) {
            throw new IllegalArgumentException();
        }
        if (INSTANCES[idx] == null) {
            INSTANCES[idx] = new LazySingleton(idx);
            System.out.println("Lazy Singleton " + idx + " instantiated");
        }
        return INSTANCES[idx];
    }

    public String getId() {
        return this.id;
    }
}
