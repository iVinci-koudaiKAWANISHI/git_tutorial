package basic.prob3;

public class Prob3_17 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100)+1; 
        if(num % 2 == 0 && num < 50){
            System.out.println("数値 : " + num);
            System.out.println("50以下の偶数です。");

        }else if(num < 50){
            System.out.println("数値 : " + num);
            System.out.println("50以下です。");
        }else if(num % 2 == 0){
            System.out.println("数値 : " + num);
            System.out.println("偶数です。");
        }else{
            System.out.println("数値 : " + num);
        } 

        
 
    }
}
