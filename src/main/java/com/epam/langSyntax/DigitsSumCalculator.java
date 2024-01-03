package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int value = 0;
        for (int k = 0, j = 1; j < number; k++, j*=10) {
            int x = 1;
            for (int i = 0; i < k + 1; i++) {
                x *= 10;
            }
            int val = number % (x);
            x = 1;
            for (int i = 0; i < k; i++) {
                x *= 10;
            }
            val = val / x;
            value += val;
        }
        System.out.println(value);
    }
}
