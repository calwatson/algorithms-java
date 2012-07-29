package com.cwatson.datastructure.trees;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/29/12
 * Time: 10:07 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Tree<T> {

    Tree<T> add(T n);

    Tree<T> delete(T n);

    TreeNode<T> find(T value);



}
