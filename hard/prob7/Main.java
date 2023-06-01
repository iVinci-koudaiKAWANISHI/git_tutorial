package hard.prob7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("一等賞：242358");
        System.out.println("±１で前後賞");
        System.out.println("下4桁一致2358で二等賞");
        System.out.println("下3桁一致358で三等賞");
        System.out.println();
        //winningNumberArrayListの値を分割してArrayListに格納
        int winningNumber = 242358;
        ArrayList<Integer> winningNumberArrayList = new ArrayList<>();
        String winning = Integer.toString(winningNumber);
        String[] wStrings = winning.split("");
        for (String nString : wStrings) {
            int num = Integer.parseInt(nString);
            winningNumberArrayList.add(num);
        }
        // 年賀状番号を指定する。
        ArrayList<Integer> newYearCards = new ArrayList<>(Arrays.asList(295283,267358,242359));
        //乱数を生成
        Integer numbers = (int)(Math.random() * 3);
        //newYearCardsのArrayListから取得した要素をgetNewYearCardsのArrayListに分割してから格納
        ArrayList<Integer> getNewYearCards = new ArrayList<>();
        String newYear = Integer.toString(newYearCards.get(numbers));//生成した乱数を取得し、newYearCardsのArrayListに格納された要素を指定し、取得。
        String[] newStr = newYear.split("");
        String numberGet = "";
        for (String yString : newStr) {
            int num = Integer.parseInt(yString);
            getNewYearCards.add(num);
            numberGet += yString;
        }
        System.out.print(numberGet + "：");
        //一等賞が出た場合、前後賞が出た場合、外れが出た場合の条件分岐
        int trueCount = 0;
        int falseCount = 0;
        for (int i = 0; i < winningNumberArrayList.size(); i++) {
            if (getNewYearCards.get(i) == winningNumberArrayList.get(i)) {
                trueCount++;
                if(trueCount > 5 && falseCount <= 0){
                    System.out.println("一等賞");
                    System.exit(0);
                }
            } else {
                falseCount++;
                if(trueCount >= 5){
                    if(getNewYearCards.get(i) == 7){
                        System.out.println("前後賞");
                        System.exit(0);
                    }else if(getNewYearCards.get(i) == 9){
                        System.out.println("前後賞");
                        System.exit(0);
                    }else{
                        System.out.println("外れ");
                        System.exit(0);
                    }   
                }else if(trueCount > 1){
                    System.out.println("外れ");
                    System.exit(0);
                }else if(falseCount > 2){
                    System.out.println("外れ");
                    System.exit(0);
                }
            }
        }
        //外れでも一等賞でも前後賞でもない場合に二等賞と三等賞のどちらかを判定
        int falseCount1 = 0;
        int trueCount1 = 0;
        for(int i = winningNumberArrayList.size()-1; i >= 0; i--){
            if(getNewYearCards.get(i) == winningNumberArrayList.get(i)){
                trueCount1++;
                if(trueCount1 == 5 && falseCount1 == 1){
                    System.out.println("二等賞");
                    System.exit(0);
                }
            }else{
                falseCount1++;
                if(falseCount1 == 2){
                    System.out.println("三等賞");
                    System.exit(0);;
                }
            }
        }
    }
}
