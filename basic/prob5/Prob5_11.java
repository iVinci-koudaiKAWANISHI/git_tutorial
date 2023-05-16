package basic.prob5;

public class Prob5_11 {
    public static void main(String[] args){
        int[] data = new int[5];
        for(int i = 0; i < data.length; i++){
            int num = (int)(Math.random() * 100) + 1;
            data[i] = num;
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.print("0以上60未満の数：");
        for(int i = 0; i < data.length; i++){
            if(data[i] >= 0 && data[i] < 60){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
        System.out.print("60以上80未満の数：");
        for(int i = 0; i < data.length; i++){
            if(data[i] >= 60 && data[i] < 80){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
        System.out.print("80以上：");
        for(int i = 0; i < data.length; i++){
            if(data[i] >= 80){
                System.out.print(data[i] + " ");
            }
        }
    }
}
