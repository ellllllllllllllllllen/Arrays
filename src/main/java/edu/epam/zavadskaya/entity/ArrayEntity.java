package edu.epam.zavadskaya.entity;

import java.util.Arrays;

public class ArrayEntity {
    private int[] array;

    public ArrayEntity(int[] array) {
        this.array = array;
    }

    public ArrayEntity(int size){
        array = new int[size];
    }

    public int getElement(int index) {
        return array[index];
    }

    public void setElement(int index, int num) {
        this.array[index] = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayEntity myArray = (ArrayEntity) o;
        return Arrays.equals(array, myArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyArray{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}
