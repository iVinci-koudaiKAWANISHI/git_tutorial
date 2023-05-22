package hard.prob6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Prob6_4 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        HashSet<Character> hashSet = new HashSet<Character>();
        System.out.print("英単語を入力：");
        String buf = br.readLine();
        System.out.print("使用されているアルファベット：");
        char[] cArray =  buf.toCharArray();
        for(char c : cArray){
            hashSet.add(c);
        }
        for(char d : hashSet){
            System.out.print(d + " ");
        }
    }
}