package edu.epam.zavadskaya.arrayservice;

import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Random;
import java.util.Scanner;

public class ArrayService {
    private static final Logger logger = LogManager.getLogger(ArrayService.class);

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    private static final String PATH = "array.txt";

    public static int[] consoleFill(int size, Scanner scanner){
        int[] array = new int[size];
        for (int i=0; i <size; i++) {
            array[i] = scanner.nextInt();
        }
        logger.info("Console fill - array : {}", array);
        return array;
    }

    public static int[] randomFill(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(MAX_VALUE) + MIN_VALUE;
        }
        logger.info("Random fill - array : {}", array);
        return array;
    }

    public static int getArraySize(){
        int count = 0;
        try(Scanner scanner = new Scanner(new File(PATH))) {
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
        } catch (FileNotFoundException ex){
            logger.error("File not found.");
        }
        return count;
    }
    public static int[] fillFromFile(){
        int size = getArraySize();
        int [] array = new int [size];
        int i = 0;
        try(Scanner scanner = new Scanner(new File(PATH))){
            while(scanner.hasNextInt())
            {
                array[i++] = scanner.nextInt();
            }
        } catch (FileNotFoundException ex){
            logger.error("File not found.");
        }
        logger.info("Fill from file - array : {}", array);
        return array;
    }
    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int index = 0;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == elementToSearch) {
                index = middleIndex;
            } else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        logger.info("Binary search - array : {} , value : {} , index in array : {} ", array, elementToSearch, index);
        return index;
    }
}

