package hard.prob5;

import java.util.ArrayList;

public class Prob5_3 {
    public static void main(String[] args){
        ArrayList<Integer> data = new ArrayList<Integer>();
        while(true){
            Integer num = (int)(Math.random() * 101);
            data.add(num);
            System.out.println("0～100の値を出力：" + num);
            if(num == 0)
            break;
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            String result = "";
            for(int j : data){
                if(j % 10 == i){
                    result += " " + j ;
                }
            }
            if(result.equals("")){
                result = "なし";
            }
            System.out.println("一の位が" + i + "：" + result );
        }
    }
}
