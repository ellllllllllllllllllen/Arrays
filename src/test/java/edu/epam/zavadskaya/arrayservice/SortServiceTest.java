package edu.epam.zavadskaya.arrayservice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortServiceTest {

    @Test
    public void testBubbleSort() {
        int[] array = {2, 5, 1, 3, 4};
        int[] expected = SortService.bubbleSort(array);
        int[] actual = {1, 2, 3, 4, 5};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        int[] array = {2, 5, 1, 3, 4};
        int[] expected = SortService.insertionSort(array);
        int[] actual = {1, 2, 3, 4, 5};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShellSort() {
        int[] array = {2, 5, 1, 3, 4};
        int[] expected = SortService.shellSort(array);
        int[] actual = {1, 2, 3, 4, 5};
        Assert.assertEquals(actual, expected);
    }


}