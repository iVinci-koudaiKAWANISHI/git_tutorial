package hard.prob7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //input
        //当選番号
        int winningNumber = 242358;
        // 年賀状番号
        ArrayList<Integer> newYearCards = new ArrayList<>(Arrays.asList(295283,267358,242359));
        for(int i = 0; i < newYearCards.size(); i++){
            if(winningNumber == newYearCards.get(i)){
                System.out.println("一等賞");
            }else if(winningNumber == newYearCards.get(i) + 1){
                System.out.println("前後賞");
            }else if(winningNumber == newYearCards.get(i) - 1){
                System.out.println("前後賞");
            }else if((winningNumber - newYearCards.get(i)) % 100 == 0){
                System.out.println("三等賞");
            }else if((winningNumber - newYearCards.get(i)) % 100 == 0){
                System.out.println("二等賞");
            }else{
                System.out.println("外れ");
            }
        }
    }
}
