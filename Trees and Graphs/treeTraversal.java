package Trees;

public class BinaryTree {
    public static class Node{
        int key;
        Node left,right;
        Node(int item){
            key = item;
            left = right = null;
        }
    }
    public static class Tree{
        Node root;
        Tree(int key){
            root = new Node(key);
        }
        Tree(){
            root = null;
        }
    }
    public static void main(String[] args){
        Tree t = new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        printPreOrder(t.root);
        System.out.println();
        printInOrder(t.root);
        System.out.println();
        printPostOrder(t.root);
    }
    public static Node printPreOrder(Node node){
        if(node == null){
            return null;
        }
        System.out.print(node.key+" ");
        printPreOrder(node.left);
        printPreOrder(node.right);
        return node;
    }
    public static Node printInOrder(Node node){
        if(node == null){
            return null;
        }
        printInOrder(node.left);
        System.out.print(node.key+" ");
        printInOrder(node.right);
        return node;
    }
    public static Node printPostOrder(Node node){
        if(node == null){
            return null;
        }
        printInOrder(node.right);
        System.out.print(node.key+" ");
        printInOrder(node.left);
        return node;
    }
}
