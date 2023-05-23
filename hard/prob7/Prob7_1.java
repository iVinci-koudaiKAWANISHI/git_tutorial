package hard.prob7;
public class Prob7_1{
    public static void main(String[] args) {
        int a[] = { 0 , 1, 2 };
        for(int i = 0; i < 4; i++){
            try{
                System.out.println("a[" + i +"]=" + a[i]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("配列の範囲を超えています。");
            }
        }
        System.out.println();       
    }
}