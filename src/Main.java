import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Make your calculation here >>>");
                String listOfInputs = scanner.nextLine();

                // checks for q to shut down
                if (listOfInputs.contains("q") && !listOfInputs.contains("sqrt")) {
                    System.out.println("Shutting down...");
                    break;
                }

                // regex
                String[] data = listOfInputs.split("(?=(sqrt|pow|[+\\-*/]))|(?<=(sqrt|pow|[+\\-*/]))");


                // checks if the first input contains sqrt
                if (data[0].contains("sqrt")) {
                    double x = Double.parseDouble(data[1]);
                    Calculator calc = new Calculator(x, 0, data[0]);
                    System.out.println(calc.getResult());
                    continue;
                }

                // setting variables up
                double first = Double.parseDouble(data[0]);
                double second = Double.parseDouble(data[2]);
                String operator = data[1];

                Calculator calc = new Calculator(first, second, operator);
                System.out.println(calc.getResult());

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Try again!");
            }
        }

    }
}
