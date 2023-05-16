package basic.prob5;

import java.util.Random;

public class Prob5_1{
    public static void main(String[] args){
        int[] a = new int[7];
        Random b = new Random();
        for(int i = 0; i < a.length; i++){
            a[i] = b.nextInt(10)+1;
            System.out.print("a["+ i + "]=" + a[i]+" ");
        }  
    }  
}