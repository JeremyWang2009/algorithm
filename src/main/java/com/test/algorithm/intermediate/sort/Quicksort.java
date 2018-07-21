package com.test.algorithm.intermediate.sort;

import java.util.Arrays;

/**
 * Created by shanguang.wang on 18/7/14.
 * 快速排序：通过一趟排序将要排序的数据分隔成独立的两个部分，其中一部分数据都比另外一部分数据都要小，然后再按照此方法对这两部分数据进行快速排序，整个
 * 排序过程可以递归进行，以此达到整个数据变成有序序列.
 * 原理如下：
 * 1.设置两个变量l、h，排序开始的时候：l=0、h=array.length-1
 * 2.以第一个数组元素作为关键元素，赋值为povit，即povit=array[l]
 * 3.从h开始向前搜索，即由向前搜索h--，找到第一个小于povit的值，并交换两个值
 * 4.从l开始向后搜索，即由向后搜索l++，找到第一个大于povit的值， 并交换两个值
 * 5.重复3、4步骤，直到i==j.
 */
public class Quicksort {

    /**
     * 时间复杂度：O(n*logn)
     */
    public static void quicksort(int[] array, int low, int high){
        int l = low;
        int h = high;
        int povit = array[l];
        while (l<h){
            while (l<h && array[h]>povit)
                h--;
            if(l<h){
                int temp = array[h];
                array[h] = array[l];
                array[l] = temp;
                l++;
            }
            while (l<h && array[l]<povit)
                l++;
            if(l<h){
                int temp = array[h];
                array[h] = array[l];
                array[l] = temp;
                h--;
            }
        }
        if(l>low) quicksort(array, low, h-1);
        if(h<high) quicksort(array, l+1, high);
    }


    // test
    public static void main(String[] args){
        int[] array = {4,10,2,5,4,32,16,45,89,3,100,34,25,16,78,54,89};
        quicksort(array, 0, array.length-1);
        Arrays.stream(array).forEach(num->{
            System.out.print(num+" ");
        });
    }
}
