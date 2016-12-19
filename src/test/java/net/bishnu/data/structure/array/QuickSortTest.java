package net.bishnu.data.structure.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by karlb on 2016-12-05.
 */
public class QuickSortTest {
    @Test
    public void testQuickSort(){
        Integer[] array = new Integer[]{5, 3, 7, 6, 2, 1, 4};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        Sort<Integer> sort = new QuickSort<>();
        sort.sort(array);

        Assert.assertArrayEquals(expected, array);

    }
}
