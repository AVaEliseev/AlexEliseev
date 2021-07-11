public class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {
    }

    public double add(double a, double b){
        return a + b;
    }

    public double subt(double a, double b){
        return a - b;
    }

    public double multi(double a, double b){
        return a * b;
    }

    public double div(double a, double b){
        return a / b;
    }
}
