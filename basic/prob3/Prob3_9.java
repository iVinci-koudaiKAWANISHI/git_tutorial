package basic.prob3;

public class Prob3_9 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100)+1; 
        if(num < 50){
            System.out.println("数値 : " + num);
            System.out.println("50未満です。");

        }else{
            System.out.println("50以上です。");
        }   
        
 
    }
}
