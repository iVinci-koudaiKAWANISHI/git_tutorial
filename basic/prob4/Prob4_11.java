package basic.prob4;

public class Prob4_11 {
    public static void main(String[] args) {
        int max = 0;
        for(int i = 0; i < 5 ; i++){
            int num = (int)(Math.random()*100)+1; 
            System.out.println(num); 
            if(num > max){
                max = num;
            }   
        }
        System.out.println("最大値：" + max); 
    }
}
