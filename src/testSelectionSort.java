import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class testSelectionSort {
    @Test
    public void test() {
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }


    @Test
    public void testMixed(){

        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = -2;

        int[] SortedArr = new int[5];
        SortedArr[0] = -8;
        SortedArr[1] = -7;
        SortedArr[2] = -2;
        SortedArr[3] = 9;
        SortedArr[4] = 10;

        SelectionSort sorter = new SelectionSort();
        assertArrayEquals(SortedArr, sorter.basicSelectionSort(arr));
        System.out.println("testMixed passed: Output: " + Arrays.toString(arr) + " Expected: " + Arrays.toString(SortedArr));
    }

    @Test
    public void testDuplicates(){

        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 9;
        arr[2] = 9;
        arr[3] = 10;
        arr[4] = 2;

        int[] SortedArr = new int[5];
        SortedArr[0] = 2;
        SortedArr[1] = 2;
        SortedArr[2] = 9;
        SortedArr[3] = 9;
        SortedArr[4] = 10;

        SelectionSort sorter = new SelectionSort();
        assertArrayEquals(SortedArr, sorter.basicSelectionSort(arr));
        System.out.println("testDuplicates passed: Output: " + Arrays.toString(arr) + " Expected: " + Arrays.toString(SortedArr));
    }


}
