public class Test {
    public static void main(String[] args) {

        Toothbrush toothbrush = new Toothbrush("Oclean", 0.05d, 200, "Small", "электрическая зубная щетка");
        Mobile mobile = new Mobile("Samsung", 0.105d, 400, "Small", "мобильный телефон");
        Kettle kettle = new Kettle("Bork", 1.0d, 150, "average", "чайник");

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        mobile.destination();
        mobile.send();
        mobile.count();
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        kettle.destination();
        kettle.count();
        kettle.action();
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        toothbrush.destination();
        toothbrush.action();
        toothbrush.count();
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
    }
}