package selectionsort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

	@Test
    public void testBasicSelectionSort() {
        SelectionSort selectionSort = new SelectionSort();

        // Positive numbers
        int[] inputArray1 = {5, 2, 9, 1, 5, 6};
        int[] expectedOutput1 = {1, 2, 5, 5, 6, 9};
        assertArrayEquals(expectedOutput1, selectionSort.basicSelectionSort(inputArray1));
        
        // Array with negatives
        int[] inputArray2 = {-3, -5, -1, -10, -2, -6};
        int[] expectedOutput2 = {-10, -6, -5, -3, -2, -1};
        assertArrayEquals(expectedOutput2, selectionSort.basicSelectionSort(inputArray2));
        
        // Array with mixed numbers

        int[] inputArray6 = {3, -2, 1, -5, 4, 0};
        int[] expectedOutput6 = {-5, -2, 0, 1, 3, 4};
        assertArrayEquals(expectedOutput6, selectionSort.basicSelectionSort(inputArray6));

        // Array with duplicate elements
        int[] inputArray4 = {3, 2, 1, 3, 4, 2};
        int[] expectedOutput4 = {1, 2, 2, 3, 3, 4};
        assertArrayEquals(expectedOutput4, selectionSort.basicSelectionSort(inputArray4));

        // Empty array
        int[] inputArray5 = {};
        int[] expectedOutput5 = {};
        assertArrayEquals(expectedOutput5, selectionSort.basicSelectionSort(inputArray5));
        
    
    }

}
