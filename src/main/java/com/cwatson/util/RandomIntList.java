package com.cwatson.util;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/14/12
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class RandomIntList {

    public List<Integer> take(Integer count){
        List<Integer> items = new LinkedList<Integer>();
        int i = 0;
        while(i < count){
            items.add(getInt());
            i++;
        }
        return items;
    }

    private Integer getInt(){
       Random r = new Random();
       return r.nextInt();
    }
}
