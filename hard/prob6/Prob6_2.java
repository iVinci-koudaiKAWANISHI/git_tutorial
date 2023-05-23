package hard.prob6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.HashMap;

public class Prob6_2 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("整数の値を入力してください:");
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("1", "一");
        hashMap.put("2", "二");
        hashMap.put("3", "三");
        hashMap.put("4", "四");
        hashMap.put("5", "五");
        hashMap.put("6", "六");
        hashMap.put("7", "七");
        hashMap.put("8", "八");
        hashMap.put("9", "九");
        hashMap.put("0", "〇");
        String buf = br.readLine();
        String[] strNum1 = buf.split("");
        for(String i : strNum1){
            if(!hashMap.containsKey(i)){
                System.out.println("整数の値を入力してください。");
                break;
            }else{
                NumberFormat nf = NumberFormat.getInstance();
                String[] strNum = nf.format(Integer.parseInt(buf)).split("");
                String strKanji = "";
                for (String s : strNum) {
                    strKanji += hashMap.getOrDefault(s, ",");
                }
                System.out.println(strKanji);
                break;
            }
        }
    }
}