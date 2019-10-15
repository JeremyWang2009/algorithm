package com.test.algorithm.intermediate.sort;

import java.util.Arrays;

/**
 * @author jeremy.wang
 * @date 2019-10-15
 * 冒泡排序：这个算法名字的由来是因为越来越大的元素会经由交换慢慢"浮"到数列的顶端，故名"冒泡排序"
 * 原理如下：
 * 1.比较相领的元素。如果第一个比第二个大，就交换他们两个
 * 2.对每一组相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数
 * 3.针对所有的元素做同样的步骤，除了最后一个
 * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一个数字需要比较.
 */
public class BubbleSort {

    /**
     * 从小到大排序
     * 时间复杂度：若文件是反序的，需要进行n-1躺排序：3*(n-1)+3(n-2)……+3(1)=3n*(n-1)/2，则冒泡排序的时间复杂度为O(n^2)
     * 最小时间复杂度：O(n)
     * 算法稳定性：相邻的两个元素进行比较，交换也发生在这两个元素之间。所以，如果两个元素相等，不会交换
     */
    public static int[] bubble(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


    // test
    public static void main(String[] args) {
        int[] array = {4, 10, 2, 5, 4, 32, 16, 45, 89, 3, 100, 34, 25, 16, 78, 54, 89};
        array = bubble(array);
        Arrays.stream(array).forEach(num -> {
            System.out.print(num + " ");
        });
    }
}
