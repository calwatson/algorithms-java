package com.cwatson.util;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/14/12
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class RandomStringList {

    public List<String> take(Integer count){
        List<String> items = new LinkedList<String>();
        int i = 0;
        while(i < count){
            items.add(getString());
            i++;
        }
        return items;
    }

    private String getString(){
       Random r = new Random();
       return Long.toString(Math.abs(r.nextLong()), 36);
    }
}
