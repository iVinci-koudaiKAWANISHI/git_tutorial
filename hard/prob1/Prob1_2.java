package hard.prob1;

public class Prob1_2 {
    public static void main(String[] args){
        int a = (int)(Math.random() * 10)  + 1;     
        int b = (int)(Math.random() * 10)  + 1;
        int c = (int)(Math.random() * 10)  + 1;     
        int result = mull(mull(a,b),c);    
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println(a + " * " + b + " * " + c + " = " + result);
    }
    static int mull(int result,int c){
        return result * c;
    }
} 
