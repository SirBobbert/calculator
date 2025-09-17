import java.util.InputMismatchException;

public class Calculator implements iOperations {
    private final double first;
    private final double second;
    private final String operator;

    public Calculator(double first, double second, String operator) {
        this.first = first;
        this.second = second;
        this.operator = operator;
    }

    public double getResult() {
        return switch (operator) {
            case iOperations.PLUS -> add(first, second);
            case iOperations.MINUS -> sub(first, second);
            case iOperations.MULTIPLY -> mul(first, second);
            case iOperations.DIVIDE -> div(first, second);
            case iOperations.SQRT -> sqrt(first);
            case iOperations.POW -> pow(first, second);
            default -> throw new UnsupportedOperationException("Unknown operator: " + operator);
        };
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        try {
            if (b == 0) throw new InputMismatchException();
            return a / b;
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }
}
