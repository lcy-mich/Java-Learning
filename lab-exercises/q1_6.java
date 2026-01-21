import utils.Input;

public class q1_6 {
    private static Input input;

    public double GetInputDouble() {
        return input.nextDouble();
    }

    public double addThenSqrt(double a, double b) {
        return Math.sqrt(a + b);
    }
    public static void main(String[] args) {
        input = new Input();
        q1_6 methods = new q1_6();

        double a = methods.GetInputDouble();
        double b = methods.GetInputDouble();

        System.out.println(methods.addThenSqrt(a, b));

        input.close();
    }
}
