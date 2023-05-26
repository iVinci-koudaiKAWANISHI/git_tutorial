package hard.prob6;

import java.util.ArrayList;
import java.util.HashSet;

public class Prob6_3 {
    public static void main(String[] args){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int num = (int)(Math.random() * 10) + 1;
            arrayList.add(num);
            hashSet.add(num);
        }
        System.out.print("乱数：");
        for(Integer i : arrayList){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("種類：");
        for(Integer i : hashSet){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}