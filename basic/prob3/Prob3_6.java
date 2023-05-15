package basic.prob3;

public class Prob3_6 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1; 
        if(num >= 3){
            System.out.println("数値 : " + num);
            System.out.println("３以上です。");
        }else{
            System.out.println("数値 : " + num);
        }   
    }
}
