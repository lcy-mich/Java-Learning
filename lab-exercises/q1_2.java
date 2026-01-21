import utils.Input;

public class q1_2 {

    public static double computeAvg(double[] doubles) {
        double sum = 0;
        for (double num : doubles) {
            sum += num;
        }
        return sum/doubles.length;
    }
    public static void main(String[] args) {
        Input input = new Input();

        double[] doubles = new double[10];
        
        for (int i = 0; i < 10; i++) {
            doubles[i] = input.nextDouble();
        }

        System.out.println(computeAvg(doubles));
        input.close();
    }
}
