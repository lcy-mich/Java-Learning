import java.util.ArrayList;

import utils.Input;

public class q1_3 {
    public static void main(String[] args) {
        Input input = new Input();
        ArrayList<String> strlist = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strlist.add(input.nextLine());
        }

        for (String word : strlist.reversed()) {
            System.out.println(word);
        }

        input.close();
    }
}
