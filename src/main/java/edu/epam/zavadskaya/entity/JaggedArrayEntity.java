package edu.epam.zavadskaya.entity;

import java.util.Arrays;

public class JaggedArrayEntity {
    private int[][] jaggedArray;

    public JaggedArrayEntity(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    public int[][] getJaggedArray() {
        return jaggedArray;
    }

    public void setJaggedArray(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JaggedArrayEntity that = (JaggedArrayEntity) o;
        return Arrays.equals(jaggedArray, that.jaggedArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(jaggedArray);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JaggedArrayEntity{");
        sb.append("jaggedArray=").append(Arrays.toString(jaggedArray));
        sb.append('}');
        return sb.toString();
    }
}
