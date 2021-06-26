public class Mobile extends Gadjet implements Send {

    @Override
    void destination() {
        System.out.println(" можно отправить sms: ");
    }

    @Override
    void need() {
        System.out.println("Телефон " + getName() + " является неотъемлемой частью, для повседневной жизни.");
    }

    @Override
    void count(String i, String w) {
        System.out.println("Стоит " + getName() + " " + getPrice() + i + getWeight() + w + " имеет размер " + getSize());
    }

    @Override
    public void send() {
        System.out.print("С помощью " + toString());
        destination();
        System.out.print(text);
        System.out.println(lastName);
    }

    @Override
    public String toString() {
        return "Mobile";
    }
}
