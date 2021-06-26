public abstract class Gadjet {

    private String name;
    private double weight;
    private int price;
    private String size;
    private String title;

    private final String currency = "$";
    private final String metrics = "кг";

    abstract void destination();

    public Gadjet(String name, double weight, int price, String size, String title) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.size = size;
        this.title = title;
    }

    void count() {
        System.out.println("Стоит " + title + " " + name + " " + price + currency + ", его вес " + weight + " " + metrics + " имеет размер " + size);
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Этот гаджет";
    }
}
