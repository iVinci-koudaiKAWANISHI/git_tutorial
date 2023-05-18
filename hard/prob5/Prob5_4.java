package hard.prob5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Prob5_4 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<String> data = new ArrayList<>(); 
        while(true){
            String buf = br.readLine();
            System.out.println("文字列を入力：" + buf);
            data.add(buf);
            if(buf.equals("")){
                break;
            }
        }
        for(String text : data){
            System.out.print(text + " ");
        }
    }
}
