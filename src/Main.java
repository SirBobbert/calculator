import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Set<String> ALLOWED =
            Set.of(iOperations.PLUS, iOperations.MINUS, iOperations.MULTIPLY,
                    iOperations.DIVIDE, iOperations.SQRT, iOperations.POW);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        TODO: Split input with regex so it's more dynamic
//        String listOfInputs = scanner.nextLine();
//        System.out.println(listOfInputs);

        while (true) {
            try {
                System.out.println("First entry:");
                String firstInput = scanner.nextLine().trim();
                if (firstInput.equalsIgnoreCase("q")) break;
                double first = Double.parseDouble(firstInput);

                System.out.println("Enter operation (+, -, *, /, sqrt, **):");
                String op = scanner.nextLine().trim();
                if (op.equalsIgnoreCase("q")) break;
                if (!ALLOWED.contains(op)) {
                    System.out.println("Unknown operation. Use +, -, *, /, sqrt, **.");
                    continue;
                }

                double second = 0;
                if (!op.equals(iOperations.SQRT)) {
                    System.out.println("Second entry:");
                    String secondInput = scanner.nextLine().trim();
                    if (secondInput.equalsIgnoreCase("q")) break;
                    second = Double.parseDouble(secondInput);
                }

                Calculator calc = new Calculator(first, second, op);
                System.out.println("Result = " + calc.getResult());

            } catch (NumberFormatException e) {
                System.out.println("Ugyldigt tal, prøv igen.");
            }
        }
        scanner.close();
    }
}
