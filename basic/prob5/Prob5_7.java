package basic.prob5;

public class Prob5_7 {
    public static void main(String[] args){
        int sum = 0;
        int average = 0;
        int[] data = new int[5];
        for(int i = 0; i < data.length; i++){
            int num = (int)(Math.random() * 10) + 1;
            data[i] = num;
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print("合計値：");
        for(int i = 0; i < data.length; i++){
            sum += data[i];
        }
        System.out.println(sum);
        System.out.print("平均値：");
        for(int i = 0; i < data.length; i++){
            average = sum / data.length;
        }
        System.out.println(average);
        System.out.println();
        System.out.print("平均値より大きい数：");
        for(int i = 0; i < data.length; i++){
            if(average < data[i]){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
        System.out.print("平均値より小さい数：");
        for(int i = 0; i < data.length; i++){
            if(average > data[i]){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }
}
