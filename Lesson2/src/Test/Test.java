package Test;

import Main.Board;
import Main.Snowboarder;

public class Test {
    public static void main(String[] args) {
        Snowboarder snowman = new Snowboarder();
        snowman.skill = "продвинутый";
        Snowboarder.weight = 74.5;
        snowman.name = "Mick";
        Board snowboard = new Board();
        snowboard.material =  "Тополя";
        snowboard.size = 155.0;



        System.out.println("______________________________________________________________________________________");
        System.out.println("Сноубордист по имени " + snowman.name + ", очень хорошо катается на сноуборде, имея при этом " + snowman.skill + " уровень.");
        System.out.println(snowboard.toString());
        System.out.println("Форма сноуборда "  + Board.shape + ", позволяет " + snowman.name + " легко выполнять различные трюки");
        Snowboarder.trick();
        System.out.println();
        System.out.println("Его имоции на пределе!");
        Snowboarder.emotion();
    }
}
