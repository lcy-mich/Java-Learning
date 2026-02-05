import java.time.LocalDate;
import utils.Input;

public class q2_2 {

    private static int getValFromDay(String day) {
        switch (day.strip().toLowerCase()){
            case "monday":
                return 0;
            case "tuesday":
                return 1;
            case "wednesday":
                return 2;
            case "thursday":
                return 3;
            case "friday":
                return 4;
            case "saturday":
                return 5;
            case "sunday":
                return 6;
            default:
                return -1;
        }
    }

    private static int getValFromMonth(String month) {
        switch (month.strip().toLowerCase()){
            case "january":
                return 0;
            case "february":
                return 1;
            case "march":
                return 2;
            case "april":
                return 3;
            case "may":
                return 4;
            case "june":
                return 5;
            case "july":
                return 6;
            case "august":
                return 7;
            case "september":
                return 8;
            case "october":
                return 9;
            case "november":
                return 10;
            case "december":
                return 11;
            default:
                return -1;
        }
    }

    private static int getValFromYear(String year) {
        try {
            return Integer.valueOf(year.strip()).intValue();
        } catch (Exception NumberFormatException) {
            return -1;
        }
    }

    public static void main(String[] args) {
        Input input = new Input();

        int day, month, year;
        while (true) {
            System.out.println("Enter day: ");
            day = getValFromDay(input.nextLine());

            System.out.println("Enter month: ");
            month = getValFromMonth(input.nextLine());

            System.out.println("Enter year: ");
            year = getValFromYear(input.nextLine());

            if (day >= 0 && month >= 0 && year >= 0) {
                break;
            }
            System.out.println("Invalid input. Try Again.");
        }

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println(date.toString());
        

        input.close();
    }
}

