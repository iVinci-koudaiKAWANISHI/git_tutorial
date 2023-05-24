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
        for(int i = 0;i < 10;i++){
            System.out.print("一の位が" + i + ":");
            for(int j = 0; j < data.size(); j++){
                if(data.get(j) % 10 == i){
                    System.out.print(j);
                    System.out.println();
                }
            }
        }
    }
}
