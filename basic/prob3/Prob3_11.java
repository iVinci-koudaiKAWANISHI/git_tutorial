package basic.prob3;

public class Prob3_11 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10)+1; 
        if(num >= 20 && num < 80){
            System.out.println("数値 : " + num);
            System.out.println("20以上80未満です。");

        }else{
            System.out.println("20未満か80以上です。");
        }   
        
 
    }
}
