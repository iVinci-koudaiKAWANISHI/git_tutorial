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
        for (String nString : wStrings) {
            int num = Integer.parseInt(nString);
            winningNumberArrayList.add(num);
        }
        // ArrayList<Integer> newYearCards = new ArrayList<>(Arrays.asList(295283, 267358, 242359));

        // 年賀状番号
        ArrayList<Integer> newYearCards = new ArrayList<>(Arrays.asList(214258, 267358, 242359));
        ArrayList<Integer> getNewYearCards = new ArrayList<>();
        String newYear = Integer.toString(newYearCards.get(0));
        String[] newStr = newYear.split("");
        for (String yString : newStr) {
            int num = Integer.parseInt(yString);
            getNewYearCards.add(num);
        }
        
        // 一等
        // 数値として比較
        /* 当選番号と一致する番号 */
        // if (newYearCards.get(i) == 242358){
        //     System.out.println("一等賞");
        //     break;
        // }

        // 前後賞
        // 数値として比較
        // 当選番号+1と同じ場合
        /* 当選番号の ±1 の番号（当選番号が 200000 または 299999 の場合，前後賞は一つしかありません） */
        // if (newYearCards.get(i) == 242359){
        //     System.out.println("前後賞");
        // }
        // 当選番号-1と同じ場合
        /* 当選番号の ±1 の番号（当選番号が 200000 または 299999 の場合，前後賞は一つしかありません） */
        // if (newYearCards.get(i) == 242357){
        //     System.out.println("前後賞");
        // }

        // 二等
        /* 当選番号と下 4 桁が一致する番号（1等に該当する番号を除く） */
        // if (false >= 0){
        //     System.out.println("二等賞");
        // }

        // 三等
        /* 当選番号と下 3 桁が一致する番号（1等および2等に該当する番号を除く） */
        // if (false > 1){
        //     System.out.println("三等賞");
        // }

        // 外れ
        int trueCount = 0;
        int falseCount = 0;
        for (int i = 0; i < winningNumberArrayList.size(); i++) {
            // System.out.println(winningNumberArrayList.get(i));
            // System.out.println(getNewYearCards.get(i));
            if (getNewYearCards.get(i) == winningNumberArrayList.get(i)) {
                ++trueCount;
                if(trueCount > 5 && falseCount <= 0){
                    System.out.println("一等賞");
                    break;
                }if(trueCount > 2 && falseCount <= 3){
                    System.out.println("三等賞");
                }
                
            } else {
                ++falseCount;
                if(trueCount >= 5){
                    if(getNewYearCards.get(i) == 7){
                        System.out.println("前後賞");
                        break;
                    }else if(getNewYearCards.get(i) == 9){
                        System.out.println("前後賞");
                        break;
                    }else{
                        System.out.println("外れ");
                        break;
                    }   
                }else if(trueCount > 1){
                    System.out.println("外れ");
                    break;
                }else if(trueCount > 2){
                    System.out.println("三等賞");
                } 
                
            }
        }

        // ArrayList<Integer> getNewYearCards1 = new ArrayList<>();
        // String newYear1 = Integer.toString(newYearCards.get(1));
        // String[] newString1 = newYear1.split("");
        // for (String yString1 : newString1) {
        // int num = Integer.parseInt(yString1);
        // getNewYearCards1.add(num);
        // }
        // for (int i = wStrings.length - 1; i >= 0; i--) {
        // if (getNewYearCards.get(i) == getNewYearCards1.get(i)) {
        // System.out.println(true);
        // } else {
        // ++j;
        // if (j >= 0) {
        // System.out.println("外れ");
        // break;
        // }

        // }
        // }

         /* 
         * 想定結果
         * 外れ
         * 3等章
         * 前後賞
         */
    }
}
