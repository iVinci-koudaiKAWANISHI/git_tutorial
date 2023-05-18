package hard.prob5;

import java.util.ArrayList;
import java.util.List;

public class Prob5_6 {
    public static void main(String[] args){    
        List<Integer> data = new ArrayList<Integer>();
        while(true){
            Integer num = (int)(Math.random() * 11);
            data.add(num);
            System.out.println("0～10の値を出力：" + num);
            if(num == 2)
            data.remove(num);
            if(num == 0)
            break;  
        }       
        while(true){
            System.out.println(data);
            break;
        }
    }
}
