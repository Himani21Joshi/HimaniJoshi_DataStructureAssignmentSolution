package com.greatlearning.BSTtoSkewedTree;

public class SkewedTree
{
    public Node node;
    static Node prevNode = null;
    static Node headNode = null;
	   
    public static void BSTtoSkewed(Node root,int order)
    {
	       
        if(root == null)
        {
            return;
        }
       
        if(order > 0)
        {
        	BSTtoSkewed(root.right, order);
        }
        else
        {
        	BSTtoSkewed(root.left, order);
        }
        
        Node rightNode = root.right;
        Node leftNode = root.left;
       
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
       
        if (order > 0)
        {
        	BSTtoSkewed(leftNode, order);
        }
        else
        {
        	BSTtoSkewed(rightNode, order);
        }
    }
	   
    public static void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);    
    }
}