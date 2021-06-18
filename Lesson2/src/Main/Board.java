package Main;

public class Board {
    public String material;
    public static String shape = "twin tip";
    public double size;

    @Override
    public String toString() {
        return "Сердечник его сноуборда сделан из: " + material + ", имея длину: " + size + " см, идеально подходит под его вес:  " + Snowboarder.weight + " кг.";
    }
}

