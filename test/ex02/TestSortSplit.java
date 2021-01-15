package ex02;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestSortSplit {

    @Test
    public void testSortPartOne() {
        //This test case should cover the sortArray() method

        int[] input_array = {17, 13, 5, 19, 71, 31, 256, 23, 171, 9000, 42};

        int[] sortedArray = SortingHelper.sortArray(input_array);

        boolean sorted = true;
        for(int i=0; i < sortedArray.length-1; i++){
            if(sortedArray[i] > sortedArray[i+1]) {
                sorted = false;
            }
        }

        assertTrue(sorted);

        System.out.println("I'm done");
    }

    @Test
    public void testSortPartTwo() {
        //This test case should cover the printArray() method
        int[] input_array = {17, 13, 5, 19, 71, 31, 256, 23, 171, 9000, 42};

        SortingHelper.printArray(input_array);
    }

}
