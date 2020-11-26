package edu.epam.zavadskaya.jaggedservice;

public class Min implements ISorted{

    @Override
    public int findValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int[] crateArray(int[][] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[j] = findValue(array[i]);
            }
        }
        return newArray;
    }
}
