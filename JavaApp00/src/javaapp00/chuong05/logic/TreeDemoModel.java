/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong05.logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Admin
 */
public class TreeDemoModel implements TreeModel {

    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public TreeDemoModel() {
        rootNode = buildTree("Car&Motor");
        tree = new DefaultTreeModel(rootNode);
    }
    
    private DefaultMutableTreeNode buildTree(String rootName){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
        
        DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
        DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");
        
        root.add(car);
        root.add(motor);
        
        DefaultMutableTreeNode honda = new DefaultMutableTreeNode("Honda");
        DefaultMutableTreeNode toyota = new DefaultMutableTreeNode("toyota");
        DefaultMutableTreeNode mazda = new DefaultMutableTreeNode("mazda");
        car.add(honda);
        car.add(toyota);
        car.add(mazda);
        
        DefaultMutableTreeNode suzuki = new DefaultMutableTreeNode("suzuki");
        DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode("yamaha");
        motor.add(suzuki);
        motor.add(yamaha);
        
        return root;
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(DefaultMutableTreeNode rootNode) {
        this.rootNode = rootNode;
    }
    
    @Override
    public Object getRoot() {
        return rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
        return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
    }
    
}
