package basic.prob3;

import java.util.Random;

public class Prob3_5 {
    public static void main(String[] args){
       
        int min = 0;
		int max = 101;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;
        System.out.println(value);

        if( value >= 20 && value < 80){
            System.out.println("20以上80未満です。");

        }
            
           

        
    }
}
