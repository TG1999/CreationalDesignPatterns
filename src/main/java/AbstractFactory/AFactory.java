package AbstractFactory;

public class AFactory implements AbstractFactory {
    public Alphabets getInstance(String aType) {
        if (aType == null) {
            return null;
        }
        if (aType.equalsIgnoreCase("A1")) {
            return new A1();
        } else if (aType.equalsIgnoreCase("A2")) {
            return new A2();
        }
        return null;
    }
}
