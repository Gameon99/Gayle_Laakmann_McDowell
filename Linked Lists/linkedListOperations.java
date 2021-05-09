package GayleLaakmann;


public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = delete(list,1);
        printList(list);
    }
    public static LinkedList insert(LinkedList list, int d){
        Node new_node = new Node(d);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static LinkedList delete(LinkedList list, int d){
        Node n = list.head;
        if(n.data == d){
            list.head = n.next;
        }
        while(n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return list;
            }
            n = n.next;
        }
        return list;
    }
    public static void printList(LinkedList list){
        Node n = list.head;
        while(n != null){
            System.out.print(n.data);
            n = n.next;
        }
    }
}
    
