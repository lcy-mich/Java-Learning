public class displaymessage{
    public void displayMessage() {
        System.out.println("so many messages");
        System.out.println("is getting printed rn");
    }
    
    public void holymoly() {
        System.out.println("holy\nmoly");
    }
    public static void main(String[] args) {
        displaymessage m = new displaymessage();
        m.displayMessage();
        new displaymessage().holymoly();
        int a = 10;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
    }
}