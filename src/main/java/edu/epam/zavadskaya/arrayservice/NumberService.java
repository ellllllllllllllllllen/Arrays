package edu.epam.zavadskaya.arrayservice;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberService {
    private static final Logger logger = LogManager.getLogger(NumberService.class);

    private static final int FIRST_THREE_DIGIT_NUMBER = 100;
    private static final int LAST_THREE_DIGIT_NUMBER = 999;
    private static final int DIGIT = 10;
    private static final int TWO_DIGITS = 100;
    private static final int THREE_DIGITS = 1000;

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        logger.info("Max number in array - array : {}", max);
        return max;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        logger.info("Min number in array - array : {}", min);
        return min;
    }

    public static ArrayList findPrimeNumber(int[] array){
        ArrayList primeNumbers = new ArrayList();

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < i; j++) {
                if(i % j == 0){
                    primeNumbers.add(array[i]);
                }
            }
        }
        logger.info("Prime numbers - array : {}", primeNumbers);
        return primeNumbers;
    }

    public static ArrayList findThreeDigitNumbers(int[] array){
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= FIRST_THREE_DIGIT_NUMBER && array[i] <= LAST_THREE_DIGIT_NUMBER){
                int thirdDigit = array[i] % DIGIT;
                int secondDigit = (array[i] % (TWO_DIGITS)) / DIGIT;
                int firstDigit = (array[i] % (THREE_DIGITS)) / (TWO_DIGITS);
                if(firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit){
                    numbers.add(array[i]);
                }
            }
        }
        logger.info("Three-digits numbers - array : {}", numbers);
        return numbers;
    }
}

