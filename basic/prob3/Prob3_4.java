package basic.prob3;

import java.util.Random;

public class Prob3_4 {
    public static void main(String[] args){
       
        int min = 0;
		int max = 100;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;

        if(value < 10){
            System.out.println("10以下か90以上の値です。");

        }else if(value > 90){
            System.out.println("10以下か90以上の値です。");


        }else{
            System.out.println(value);

        }
    }
}
