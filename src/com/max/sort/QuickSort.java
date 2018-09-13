package com.max.sort;

public class QuickSort implements SortAlgorithm {
    public static void main(String[] args) {
        AlgorithmRunner.run(new Integer[]{127,2, 2, 2, 4, 7, 3, 1, 9, 56, 23, 127, 42, 3, 7},
                new QuickSort());
    }

    @Override
    public void sort(Integer[] data) {
        _sort(data, 0, data.length - 1);
    }

    private void _sort(Integer[] data, int start, int end) {
        if (start >= end) {
            return;
        }
        int oriStart = start;
        int oriEnd = end;
        // 作为这个区间的比较基准,比他小的都在key左面,比他大的都在key右面
        int key = data[start];
        while (start < end) {
            while (data[end] >= key && start < end) {
                end--;
            }
            // 发现右面有比key小的,那么将他送到左边,算法描述上交换位置,其实根本不用,因为此时end的下一次命运就是被之后
            // 某个start替换,这个某个start只有的命运也是被某个end替换,某个end又是....所以只要在最好start==end时,
            // 把这个位置换成key值就行了.
            data[start] = data[end];
            while (data[start] <= key && start < end) {
                start++;
            }
            // 去掉了之前对于start>=end逃离while的判断,因为这种条件只能是start==end,所以交换也没有影响,代码更简洁.
            data[end] = data[start];
        }
        data[start] = key;
        _sort(data, oriStart, end - 1);
        _sort(data, start + 1, oriEnd);
    }
}
