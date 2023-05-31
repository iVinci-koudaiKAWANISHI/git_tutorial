package hard.prob7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // input
        // 当選番号
        int winningNumber = 242358;
        ArrayList<Integer> winningNumberArrayList = new ArrayList<>();
        String winning = Integer.toString(winningNumber);
        String[] wStrings = winning.split("");
        for(String nString : wStrings){
            int num = Integer.parseInt(nString);
            winningNumberArrayList.add(num);
        }
        // 年賀状番号
        ArrayList<Integer> newYearCards = new ArrayList<>(Arrays.asList(295283, 267358, 242359));
        ArrayList<Integer> getNewYearCards = new ArrayList<>();
        String newYear = Integer.toString(newYearCards.get(0));
        String[] newStr = newYear.split("");
        for(String yString : newStr){
            int num = Integer.parseInt(yString);
            getNewYearCards.add(num);
        }
        int j = 0;
        for(int i = wStrings.length-1 ; i >= 0 ; i--){
            if(getNewYearCards.get(i) == winningNumberArrayList.get(i)){
                System.out.println(true);
            }else{
                ++j;
                if(j > 4){
                    System.out.println("外れ");
                    break;
                }

            }
        }
        ArrayList<Integer> getNewYearCards1 = new ArrayList<>();
        String newYear1 = Integer.toString(newYearCards.get(1));
        String[] newString1 = newYear1.split("");
        for(String yString1 : newString1){
            int num = Integer.parseInt(yString1);
            getNewYearCards1.add(num);
        }
        for(int i = wStrings.length-1 ; i >= 0 ; i--){
            if(getNewYearCards.get(i) == getNewYearCards1.get(i)){
                System.out.println(true);
            }else{
                ++j;
                if(j >= 0){
                    System.out.println("外れ");
                    break;
                }

            }
        }

        

        /*
         * 想定結果
         * 外れ
         * 3等章
         * 前後賞
         */
    }
}
