public enum Operations {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    SQRT("sqrt"),
    POW("pow");

    private final String symbol;

    Operations(String symbol) {
        this.symbol = symbol;
    }

    public static Operations fromSymbol(String symbol) {
        for (Operations op : values()) {
            if (op.symbol.equals(symbol)) {
                return op;
            }
        }
        throw new IllegalArgumentException("Invalid operator: " + symbol);
    }
}
