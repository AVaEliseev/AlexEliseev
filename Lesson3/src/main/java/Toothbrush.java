public class Toothbrush extends Gadjet {

    @Override
    void destination() {
        System.out.println(" необходима каждый день, для соблюдения гигиены.");
    }

    @Override
    void need() {
        System.out.print(toString() + getName());
        destination();
        super.clean();
    }

    @Override
    void count(String i, String w) {
        System.out.println("Стоит " + getName() + " " + getPrice() + i + getWeight() + w + " имеет размер " + getSize());
    }

    @Override
    public String toString() {
        return "Электрическая зубная щетка ";
    }
}
