package basic.prob4;

public class Prob4_14 {
    public static void main(String[] args) {
       
        for(int i = 0; i < 5 ;){
            int num = (int)(Math.random()*10)+1; 
            
            if(num % 2 == 0){
                System.out.println("★★★★");
                break;
            } 
                System.out.println("☆☆☆☆");
                break;

            
        }
      
    }
}
