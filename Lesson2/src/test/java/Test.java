public class Test {
    public static void main(String[] args) {
        Snowboarder snowman = new Snowboarder();
        snowman.skill = "продвинутый";
        Snowboarder.weight = 74.5;
        snowman.name = "Mick";
        Board snowboard1 = new Board();
        Board snowboard2 = new Board();
        snowboard1.setMaterial("Тополя");
        snowboard1.setSize(155.0);

        System.out.println(snowboard1.equals(snowboard2) ? "Зачем сравнивать один и тот же класс!" : "Это два разных класса, поверь!");
        System.out.println(snowboard1.equals(snowboard1) ? "Зачем сравнивать один и тот же класс!" : "Это два разных класса, поверь!");

        System.out.println("______________________________________________________________________________________");
        System.out.println("Сноубордист по имени " + snowman.name + ", очень хорошо катается на сноуборде, имея при этом " + snowman.skill + " уровень.");
        System.out.println(snowboard1.toString());
        System.out.println("Форма сноуборда "  + snowboard1.getShape() + ", позволяет " + snowman.name + " легко выполнять различные трюки");
        Snowboarder.trick();
        System.out.println();
        System.out.println("Его имоции на пределе!");
        Snowboarder.emotion();
    }
}
