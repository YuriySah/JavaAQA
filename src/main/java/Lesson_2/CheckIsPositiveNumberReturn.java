package Lesson_2;

import java.util.Scanner;

// Задание № 3
public class CheckIsPositiveNumberReturn {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int number = value.nextInt();
        checkIsPositive(number);
    }

    private static boolean checkIsPositive(int number) {
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }
}
