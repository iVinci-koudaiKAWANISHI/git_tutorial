package hard.prob6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Prob6_4 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        HashSet<String> hashSet = new HashSet<String>();
        System.out.print("英単語を入力：");
        String buf = br.readLine();
        System.out.print("使用されているアルファベット：");
        String[] str =  buf.split("");
        for(String i : str){
            hashSet.add(i);
            System.out.print(i + " ");
        }
        System.out.println();
    }
}