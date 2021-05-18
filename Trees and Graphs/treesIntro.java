Trees
Leaf Node

1.Binary Tree
2.Binary Search Tree - all left <= n < all right - for each node;
3.Balanced vs unbalanced
4.Complete binary trees - each node - 2 children, except perhaps last level
5.Full binary trees - every node has 0 or 2 children
6.Perfect binary tree - full & complete - all leaf nodes at same level and that level has max no of nodes

Binary Tree Traversals
1.Inorder
Left Root Right
void InOrderTraversal(TreeNode Node){
  if(Node != null){
  InOrderTraversal(Node.left);
  visit(Node);
  InOrderTraversal(Node.right);
  }
}

Inorder traversal of BST gives ascending order

2.PreOrder
Root Left Right
void PreOrderTraversal(TreeNode Node){
  if(Node!= null){
  visit(Node);
  PreOrderTraversal(Node.left);
  PreOrderTraversal(Node.right);
  }
}
3.PostOrder
Left Right Root
void postOrderTraversal(TreeNode node) { 
  if (node!= null) { 
  postOrderTraversal(node.left); 
  postOrderTraversal(node.right); 
  visit(node); 
  } 
} 

