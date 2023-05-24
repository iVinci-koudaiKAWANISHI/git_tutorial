package basic.prob5;

public class Prob5_8 {
    public static void main(String[] args){
        int[] data = new int[5];
        int plus = 0;
        int minus = 0;
        int zero = 0;
        for(int i = 0; i < data.length; i++){
            int num = (int)(Math.random() * 21) - 10;
            data[i] = num;
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print("0より大きい数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] > 0){
            plus++;
           }
        }
        System.out.println(plus + "個");
        System.out.print("0より小さい数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] < 0){
            minus++;
           }
        }
        System.out.println(minus + "個");
        System.out.print("0の個数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] == 0){
            zero++;
           }
        }
        System.out.println(zero + "個");
    }
}
