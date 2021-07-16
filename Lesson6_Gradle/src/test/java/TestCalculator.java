import org.junit.jupiter.api.Test;

public class TestCalculator {

    public static void main(String[] args) {

        ReadNum readNum = new ReadNum();
        int action;

        Calculator calculator = new Calculator();

        do {
            System.out.print("Введите первое число: ");
            calculator.setA(readNum.ReadDouble());
            System.out.print("Введите второе число: ");
            calculator.setB(readNum.ReadDouble());
            System.out.println("Выбирете действие:\n1. сложить\n2. отнять\n3. умножить\n4. разделить\n0. Выход");

            action = readNum.ReadDouble().intValue();

            switch (action) {
                case 1:
                    System.out.println(calculator.add());
                    break;
                case 2:
                    System.out.println(calculator.subt());
                    break;
                case 3:
                    System.out.println(calculator.multi());
                    break;
                case 4:
                    System.out.println(calculator.div());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Выберите действие из доступных пунктов");
            }
        } while (action != 0);
    }
}
