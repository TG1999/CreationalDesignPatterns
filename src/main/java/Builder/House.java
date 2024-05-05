package Builder;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean isPainted;

    public House(String foundation, String structure, String roof, boolean isPainted) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.isPainted = isPainted;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public boolean isPainted() {
        return isPainted;
    }

    public void setPainted(boolean painted) {
        isPainted = painted;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", isPainted=" + isPainted +
                '}';
    }
}
