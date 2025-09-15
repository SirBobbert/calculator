import java.security.spec.RSAOtherPrimeInfo;

public class Calculator {

    private int  firstEntry;
    private int secondEntry;
    private String operator;

    public Calculator(int firstEntry, int secondEntry, String operator) {
        this.firstEntry = firstEntry;
        this.secondEntry = secondEntry;
        this.operator = operator;
    }

    public int getResult(){

        int res;

        switch (this.operator){

            case "+": res = firstEntry + secondEntry;
            break;
            case "-": res = firstEntry - secondEntry;
            break;
            case "*": res = firstEntry * secondEntry;
            break;
            case "/": res = firstEntry / secondEntry;
            break;
            default: res = 0;
            break;
        }

        System.out.println(res);

        // not returning?
        return res;
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
