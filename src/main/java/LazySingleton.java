public class LazySingleton {
    private static LazySingleton instance;
    private final String id;

    private LazySingleton(int i){
        this.id = String.valueOf(i);
    }
    public static LazySingleton getInstance(int i) {
        return instance;
    }

    public String getId() {
        return this.id;
    }
}
