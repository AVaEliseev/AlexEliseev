public class Kettle extends Gadjet implements Action{

    @Override
    void destination() {
        System.out.println(" очень необходим в быту.");
    }

    @Override
    void need() {
        System.out.print(toString() + getName());
        destination();

    }

    @Override
    void count(String i, String w) {
        System.out.println("Стоит " + getName() + " " + getPrice() + i + getWeight() + w + " имеет размер " + getSize());
    }


    @Override
    public void action() {
        System.out.print("С помощью кнопки, " + toString());
        System.out.println(act);
    }

    @Override
    public String toString() {
        return "Чайник ";
    }
}
