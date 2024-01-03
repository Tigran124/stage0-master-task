package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuffer num = new StringBuffer(String.valueOf(number));
        num.reverse();
        System.out.println(num);
    }

}
