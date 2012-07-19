package com.cwatson;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/14/12
 * Time: 8:49 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Sort<T> {

   List<T> sort(List<T> items);
}
