package strings;



//O(n)
class Node{
	int data;
	Node left,right;
}

public class BstorNot {
	boolean isBst(Node root) {
		return isBstUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	boolean isBstUtil(Node root,min,max){
		if(root == null)
			return true;
		else if(root.data<min || max<root.data)
			return false;
		else
			return isBstutil(root.left,min,root.data - 1) && isBstUtil(root.right,root.data,max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
