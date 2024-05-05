package AbstractFactory;

public class AbstractFactoryProducer {
    // use AFactory to get object of type A
    public AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }
        if (factoryType.equalsIgnoreCase("A")) {
            return new AFactory();
        } else if (factoryType.equalsIgnoreCase("B")) {
            return new BFactory();
        }
        return null;
    }
    public static void main(String[] args) {
        AbstractFactoryProducer factory = new AbstractFactoryProducer();
        AbstractFactory aFactory = factory.getFactory("A");
        Alphabets a1 = aFactory.getInstance("A1");
        a1.print();
        Alphabets a2 = aFactory.getInstance("A2");
        a2.print();
        AbstractFactory bFactory = factory.getFactory("B");
        Alphabets b1 = bFactory.getInstance("B1");
        b1.print();
        Alphabets b2 = bFactory.getInstance("B2");
        b2.print();
    }
}
