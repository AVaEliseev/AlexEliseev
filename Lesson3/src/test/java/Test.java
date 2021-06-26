public class Test {
    public static void main(String[] args) {

        Toothbrush toothbrush = new Toothbrush();
        toothbrush.setName("Oclean");
        toothbrush.setPrice(200);
        toothbrush.setWeight(0.05d);
        toothbrush.setSize("Small");

        Mobile mobile = new Mobile();
        mobile.setName("Samsung");
        mobile.setPrice(400);
        mobile.setWeight(0.105d);
        mobile.setSize("Small");

        Kettle kettle = new Kettle();
        kettle.setName("Bork");
        kettle.setPrice(150);
        kettle.setWeight(1.0d);
        kettle.setSize("average");

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        mobile.need();
        mobile.send();
        mobile.count(" $, и весом ", " кг");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        kettle.need();
        kettle.count(" $, и весом ", " кг");
        kettle.action();
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        toothbrush.need();
        toothbrush.count(" $, и весом ", " кг");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
    }
}