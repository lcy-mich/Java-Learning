public class fizzbuzz{
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            boolean isdivfive = i % 5 == 0;
            boolean isdivthree = i % 3 == 0;
            if (isdivfive && isdivthree) {
                System.out.println("fizzbuzz");
            }
            else if (isdivthree) {
                System.out.println("fizz");
            }
            else if (isdivfive) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}