import utils.Input;

public class q1_5 {
    private static Input input;

    public double GetInputDouble() {
        return input.nextDouble();
    }

    public double addThenSqrt(double a, double b) {
        return Math.sqrt(a + b);
    }
    public static void main(String[] args) {
        input = new Input();
        q1_5 methods = new q1_5();

        System.out.println(methods.addThenSqrt(methods.GetInputDouble(), methods.GetInputDouble()));

        input.close();
    }
}
