package basic.prob3;

import java.util.Random;

public class Prob3_2 {
    public static void main(String[] args){
       
        int min = 0;
		int max = 11;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;
        System.out.println(value);


        if(value != 1){
            System.out.println("1ではありません");


        }
            
        


		
    }
}
