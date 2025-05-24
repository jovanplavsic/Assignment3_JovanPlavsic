package Singletons;

public class EagerSingleton {
    private static EagerSingleton[] INSTANCES = new EagerSingleton[3];
    static {
        for (int i = 0; i < INSTANCES.length; i++) {
            INSTANCES[i] = new EagerSingleton(i);
            System.out.println("Eager Singleton " + i + " instantiated");
        }
    }
    private final String id;


    private EagerSingleton(int id) {
        this.id = Integer.toString(id);
    }

    public static EagerSingleton getInstance(int idx) {

        if (idx >= 0 && idx < INSTANCES.length){
            return INSTANCES[idx];
        } else{
            throw new IllegalArgumentException();
        }
    }

    public String getId() {
        return this.id;
    }
}