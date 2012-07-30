package com.cwatson.datastructure.trees;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/29/12
 * Time: 9:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class TreeNode<T> {

    T value;
    TreeNode<T> leftChild;
    TreeNode<T> rightChild;

    public TreeNode(T value, TreeNode<T> leftChild, TreeNode<T> rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
