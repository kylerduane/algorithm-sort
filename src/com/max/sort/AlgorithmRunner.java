package com.max.sort;

public class AlgorithmRunner {

    public static void run(Integer[] data, SortAlgorithm algorithm) {
        algorithm.sort(data);
        for (Integer temp : data) {
            System.out.println(temp.toString());
        }
    }

}
