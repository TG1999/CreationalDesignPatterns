package Builder;

public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        House house = houseDirector.buildHouse();
        System.out.println(house);
    }
}
