package basic.prob6;
public class Prob6_1{
    public static void main(String[] args){
        Minmax m = new Minmax();
        int a = 9,b = 4,c = 8;
        System.out.println(a + "と" + b + "と" + c +"のうち、最大のものは" + m.max(a,b,c));
        System.out.println(a + "と" + b + "と" + c +"のうち、最小のものは" + m.min(a,b,c));
    }
}