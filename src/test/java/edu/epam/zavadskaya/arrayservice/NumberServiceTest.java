package edu.epam.zavadskaya.arrayservice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberServiceTest {

    @Test
    public void testFindMax() {
        int[] array = {2, 5, 1, 3, 4};
        int expected = NumberService.findMax(array);
        int actual = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMin() {
        int[] array = {2, 5, 1, 3, 4};
        int expected = NumberService.findMin(array);
        int actual = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindPrimeNumber() {
    }

    @Test
    public void testFindThreeDigitNumbers() {
    }
}