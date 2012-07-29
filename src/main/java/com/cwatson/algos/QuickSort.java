package com.cwatson.algos;

import com.cwatson.Sort;
import org.apache.commons.collections.ListUtils;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/29/12
 * Time: 6:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort implements Sort<String> {
    public List<String> sort(List<String> items) {
        if(items.size() <= 1){
            return items;
        }

        String pivot = items.get(0);

        List<String> less = new LinkedList<String>();
        List<String> more = new LinkedList<String>();
        List<String> pivotValues = new LinkedList<String>();

        for(String s : items){
            if(s.compareTo(pivot) < 0){
                less.add(s);
            }
            else if(s.compareTo(pivot) >  0){
               more.add(s);
            }
            else{
                pivotValues.add(s);
            }
        }

        less = sort(less);
        more = sort(more);
        less.addAll(pivotValues);
        less.addAll(more);
        return less;
    }


}
