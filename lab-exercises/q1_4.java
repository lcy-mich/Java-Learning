import java.util.Random;

public class q1_4 {
    public static void main(String[] args) {
        Random gen = new Random();

        int NUM = 10_000;

        double largest = -1;
        double smallest = 1;
        double sum = 0;

        double currentdouble = 0;
        
        for (int i = 0; i < NUM; i++) {
            currentdouble = gen.nextDouble(-0.9999999, 1);

            largest = Math.max(largest, currentdouble);
            smallest = Math.min(smallest, currentdouble);

            sum += currentdouble;
        }

        System.out.printf("Average: %.8f%nMax: %.8f%nMin: %.8f%n", sum/NUM, largest, smallest);
    }
}
