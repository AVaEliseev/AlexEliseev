public class Kettle extends Gadjet implements Action{

    public Kettle(String name, double weight, int price, String size, String title) {
        super(name, weight, price, size, title);
    }

    @Override
    void destination() {
        System.out.println(super.toString() + " очень необходим в быту.");
    }

    @Override
    public void action() {
        System.out.println("С помощью кнопки включения, чайник " +  getName() + " вскипятит воду");
    }
}
