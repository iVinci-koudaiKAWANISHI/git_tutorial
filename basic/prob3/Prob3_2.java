package basic.prob3;

import java.util.Random;

public class Prob3_2 {
    public static void main(String[] args){
       
        int min = 1;
		int max = 10;

		Random random = new Random();

		int value = random.nextInt(max) + min;
        System.out.println(value);


        if(value != 1){
            System.out.println("1ではありません");


        }
            
        


		
    }
}
