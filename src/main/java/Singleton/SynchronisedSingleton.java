package Singleton;

public class SynchronisedSingleton {
    private static SynchronisedSingleton instance;

    private SynchronisedSingleton() {
    }

    public static synchronized SynchronisedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronisedSingleton();
        }
        return instance;
    }
}
