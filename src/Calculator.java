public class Calculator {

    private int firstEntry;
    private int secondEntry;
    private String operator;

    public Calculator(int firstEntry, int secondEntry, String operator) {
        this.firstEntry = firstEntry;
        this.secondEntry = secondEntry;
        this.operator = operator;
    }

    public int getResult() {
        
        return switch (this.operator) {
            case "+" -> firstEntry + secondEntry;
            case "-" -> firstEntry - secondEntry;
            case "*" -> firstEntry * secondEntry;
            case "/" -> {
                if (secondEntry == 0) {
                    throw new IllegalArgumentException("Division with 0 is impossible");
                }
                yield firstEntry / secondEntry;
            }
            default -> throw new UnsupportedOperationException("Unknown operator: " + operator);
        };
    }


    @Override
    public String toString() {
        return "Calculator{" +
                "firstEntry=" + firstEntry +
                ", secondEntry=" + secondEntry +
                ", operator='" + operator + '\'' +
                '}';
    }

    public int getFirstEntry() {
        return firstEntry;
    }

    public void setFirstEntry(int firstEntry) {
        this.firstEntry = firstEntry;
    }

    public int getSecondEntry() {
        return secondEntry;
    }

    public void setSecondEntry(int secondEntry) {
        this.secondEntry = secondEntry;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
