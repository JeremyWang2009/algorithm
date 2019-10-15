package com.test.algorithm.junior;

/**
 * @author jeremy.wang
 * @date 2019-10-15
 * 一般算法解决方案
 */
public class Solution {

    public static int reverseInteger(int number) {
        String numberStr = String.valueOf(number);

        StringBuffer reverseBuffer = new StringBuffer();
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reverseBuffer.append(numberStr.charAt(i));
        }
        return Integer.valueOf(reverseBuffer.toString());
    }

    public static char lowercaseToUppercase(char character) {
        // write your code here
        String charStr = String.valueOf(character);
        String upperStr = charStr.toUpperCase();
        return upperStr.charAt(0);
    }

    public static int maxOfThreeNumbers(int num1, int num2, int num3) {
        // write your code here
        int max = num1 < num2 ? num2 : num1;
        return max < num3 ? num3 : max;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
        System.out.println(lowercaseToUppercase('a'));
        System.out.println(maxOfThreeNumbers(45, 46, 43));
    }

}
