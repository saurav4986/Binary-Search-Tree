package com.bridgelabz.BST;

/*(UC-1_Create_BST)
Ability to create a BST by adding 56 and then
adding 30 & 70 - Use INode to create My Binary Node
- Note the key has to extend comparable to compare and determine left or right node
- First add 56 as root node so 30 will be added to left and 70 to right*/

public class BinarySearchTree {
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int value){
        root = insert(root, value);
    }

    public TreeNode insert( TreeNode root, int value){
        if (root == null || root.data == value){
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data){
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(56);
        tree.insert(30);
        tree.insert(70);

    }
}