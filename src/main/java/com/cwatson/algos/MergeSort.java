package com.cwatson.algos;

import com.cwatson.Sort;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/14/12
 * Time: 4:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort implements Sort<String>{

    public List<String> sort(List<String> items) {
        if(items.size() <= 1){
            return items;
        }

        int middle = items.size() / 2;
        List<String> left = items.subList(0,middle);
        List<String> right = items.subList(middle, items.size());

        return merge(sort(left),sort(right));
    }

    private List<String> merge(List<String> left, List<String> right) {
        List<String> sorted = new LinkedList<String>();

        while(left.size() > 0 && right.size() > 0){
            if(left.get(0).compareTo(right.get(0)) < 0){
                sorted.add(left.get(0));
                left = left.subList(1,left.size());
            }else{
                sorted.add(right.get(0));
                right = right.subList(1, right.size());
            }

        }
        sorted.addAll(left);
        sorted.addAll(right);
        return sorted;
    }


}
