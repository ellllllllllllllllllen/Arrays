package edu.epam.zavadskaya.controller;

import edu.epam.zavadskaya.entity.JaggedArrayEntity;


public class Main {
    public static void main(String[] args){

        JaggedArrayEntity array = new JaggedArrayEntity(new int[][]{{4, 2, 3, 3, 7},
                {2, 3, 4, 5},
                {1, 2, 3},
                {1, 2},
                {56}});

        int[][] jarray = array.getJaggedArray();
        SortByMax max = new SortByMax();

        JaggedSortService sorter = new JaggedSortService();

        int[] result = sorter.sortInAscendingOrder(jarray, max);
        for (int i = 0; i < result.length; i++) {
            System.out.println(" " + result[i]);
        }

    }
}
