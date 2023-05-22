package basic.prob4;

public class Prob4_9 {
    public static void main(String[] args) {
        while(true){
            int a = (int)(Math.random()*100)+1;
            System.out.println(a);
            if(a % 10 ==0){
                System.out.println("終了します");
                break;
            }     
        }
    }
}
