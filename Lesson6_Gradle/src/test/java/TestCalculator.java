import org.junit.jupiter.api.Test;

public class TestCalculator {

    public static void main(String[] args) {

        ReadNum readNum = new ReadNum();
        double num1;
        double num2;
        int action;

        do {
            System.out.print("Введите первое число: ");
            num1 = readNum.ReadDouble();
            System.out.print("Введите второе число: ");
            num2 = readNum.ReadDouble();
            System.out.println("Выбирете действие:\n1. сложить\n2. отнять\n3. умножить\n4. разделить\n0. Выход");

            Calculator calculator = new Calculator(num1, num2);

            action = readNum.ReadDouble().intValue();

            switch (action) {
                case 1:
                    System.out.println(calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.println(calculator.subt(num1, num2));
                    break;
                case 3:
                    System.out.println(calculator.multi(num1, num2));
                    break;
                case 4:
                    System.out.println(calculator.div(num1, num2));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Выберите действие из доступных пунктов");
            }
        } while (action != 0);
    }
}
