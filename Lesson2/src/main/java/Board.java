import java.util.Objects;

public class Board {
    private String material;
    private String shape = "twin tip";
    private double size;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return "Сердечник его сноуборда сделан из: " + material + ", имея длину: " + size + " см, идеально подходит под его вес:  " + Snowboarder.weight + " кг.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Double.compare(board.size, size) == 0 && Objects.equals(material, board.material) && Objects.equals(shape, board.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, shape, size);
    }
}

