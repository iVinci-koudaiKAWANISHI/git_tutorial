package basic.prob3;

import java.util.Random;

public class Prob3{
    public static void main(String[] args){
        int min = 1;
		int max = 10;
		Random random = new Random();
		int value = random.nextInt(max) + min;
        System.out.println(value);
        if(value >= 5){
            System.out.println("5以上です。");
        }		
    }
}