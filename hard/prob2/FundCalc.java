package hard.prob2;

public class FundCalc {
    protected int number1 = 0;
    protected int number2 = 0;
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public int getNumber1() {
        return number1;
    }
    public int getNumber2() {
        return number2;
    }
    public int add() {
        return number1 + number2;
    }
    public int sub() {
        return number1 - number2;
    }
}
