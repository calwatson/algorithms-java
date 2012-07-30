package com.cwatson.datastructure.trees;

import com.sun.servicetag.SystemEnvironment;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: jcwatso
 * Date: 7/29/12
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearchTree implements Tree<String>{


    TreeNode<String> root;


    public void print(){

        Queue<List<TreeNode<String>>> queue = new LinkedList<List<TreeNode<String>>>();
        List<TreeNode<String>> rootList = new LinkedList<TreeNode<String>>();
        rootList.add(root);
        queue.offer(rootList);

        while(queue.peek() != null){
            List<TreeNode<String>> nodeList = queue.poll();
            List<TreeNode<String>> level = new LinkedList<TreeNode<String>>();

            for(TreeNode<String> node: nodeList){
                System.out.print(node.getValue() + " \t");

                if(node.getLeftChild() != null){
                    level.add(node.getLeftChild());
                }
                if(node.getRightChild() != null){
                    level.add(node.getRightChild());
                }
            }
            System.out.println("");
            if(level.size() > 0)
                queue.offer(level);
        }

    }


    public Tree<String> add(String value) {
        if(root == null){
            root = new TreeNode<String>(value,null,null);
            return this;
        }
        else insert(root,value);
        return this;
    }

    private void insert(TreeNode<String> root,String valueToInsert){

        if(valueToInsert.compareTo(root.getValue()) == 0){
            //value already exists
            return;
        }

        if(valueToInsert.compareTo(root.getValue()) > 0){
            if(root.getRightChild() == null){
                root.setRightChild(new TreeNode<String>(valueToInsert,null,null));
                return;
            }
            insert(root.getRightChild(), valueToInsert);
        }

        if(valueToInsert.compareTo(root.getValue()) < 0){
            if(root.getLeftChild() == null){
                root.setLeftChild(new TreeNode<String>(valueToInsert, null, null));
                return;
            }
            insert(root.getLeftChild(), valueToInsert);
        }

    }

    public Tree<String> delete(String node) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public TreeNode<String> find(String value) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public TreeNode<String> getRoot() {
        return root;
    }
}
