import java.util.Objects;

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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gadjet gadjet = (Gadjet) o;
        return Double.compare(gadjet.weight, weight) == 0 && price == gadjet.price && Objects.equals(name, gadjet.name) && Objects.equals(size, gadjet.size) && Objects.equals(title, gadjet.title) && Objects.equals(currency, gadjet.currency) && Objects.equals(metrics, gadjet.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price, size, title, currency, metrics);
    }

    @Override
    public String toString() {
        return name;
    }
}
