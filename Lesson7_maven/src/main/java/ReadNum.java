import java.util.Scanner;

public class ReadNum {

    public Double ReadDouble() {
        Scanner scan = new Scanner(System.in);
        double num = 0;
        if (scan.hasNextDouble()) {
            num = scan.nextDouble();
        } else {
            System.out.println("Неверный формат данных, попробуйте снова");
        }
        return num;
    }
}
