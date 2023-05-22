package basic.prob5;

public class Prob5_8 {
    public static void main(String[] args){
        int[] data = new int[5];
        int positiveNumber = 0;
        int negativeNumber = 0;
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
            positiveNumber++;
           }
        }
        System.out.println(positiveNumber + "個");
        System.out.print("0より小さい数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] < 0){
            negativeNumber++;
           }
        }
        System.out.println(negativeNumber + "個");
        System.out.print("0の個数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] == 0){
            zero++;
           }
        }
        System.out.println(zero + "個");
    }
}
