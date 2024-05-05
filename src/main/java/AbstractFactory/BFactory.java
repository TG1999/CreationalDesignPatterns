package AbstractFactory;

public class BFactory implements AbstractFactory {
    public Alphabets getInstance(String bType) {
        if (bType == null) {
            return null;
        }
        if (bType.equalsIgnoreCase("B1")) {
            return new B1();
        } else if (bType.equalsIgnoreCase("B2")) {
            return new B2();
        }
        return null;
    }
}
