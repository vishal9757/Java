package com.avalia.learning.java.tree;

public class Main {

	public static void main(String[] args) {
		BTree bt = new BTree();
		bt.insert(8);
		bt.insert(4);
		bt.insert(1);
		bt.insert(5);
		bt.insert(2);
		bt.insert(3);
		bt.insert(6);
		bt.insert(7);
		bt.insert(9);
		bt.insert(10);
		bt.insert(11);
		bt.insert(12);
		bt.insert(13);
		bt.insert(14);
		bt.insert(15);

		System.out.println(bt.countNodes());
		System.out.print("Inorder->");
		bt.inorder();
		System.out.println();
		System.out.print("Preorder->");
		bt.preorder();
		System.out.println();
		System.out.print("Postorder->");
		bt.postorder();

		System.out.println(bt.search(7));
		System.out.println("Height of tree ->" + bt.height());

	}

}
