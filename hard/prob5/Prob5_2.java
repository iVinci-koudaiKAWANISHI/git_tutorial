package hard.prob5;

import java.util.ArrayList;
import java.util.Collections;

public class Prob5_2 {
    public static void main(String[] args){
        ArrayList<Integer> data = new ArrayList<Integer>();
        while(true){
            Integer num = (int)(Math.random() * 11);
            data.add(num);
            System.out.println("0～10の値を出力：" + num);
            if(num == 0){
                break;
            }
        }
        System.out.println();
        Collections.reverse(data);
        System.out.print(data);       
    }
}
