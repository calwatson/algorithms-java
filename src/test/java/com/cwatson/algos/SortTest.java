package com.cwatson.algos;

import com.cwatson.util.RandomStringList;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/15/12
 * Time: 9:34     n  b,
 * To change this template use File | Settings | File Templates.
 */
public class SortTest {

    @Test
    public void testMergeSort(){
        RandomStringList stringList = new RandomStringList();
        List<String> items = stringList.take(10000);
        MergeSort mergeSort = new MergeSort();
        List<String> sorted = mergeSort.sort(items);

        Collections.sort(items);

        assertEquals(sorted.size(),10000);
        assertEquals(sorted, items);
    }

    @Test
    public void testQuickSort(){
        RandomStringList stringList = new RandomStringList();
        List<String> items = stringList.take(10000);
        QuickSort quickSort = new QuickSort();
        List<String> sorted = quickSort.sort(items);

        Collections.sort(items);

        System.out.println(sorted);
        System.out.println(items);

        assertEquals(sorted.size(),10000);
        assertEquals(sorted, items);
    }
}
