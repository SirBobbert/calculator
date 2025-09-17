import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Make your calculation here >>>");
                String listOfInputs = scanner.nextLine();

                if (listOfInputs.contains("help")) {
                    System.out.println("Available commands:");
                    System.out.println("+ - / * sqrt pow");
                    System.out.println("Example: 10+10, sqrt25 or 2pow2");
                    continue;
                }

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
                System.out.println("Error, invalid input!");
                System.out.println("Type 'help' for a list of commands.");
            }
        }

    }
}
