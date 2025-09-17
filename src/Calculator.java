import java.util.InputMismatchException;

public class Calculator implements CalcFunctions {
    private final double first;
    private final double second;
    private final Operations op;

    public Calculator(double first, double second, String operator) {
        this.first = first;
        this.second = second;
        this.op = Operations.fromSymbol(operator);
    }

    public double getResult() {
        return switch (op) {
            case PLUS -> add(first, second);
            case MINUS -> sub(first, second);
            case MULTIPLY -> mul(first, second);
            case DIVIDE -> div(first, second);
            case SQRT -> sqrt(first);
            case POW -> pow(first, second);
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
