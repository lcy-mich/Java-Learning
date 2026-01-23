import utils.Input;

public class q1_8 {
    public double mmToFeet(double mm) {
        return mm * 0.003281;
    }
    
    public double mToInches(double m) {
        return m * 39.370079;
    }

    public double kmToYards(double km) {
        return km * 1093.61;
    }

    public static void main(String[] args) {
        Input input = new Input();
        q1_8 methods = new q1_8();
        
        int choice;
        double value;
        while (true) {
            System.out.println("1. Convert mm to feet.");
            System.out.println("2. Convert m to inches.");
            System.out.println("3. Convert km to yards.");
            System.out.println("4. Quit.");

            choice = input.nextInt();

            if (choice == 4) {
                input.close();
                return;
            }

            System.out.println("Type value to convert:");
            value = input.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println(methods.mmToFeet(value));
                    break;
                case 2:
                    System.out.println(methods.mToInches(value));
                    break;
                case 3:
                    System.out.println(methods.kmToYards(value));
                    break;
                default:
                    break;
            }
        }
    }
}
