package com.max.sort;

public class BubbleSort implements SortAlgorithm{
    public static void main(String[] args) {
        AlgorithmRunner.run(new Integer[]{345,1,2,3,4,5},
                new BubbleSort());
    }
    @Override
    public  void sort(Integer[] data) {
        for(int i = 0; i < data.length - 1; i++) {
            boolean hasExchanged = false;
            for(int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    hasExchanged = true;
                }
            }
            if(!hasExchanged) {
                break;
            }
        }
    }

}
