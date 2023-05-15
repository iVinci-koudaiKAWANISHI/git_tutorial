package basic.prob4;
public class Prob4{
    public static void main(String[] args) {
        int num = (int)(Math.random()*10)+1; 
        System.out.println(num);
        int i;
        for(i = 1;i <= num; i++){
            System.out.print("■");
        }
    }
}