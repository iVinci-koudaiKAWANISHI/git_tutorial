package hard.prob1;

import java.util.Scanner;

public class Prob1_2 {
    public static void main(String[] args){
        int a = (int)(Math.random() * 10)  + 1;     
        int b = (int)(Math.random() * 10)  + 1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.print("c = ");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int result = mul(a,b,c);   
        System.out.println(a + " * " + b + " * " + c + " = " + result);
        scanner.close();
    }
    private static int mul(int mul1, int mul2,int mul3) {
        return mul1 * mul2 * mul3;
    }
} 