package com.Trees;
// TODO Pre Order Sequence
public class Binary_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int index = -1;

        public static Node BuildTree(int[] node){
            index++;
            if(node[index]==-1){
                return null;
            }
            Node newNode = new Node(node[index]);
            newNode.left = BuildTree(node);
            newNode.right = BuildTree(node);

            return newNode;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node rootNode = tree.BuildTree(nodes);
        //System.out.println(rootNode.data);
        preOrder(rootNode);
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " - > ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
