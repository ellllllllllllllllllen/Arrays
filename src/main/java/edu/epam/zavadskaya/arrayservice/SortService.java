package edu.epam.zavadskaya.arrayservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortService {
    private static final Logger logger = LogManager.getLogger(SortService.class);

    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        logger.info("Bubble sort - array : {}", array);
        return array;
    }

    public static int[] insertionSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        logger.info("Insertion sort - array : {}", array);
        return array;
    }

    public static int[] shellSort(int[] array) {
        int temp;
        int size = array.length;
        size = size / 2;
        while (size > 0) {
            for (int i = 1; i < array.length - size; i++) {
                int j = i;
                while (j >= 0 && array[j] > array[j + size]) {
                    temp = array[j];
                    array[j] = array[j + size];
                    array[j + size] = temp;
                    j--;
                }
            }
            size = size / 2;
        }
        logger.info("Shell sort - array : {}", array);
        return array;
    }
}

