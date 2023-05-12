package basic.prob3;

public class Prob3_16 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100)+1; 
        if(num % 2 == 0 && num % 3 != 0){
            System.out.println("数値 : " + num);
            System.out.println("2倍数です。");

        }else if(num % 2 != 0 && num % 3 == 0){
            System.out.println("数値 : " + num);
            System.out.println("3の倍数です。");
        }else if(num % 2 == 0 && num % 3 == 0){
            System.out.println("数値 : " + num);
            System.out.println("2と3の公倍数です。");
        }else{
            System.out.println("数値 : " + num);
        } 

        
 
    }
}
