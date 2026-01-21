import utils.Input;

public class q1_1{
    public static void main(String[] args) {
        Input input = new Input();
        String inputstr = "";

        while (!inputstr.equals("stop")) {
            inputstr = input.nextLine();
        }

        input.close();
    }
}