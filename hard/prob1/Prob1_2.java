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
        int result = mull(mull(a,b),c);   
        System.out.println(a + " * " + b + " * " + c + " = " + result);
        scanner.close();
    }
    static int mull(int mull_1,int mull_2){
        return mull_1 * mull_2;
    }
} 
