package hard.prob2;

public class Prob2_2 {
    public static void main(String[] args) {
        NewCalc n = new NewCalc();
        n.setNumber1(10);
        n.setNumber2(2);
        System.out.println(n.getNumber1() + " + " + n.getNumber2() + " = " + n.add());
        System.out.println(n.getNumber1() + " - " + n.getNumber2() + " = " + n.sub());
        System.out.println(n.getNumber1() + " * " + n.getNumber2() + " = " + n.mul());
        System.out.println(n.getNumber1() + " / " + n.getNumber2() + " = " + n.div());
   }
}
