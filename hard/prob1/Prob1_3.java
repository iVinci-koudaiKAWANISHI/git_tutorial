package hard.prob1;

public class Prob1_3 {
    public static void main(String[] args){
        int a = (int)(Math.random() * 10)  + 1;     
        int b = (int)(Math.random() * 10)  + 1;
        System.out.println("たて：" + a);
        System.out.println("よこ：" + b);
        square(a,b);
    }
    private static void square(int row, int column) {
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print("■");
            }
            System.out.println();
        }
    }
}
