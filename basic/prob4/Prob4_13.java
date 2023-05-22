package basic.prob4;

public class Prob4_13 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10)+1; 
        if(num >= 5){
            for(int i = 0; i < num ; i++){
                System.out.print("★");
            }        
        } 
        if(num < 5) {
            System.out.println(num);
        } 
    }
}
