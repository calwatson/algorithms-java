package com.cwatson.util;

import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/14/12
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataTest {

    @Test
    public void testRandomString(){
        RandomStringList rl = new RandomStringList();
        List<String> data = rl.take(5);
        assertNotNull(data);
        assertEquals(data.size(),5);
        System.out.println(data);
    }

    @Test
    public void testRandomInteger(){
        RandomIntList rl = new RandomIntList();
        List<Integer> data = rl.take(5);
        assertNotNull(data);
        assertEquals(data.size(),5);
        System.out.println(data);
    }


}
