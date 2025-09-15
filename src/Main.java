import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner firstEntry = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstEntryInt = firstEntry.nextInt();

        // Scanner bug
        String str1 = firstEntry.nextLine();


        Scanner operator = new Scanner(System.in);
        System.out.println("Enter the operator: ");
        String operatorString = operator.nextLine();


        Scanner secondEntry = new Scanner(System.in);
        System.out.println("Please enter the second number: ");
        int secondEntryInt = secondEntry.nextInt();


        Calculator calculator = new Calculator(firstEntryInt, secondEntryInt, operatorString);

        calculator.getResult();
    }

}
