package com.avalia.learning.java.tree;

public class BTree {
	public Node root;

	public BTree() {
	}

	/* Functions to insert data */
	public void insert(int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			insert(root, data);
		}
	}

	/* Function to insert data recursively */
	private void insert(Node node, int data) {
		if (data < node.data) {
			if (node.left == null) {
				node.left = new Node(data);
			} else {
				insert(node.left, data);
			}
		} else {
			if (node.right == null) {
				node.right = new Node(data);
			} else {
				insert(node.right, data);
			}
		}

		// if (countNodes(node.right) < countNodes(node.left)) {
		// node.right = insert(node.right, data);
		// } else {
		// node.left = insert(node.left, data);
		// }

		// if (node.getRight() == null)
		// node.right = insert(node.right, data);
		// else
		// node.left = insert(node.left, data);
	}

	public int countNodes() {
		return countNodes(root);
	}

	/* Function to count number of nodes recursively */
	private int countNodes(Node r) {
		if (r == null)
			return 0;
		else {
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(Node r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node r) {
		if (r != null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
		}
	}

	public boolean search(int data) {
		return search(data, root);
	}

	private boolean search(int data, Node r) {
		if (r != null) {
			inorder(r.getLeft());
			if (r.getData() == data) {
				return true;
			} else if (data > r.data) {
				return search(data, r.right);
			} else {
				return search(data, r.left);
			}
		}
		return false;
	}

	public int height() {
		return height(root);

	}

	private int height(Node r) {
		if (r == null) {
			return 0;
		} else {
			int l = 1, ri = 1;
			l += height(r.getLeft());
			ri += height(r.getRight());
			if (l > ri) {
				return l;
			} else {
				return ri;
			}
		}
	}

}
