package basic.prob3;



public class Prob3_12 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10)-10; 
        if(num < 0){
            System.out.println("数値 : " + num);
            System.out.println("負の値です。");

        }else{
            System.out.println("正の値です。");
        }   
        
 
    }
}
