package basic.prob5;

public class Prob5_5 {
    public static void main(String[] args){
        int[] data = new int[10];
        for(int i = 0; i < data.length; i++){
            int num = (int)(Math.random() * 10) + 1;
            data[i] = num;
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print("3の倍数：");
        for(int i = 0; i < data.length; i++){
            if(data[i] % 3 == 0){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
        System.out.print("3の倍数以外の数：");
        for(int i = 0; i < data.length; i++){
            if(data[i] % 3 != 0){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    } 
}
