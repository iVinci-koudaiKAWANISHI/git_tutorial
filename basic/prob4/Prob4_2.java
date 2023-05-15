package basic.prob4;

public class Prob4_2 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10)+1; 
        System.out.println(num);
        int i = 0;
        while(i < num){
            System.out.print("■");
            i++;
        }
    }
}
