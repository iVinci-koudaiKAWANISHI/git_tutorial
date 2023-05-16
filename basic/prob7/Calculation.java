package basic.prob7;

public class Calculation {
    private int number1 = 0;
    private int number2 = 0;
    public void setNumber1(int i) {
        this.number1 = i;
    }
    public void setNumber2(int i) {
        this.number2 = i;
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
