package hard.prob6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Prob6_1{
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("英語で動物の名前を入力してください：");
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("cat", "猫");
        hashMap.put("dog", "犬");
        hashMap.put("bird", "鳥");
        hashMap.put("tiger", "トラ");
        String buf = br.readLine();
        if(buf.equals("null")){
            System.out.println("対応するデータは登録されていません。");
        }else{
            System.out.print(hashMap.get(buf));
            System.out.print("です。");
        }        
    }
}