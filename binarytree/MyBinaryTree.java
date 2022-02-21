package com.bridgelab.binarytree;

public class MyBinaryTree {

	public static void main(String[] args) {
		BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		System.out.println("Size of binary tree is: " + size);
		myBinaryTree.print();
		myBinaryTree.searchKey(30);

	}

}
