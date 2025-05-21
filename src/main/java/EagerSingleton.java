public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private final String id;

    private EagerSingleton() {
        this.id = "0";
    }

    public static EagerSingleton getInstance(int i) {
        return instance;
    }

    public String getId() {
        return this.id;
    }
}