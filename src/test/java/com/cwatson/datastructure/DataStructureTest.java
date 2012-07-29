package com.cwatson.datastructure;

import com.cwatson.algos.MergeSort;
import com.cwatson.algos.QuickSort;
import com.cwatson.datastructure.trees.BinarySearchTree;
import com.cwatson.datastructure.trees.Tree;
import com.cwatson.util.RandomStringList;
import org.testng.annotations.Test;

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
public class DataStructureTest {

    @Test
    public void testBasicBST(){
        RandomStringList stringList = new RandomStringList();
        List<String> items = stringList.take(100);
        BinarySearchTree tree = new BinarySearchTree();
        for(String item : items){
            tree.add(item);
        }

        tree.print();

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
