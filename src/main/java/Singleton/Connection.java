package Singleton;

public class Connection {
    // Eager initialization
    private static Connection instance = new Connection();

    private Connection() {
    }

    public static Connection getInstance() {
        return instance;
    }

    // Lazy initialization

}

