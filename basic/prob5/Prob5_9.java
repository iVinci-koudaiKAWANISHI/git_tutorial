package basic.prob5;

public class Prob5_9 {
    public static void main(String[] args){
        int[] data = new int[10];
        for(int i = 0; i < data.length; i++){
            int num = (int)(Math.random() * 101);
            data[i] = num;
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print("50以上の数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] >= 50 ){
            System.out.print(data[i] + " ");
           }
        } System.out.println();
        System.out.print("50未満の数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] < 50 ){
            System.out.print(data[i] + " ");
           }
        }
        System.out.println(); 
    }
}
