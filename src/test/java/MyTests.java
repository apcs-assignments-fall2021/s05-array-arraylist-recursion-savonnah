import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {
    @Test
    public void testSum() {
        // sum([1, 2, 3, 4]) => 10
        // sum([4, 3, 2, 1]) => 10
        // sum([7, 3, 2, 8, 2, 3, 4]) => 29
        assertEquals(10, MyMain.sum(new int[] {1, 2, 3, 4}), "The sum of [1, 2, 3, 4] should be: 10");
        assertEquals(10, MyMain.sum(new int[] {4, 3, 2, 1}), "The sum of [4, 3, 2, 1] should be: 10");
        assertEquals(29, MyMain.sum(new int[] {7, 3, 2, 8, 2, 3, 4}), "The sum of [7, 3, 2, 8, 2, 3, 4] should be: 10");
    }

    @Test
    public void testSearch() {
        // search([1, 2, 3, 4], 1) => true
        // search([1, 2, 3, 4], 7) => false
        // search([7, 3, 2, 8, 2, 3, 4], 3) => true
        assertEquals(true, MyMain.search(new ArrayList<Integer> (Arrays.asList(1, 2, 3, 4)), 1), "Searching [1, 2, 3, 4] for 1 should be: true");
        assertEquals(false, MyMain.search(new ArrayList<Integer> (Arrays.asList(1, 2, 3, 4)), 7), "Searching [1, 2, 3, 4] for 7 should be: false");
        assertEquals(true, MyMain.search(new ArrayList<Integer> (Arrays.asList(7, 3, 2, 8, 2, 3, 4)), 3), "Searching [7, 3, 2, 8, 2, 3, 4] for 3 should be: true");
    }

    @Test
    public void testAllEven() {
        // allEven([1, 2, 3, 4]) => false
        // allEven([0, 2, 6, 4]) => true
        // allEven([7, 3, 2, 8, 2, 3, 4]) => false
        assertEquals(false, MyMain.allEven(new int[] {1, 2, 3, 4}), "Checking if [1, 2, 3, 4] are all even should be: false");
        assertEquals(true, MyMain.allEven(new int[] {0, 2, 6, 4}), "Checking if [0, 2, 6, 4] are all even should be: true");
        assertEquals(false, MyMain.allEven(new int[] {7, 3, 2, 8, 2, 3, 4}), "Checking if [7, 3, 2, 8, 2, 3, 4] are all even should be: false");
    }

    @Test
    public void testHasCountCopies() {
        assertEquals(false, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 2, 1), "Whether or not the array [1, 2, 5, 2, 1, 3, 2] contains exactly 1 copy of 2 should be: false");
        assertEquals(true, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 2, 3), "Whether or not the array [1, 2, 5, 2, 1, 3, 2] contains exactly 3 copies of 2 should be: true");
        assertEquals(false, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 2, 4), "Whether or not the array [1, 2, 5, 2, 1, 4, 2] contains exactly 4 copies of 2 should be: false");
        assertEquals(false, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 1, 1), "Whether or not the array [1, 2, 5, 2, 1, 3, 2] contains exactly 1 copy of 1 should be: false");
        assertEquals(true, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 1, 2), "Whether or not the array [1, 2, 5, 2, 1, 3, 2] contains exactly 2 copies of 1 should be: true");
        assertEquals(false, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 1, 4), "Whether or not the array [1, 2, 5, 2, 1, 4, 2] contains exactly 4 copies of 1 should be: false");
    }

    @Test
    public void testIsSorted() {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 4}));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 1, 2, 2}));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(new Integer[] {-5, -3, -1, 2}));
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 1, 4}));
        ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 2}));
        assertEquals(true, MyMain.isSorted(list1), "Whether or not the ArrayList [1, 2, 3, 4] is sorted should be: true");
        assertEquals(true, MyMain.isSorted(list2), "Whether or not the ArrayList [1, 1, 2, 2] is sorted should be: true");
        assertEquals(true, MyMain.isSorted(list3), "Whether or not the ArrayList [-5, -3, -1, 2] is sorted should be: true");
        assertEquals(false, MyMain.isSorted(list4), "Whether or not the ArrayList [1, 2, 1, 4] is sorted should be: false");
        assertEquals(false, MyMain.isSorted(list5), "Whether or not the ArrayList [1, 2, 3, 2] is sorted should be: false");
    }

    @Test
    public void testEscape() {
                                                                // row coordinates:
          char[][] mat = { {'w', 'w', ' ', 'w', 'w', 'w'},      // 0
                           {'w', ' ', ' ', 'w', 'f', 'w'},      // 1
                           {'w', ' ', 'w', 'w', ' ', 'w'},      // 2
                           {'w', ' ', ' ', ' ', ' ', 'w'},      // 3
                           {'w', 'w', 'w', ' ', 'w', 'w'},      // 4
                           {'w', ' ', ' ', ' ', 'w', ' '},      // 5
                           {'w', 'w', 'w', 'w', 'w', ' '} };    // 6
        // col coordinates:  0    1    2    3    4    5

        // escape(mat, 0, 0) => false because (0, 0) is a wall
        // escape(mat, 0, 2) => true because we should be able to make it to f at (1, 4)
        // escape(mat, 5, 1) => true because we should be able to make it to f at (1, 4)
        // escape(mat, 6, 5) => false because we get stuck

        assertEquals(false, MyMain.escape(mat, 0, 0), "Starting at (0, 0) should return false because (0, 0) is a wall");
        // row coordinates:
        mat = new char[][]{{'w', 'w', ' ', 'w', 'w', 'w'},      // 0
                {'w', ' ', ' ', 'w', 'f', 'w'},      // 1
                {'w', ' ', 'w', 'w', ' ', 'w'},      // 2
                {'w', ' ', ' ', ' ', ' ', 'w'},      // 3
                {'w', 'w', 'w', ' ', 'w', 'w'},      // 4
                {'w', ' ', ' ', ' ', 'w', ' '},      // 5
                {'w', 'w', 'w', 'w', 'w', ' '}};    // 6
        // col coordinates:  0    1    2    3    4    5

        assertEquals(true, MyMain.escape(mat, 0, 2), "Starting at (0, 2) should return true because we should be able to make it to f at (1, 4)");
        mat = new char[][]{{'w', 'w', ' ', 'w', 'w', 'w'},      // 0
                {'w', ' ', ' ', 'w', 'f', 'w'},      // 1
                {'w', ' ', 'w', 'w', ' ', 'w'},      // 2
                {'w', ' ', ' ', ' ', ' ', 'w'},      // 3
                {'w', 'w', 'w', ' ', 'w', 'w'},      // 4
                {'w', ' ', ' ', ' ', 'w', ' '},      // 5
                {'w', 'w', 'w', 'w', 'w', ' '}};    // 6
        // col coordinates:  0    1    2    3    4    5

        assertEquals(true, MyMain.escape(mat, 5, 1), "Starting at (5, 1) should return true because we should be able to make it to f at (1, 4)");
        mat = new char[][]{{'w', 'w', ' ', 'w', 'w', 'w'},      // 0
                {'w', ' ', ' ', 'w', 'f', 'w'},      // 1
                {'w', ' ', 'w', 'w', ' ', 'w'},      // 2
                {'w', ' ', ' ', ' ', ' ', 'w'},      // 3
                {'w', 'w', 'w', ' ', 'w', 'w'},      // 4
                {'w', ' ', ' ', ' ', 'w', ' '},      // 5
                {'w', 'w', 'w', 'w', 'w', ' '}};    // 6
        // col coordinates:  0    1    2    3    4    5

        assertEquals(false, MyMain.escape(mat, 6, 5), "Starting at (6, 5) should return false because we get stuck");
    }
}
