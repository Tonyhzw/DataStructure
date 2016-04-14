package so;

import java.util.ArrayList;
import java.util.LinkedList;

public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] array= {"1","2","3","4","5","6","7","8","9","10","11","12"}; //element by level of binary tree traversal.
        int len=array.length;
        //build a binary tree
        LinkedList<Node> head=new LinkedList<Node>();
        for(int i=0;i<len;i++){
          //String s=String.valueOf(array[i]);
          int val=Integer.parseInt(array[i]);
          Node node=new Node(val);
          head.add(node);
        }
        int i=0;
        for(i=0;i<len/2-1;i++){
        	head.get(i).setLeft(head.get(2*i+1));
        	head.get(i).setRight(head.get(2*i+2));
        }
        //the last parent
       head.get(i).setLeft(head.get(2*i+1));
       if(len%2==1){
    	   head.get(i).setRight(head.get(2*i+2));
       }
       printTreeFirst(head.get(0));
       System.out.println();
       printTreeMidd(head.get(0));
       System.out.println();
       printTreeLast(head.get(0));
	}
	public static void printTreeFirst(Node node){//pre-order
		if(node!=null) System.out.print(node.val);
		if(node.leftnode!=null) printTreeFirst(node.leftnode);
		if(node.rightnode!=null) printTreeFirst(node.rightnode);
	}
	public static void printTreeMidd(Node node){//in-order
		if(node.leftnode!=null) printTreeFirst(node.leftnode);
		if(node!=null) System.out.print(node.val);
		if(node.rightnode!=null) printTreeFirst(node.rightnode);
	}
	public static void printTreeLast(Node node){//post-order
		if(node.leftnode!=null) printTreeFirst(node.leftnode);
		if(node.rightnode!=null) printTreeFirst(node.rightnode);
		if(node!=null) System.out.print(node.val);
	}
}
