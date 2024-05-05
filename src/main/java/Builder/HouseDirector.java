package Builder;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse() {
        return houseBuilder.setFoundation("wood")
                .setStructure("wood")
                .setRoof("wood")
                .setPainted(true)
                .build();
    }
}
