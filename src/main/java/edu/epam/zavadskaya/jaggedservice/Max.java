package edu.epam.zavadskaya.jaggedservice;

public class Max implements ISorted{

    @Override
    public int findValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
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
