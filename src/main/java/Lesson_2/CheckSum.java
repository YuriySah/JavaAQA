package Lesson_2;

import java.util.Scanner;

// Задание № 1
public class CheckSum {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int a = value.nextInt();
        int b = value.nextInt();
        checkSumInterval(a, b);
    }

    private static boolean checkSumInterval(int a, int b) {
        int summ = a + b;
        if (summ >= 10 && summ <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}