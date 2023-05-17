package hard.prob5;

import java.util.ArrayList;

public class Prob5_1{
    public static void main(String[] args){
        ArrayList<Integer>data1 = new ArrayList<Integer>();
        ArrayList<Integer>data2 = new ArrayList<Integer>();
        for(;;){
            Integer num = (int)(Math.random() * 11);
            if(num % 2 != 0){
                data1.add(num);
            }else{
                data2.add(num);
            }            
            System.out.println("0～10の値を出力："+num);
            if(num==0)
            break;
        }
        System.out.println();
        System.out.print("偶数：");
        System.out.print(data2);
        System.out.println();
        System.out.print("奇数：");
        System.out.print(data1);
    }
}