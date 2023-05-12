package basic.prob4;

public class Prob4_18 {
    public static void main(String[] args) {
        //行のループ
            for(int i=1; i<=10; i++) {
                //列のループ
                for(int j=1; j<=10; j++) {
                    //j列の数がi行の数と一致しなければ
                    if(j==i) {
                    System.out.print("■");
                    //j列の数がi行の数と一致していれば
                    }else {
                    //ｎ行目のｎ列目に□を表示させる
                    System.out.print("□");
                    }
            }
            System.out.println( );
            }
    }
    
}
