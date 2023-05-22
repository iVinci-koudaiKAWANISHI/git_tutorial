package basic.prob5;

public class Prob5_12 {
    public static void main(String[] args){
        int[][] data = new int[3][3];
        for(int i = 0; i < data.length; i++){
            System.out.println();
            for(int j = 0; j < data[i].length; j++){
                int num = (int)(Math.random() * 10);
                data[i][j] = num;
                System.out.print(data[i][j] + " ");     
            }            
        }
        System.out.println();
    }
}
