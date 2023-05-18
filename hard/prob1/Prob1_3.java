package hard.prob1;

public class Prob1_3 {
    public static void main(String[] args){
        int a = (int)(Math.random() * 10)  + 1;     
        int b = (int)(Math.random() * 10)  + 1;
        System.out.println("たて：" + a);
        System.out.println("よこ：" + b);
        square(a,b);
    }
    private static void square(int tate, int yoko) {
        for(int i = 0; i < tate; i++){
            for(int j = 0; j < yoko; j++){
                System.out.print("■");
            }
            System.out.println();
        }
    }
}
