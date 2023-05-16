package basic.prob5;

public class Prob5_13 {
    public static void main(String[] args){
        int max = 0;
        int min = 9;
        int[][] data = new int[3][3];
        for(int i = 0; i < data.length; i++){
            System.out.println();
            for(int j = 0; j < data.length; j++){
                int num = (int)(Math.random() * 10);
                data[i][j] = num;
                System.out.print(data[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("最大値：");
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length; j++){
                max = Math.max(max,data[i][j]);    
            }
        }
        System.out.print(max);
        System.out.println();
        System.out.print("最小値：");
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length; j++){
                min = Math.min(min,data[i][j]);  
            }
        }
        System.out.print(min);
    }
}
