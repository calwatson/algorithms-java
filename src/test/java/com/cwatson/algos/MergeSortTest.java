package com.cwatson.algos;

import com.cwatson.util.RandomStringList;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/15/12
 * Time: 9:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortTest {

    @Test
    public void testBasic(){
        RandomStringList stringList = new RandomStringList();
        List<String> items = stringList.take(10000               );
        MergeSort mergeSort = new MergeSort();
        List<String> sorted = mergeSort.sort(items);

        Collections.sort(items);

        assertEquals(sorted.size(),10000);
        assertEquals(sorted, items);
    }
}
