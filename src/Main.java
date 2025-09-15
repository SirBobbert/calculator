import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("First entry:");
            String firstInput = scanner.nextLine();
            if (firstInput.equals("q")) break;
            int firstEntry = Integer.parseInt(firstInput);

            System.out.println("Enter operation:");
            String operation = scanner.nextLine();
            if (operation.equals("q")) break;

            System.out.println("Second entry:");
            String secondInput = scanner.nextLine();
            if (secondInput.equals("q")) break;
            int secondEntry = Integer.parseInt(secondInput);

            Calculator calculator = new Calculator(firstEntry, secondEntry, operation);

            System.out.println(calculator.getResult());
        }
    }
}
