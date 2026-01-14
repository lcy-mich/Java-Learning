import java.util.stream.IntStream;

public class arrays{

    public void evennumsforloop(int num) {
        int[] intarray = new int[num];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = 2*i;
        }
        for (int i : intarray) System.out.println(i);
        System.out.printf("printed the first %d even numbers!!%n", intarray.length);
    }

    public void evennumsforeach(int num) {
        IntStream.range(0,num).map(x -> 2*x).forEach(System.out::println);
    }

    public static void main(String[] args) {
        arrays arrmethods = new arrays();

        arrmethods.evennumsforeach(10);
    }
}