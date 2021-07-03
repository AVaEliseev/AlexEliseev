public class Mobile extends Gadjet implements Send {


    public Mobile(String name, double weight, int price, String size, String title) {
        super(name, weight, price, size, title);
    }

    @Override
    void destination() {
        System.out.println(super.toString() + " упрощает жизнь современного человека.");
    }

    @Override
    public void send() {
        System.out.println(getTitle() + " " + getName() + ", может отправлять смс: ");
        System.out.println(text + " " + lastName);
    }
}
