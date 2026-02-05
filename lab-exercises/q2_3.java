import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import utils.Input;

public class q2_3 {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Number of terms: ");
        int numterms = input.nextInt();

        System.out.println("Decimal places: ");
        int dp = input.nextInt();

        BigDecimal result = BigDecimal.ONE;
        MathContext mc = new MathContext(dp, RoundingMode.HALF_EVEN);

        for (int i = 1; i < numterms; i++) {
            result = result.add(BigDecimal.valueOf((-2)*(i%2) + 1).divide(BigDecimal.valueOf(i*2 + 1), mc));
        }

        System.out.println(result.round(mc)); // Q3a

        System.out.println(result.multiply(BigDecimal.valueOf(4), mc)); // Q3b

        input.close();
    }
}