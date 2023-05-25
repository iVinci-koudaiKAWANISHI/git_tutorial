package basic.prob5;

public class Prob5_6 {
    public static void main(String[] args){
        int max = 0;
        int min = 10;
        int sum = 0;
        int[] data = new int[10];
        for(int i = 0; i < data.length; i++){
            int num = (int)(Math.random() * 10) + 1;
            data[i] = num;
            System.out.print(data[i] + " "); 
        }
        System.out.println();
        System.out.println();
        System.out.print("最大値：");
        for(int i = 0; i < data.length; i++){
            max = Math.max(max,data[i]);
        }
        System.out.println(max);
        System.out.print("最小値：");
        for(int i = 0; i < data.length; i++){
            min = Math.min(min,data[i]);
        }
        System.out.println(min);
        System.out.print("平均値：");
        for(int i = 0; i < data.length; i++){
            sum += data[i];
        }
        System.out.println(sum/data.length);
    }
} 
