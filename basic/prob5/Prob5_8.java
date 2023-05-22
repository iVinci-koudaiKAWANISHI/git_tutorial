package basic.prob5;

public class Prob5_8 {
    public static void main(String[] args){
        int[] data = new int[5];
        int pn = 0;
        int nn = 0;
        int zr = 0;
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
            pn++;
           }
        }
        System.out.println(pn + "個");
        System.out.print("0より小さい数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] < 0){
            nn++;
           }
        }
        System.out.println(nn + "個");
        System.out.print("0の個数：");
        for(int i = 0; i < data.length; i++){
           if(data[i] == 0){
            zr++;
           }
        }
        System.out.println(zr + "個");
    }
}
