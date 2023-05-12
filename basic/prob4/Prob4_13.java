package basic.prob4;

public class Prob4_13 {
    public static void main(String[] args) {
       
        for(int i = 0; i < 5 ; i++){
            int num = (int)(Math.random()*10)+1; 
            
            if(num > 5){
                System.out.println("★★★★");
                break;
            } 
            if(num < 5) {
                System.out.println(num);
                break;

            } 
        }
      
    }
}
