public class Calculator {
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
            case iOperations.PLUS -> first + second;
            case iOperations.MINUS -> first - second;
            case iOperations.MULTIPLY -> first * second;
            case iOperations.DIVIDE -> {
                if (second == 0) throw new IllegalArgumentException("Division with 0 is impossible");
                yield first / second;
            }
            case iOperations.SQRT -> Math.sqrt(first);
            case iOperations.POW -> Math.pow(first, second);
            default -> throw new UnsupportedOperationException("Unknown operator: " + operator);
        };
    }
}
