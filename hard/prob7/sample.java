package hard.prob7;

import java.util.ArrayList;
import java.util.Arrays;

public class sample {
    public static void main(String[] args) {
        int winningNumber = 999999;
        ArrayList<Integer> newYearCards = new ArrayList<>(Arrays.asList(1000000, 267358, 242359));
        int last4Wining = winningNumber % 10000;
        int last3Wining = winningNumber % 1000;
        for (int newYearCard : newYearCards) {
            // 2等賞用に下4桁抽出
            int last4Card = newYearCard % 10000;
            // 3等賞用に下3桁抽出
            int last3Card = newYearCard % 1000;
            if (winningNumber == newYearCard) {
                System.out.println("一等賞");
            } else if (winningNumber == newYearCard + 1 || winningNumber == newYearCard - 1) {
                System.out.println("前後賞");
            } else if (last4Card == last4Wining) {
                System.out.println("二等賞");
            } else if (last3Card == last3Wining) {
                System.out.println("三等賞");
            } else {
                System.out.println("外れ");
            }
        }
    }
}
