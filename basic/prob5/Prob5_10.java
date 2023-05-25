package basic.prob5;

public class Prob5_10 {
    public static void main(String[] args){
        int[] data = new int[7];
        for(int i = 0; i < data.length; i++){
            int num = (int)(Math.random() * 10) + 1;
            data[i] = num;
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for(int num : data){
            System.out.println();
            for(int i = 0; i < num; i++){
                System.out.print("*");
            }
        }
        System.out.println(); 
    }
}
