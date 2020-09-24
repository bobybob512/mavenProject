package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*      It's the academic year's end, fateful moment of your school report.
        The averages must be calculated.
        All the students come to you and entreat you to calculate their average for them.
        Easy ! You just need to write a script.

        Return the average of the given array rounded down to its nearest integer.

        The array will never be empty.*/

public class School {

    private int getAverage(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum = sum + ints[i];
        }
        return sum / ints.length;
    }

    @Test
    public void simpleTest() {
        assertEquals(2, getAverage(new int[]{2, 2, 2, 2}));
        assertEquals(3, getAverage(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1, getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));
    }
}
