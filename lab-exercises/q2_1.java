import utils.FileInput;
import utils.Input;

public class q2_1 {
    public static void main(String[] args) {
        Input input = new Input();
        
        System.out.println("Enter name of textfile: ");
        String filename = input.nextLine();

        FileInput infile;

        int numchar = 0;
        int numwords = 0;
        int numlines = 0;
        String currentString = "";

        if (FileInput.exists(filename)) {
            infile = new FileInput(filename);

            while (infile.hasNextLine()) {
                currentString = infile.nextLine();
                numlines++;
                numchar += 1+currentString.length();
                numwords += currentString.split("\\s|\\W").length;
            }

            System.out.printf("#Chars: %d%n#Words: %d%n#Lines: %d%n", numchar, numwords, numlines);

            infile.close();
        }
        
        input.close();


    }
}
