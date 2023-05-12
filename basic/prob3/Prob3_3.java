package basic.prob3;

import java.util.Random;

public class Prob3_3 {
    public static void main(String[] args){
       
        int min = 0;
		int max = 100;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;

        if(value < 50){
            System.out.println("50未満です。");

        }else{
            System.out.println(value);
           

        }
    }
}
