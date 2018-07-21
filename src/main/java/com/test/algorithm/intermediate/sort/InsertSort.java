package com.test.algorithm.intermediate.sort;

import java.util.Arrays;

/**
 * Created by shanguang.wang on 18/7/21.
 * 插入排序：在一个已经有序的数组序列中，插入一个数，要求插入后数据序列仍然有序，算法适用于少量数据的排序.
 * 原理如下：
 * 1.默认第一个元素为有序序列
 * 2.从第二个元素开始，在已排序的序列中从右向左比较，小于则交换，大于则不变，一直遍历直到大于前面一个数值，停止遍历
 * 3.依次将第三、四……元素和有序序列进行比较，直到完成最后一个元素的插入
 */
public class InsertSort {

    /**
     * 从小到大排序
     * 时间复杂度：最坏的情况下，序列是降序序列，那么此时需要n*(n-1)/2次，平均来说时间复杂度为O(n^2)
     * 最小时间复杂度：O(n)
     * 算法稳定性：相邻的两个元素进行比较，交换也发生在这两个元素之间。所以，如果两个元素相等，不会交换
     */
    public static int[] insertSort(int[] array){
        if(array == null || array.length<2)
            return array;
        int temp;
        for(int i=1;i<array.length;i++){    // 从第二个元素开始遍历，排序
            for(int j=i;j>0;j--){
                if(array[j] < array[j-1]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }else{
                    break;  //已经排序序列，比第一个数大则无需遍历
                }
            }
        }
        return array;
    }


    // test
    public static void main(String[] args){
        int[] array = {4,10,2,5,4,32,16,45,89,3,100,34,25,16,78,54,89};
        array = insertSort(array);
        Arrays.stream(array).forEach(num->{
            System.out.print(num+" ");
        });
    }
}
