package Builder;

public class HouseBuilder {
    private String foundation;
    private String structure;
    private String roof;
    private boolean isPainted;

    public HouseBuilder setFoundation(String foundation) {
        this.foundation = foundation;
        return this;
    }

    public HouseBuilder setStructure(String structure) {
        this.structure = structure;
        return this;
    }

    public HouseBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }

    public HouseBuilder setPainted(boolean painted) {
        isPainted = painted;
        return this;
    }

    public House build() {
        return new House(foundation, structure, roof, isPainted);
    }
}
