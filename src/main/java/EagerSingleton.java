public class EagerSingleton {
    private static EagerSingleton[] INSTANCES = new EagerSingleton[3];
    static {
        for (int i = 0; i < INSTANCES.length; i++) {
            INSTANCES[i] = new EagerSingleton(i);
        }
    }
    private final int id;


    private EagerSingleton(int id) {
        this.id = id;
    }

    public static EagerSingleton getInstance(int idx) {

        if (idx >= 0 && idx < INSTANCES.length){
            return INSTANCES[idx];
        } else{
            throw new IllegalArgumentException();
        }
    }

    public String getId() {
        return Integer.toString(this.id);
    }
}