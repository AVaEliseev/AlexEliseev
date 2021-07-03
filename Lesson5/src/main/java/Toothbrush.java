public class Toothbrush extends Gadjet implements Action {

    public Toothbrush(String name, double weight, int price, String size, String title) {
        super(name, weight, price, size, title);
    }

    @Override
    void destination() {
        System.out.println(getTitle() + " необходима каждый день, для соблюдения гигиены.");
    }

    @Override
    public void action() {
        System.out.println(super.toString() + ", может с легкостью очисть зубы.");
    }
}
