package basic.prob5;

public class Prob5_8 {
    public static void main(String[] args){
        int[] data = new int[5];
        int a = 0;
        int b = 0;
        int c = 0;
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
            a++;
           }
        }
        System.out.println(a + "個");
        System.out.print("0より小さい数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] < 0){
            b++;
           }
        }
        System.out.println(b + "個");
        System.out.print("0の個数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] == 0){
            c++;
           }
        }
        System.out.println(c + "個");
    }
}
