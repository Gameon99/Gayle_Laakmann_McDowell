//Using clone and reverse
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
        list = insert(list,6);
        list = insert(list,3);
        list = insert(list,6);
        list = insert(list,1);
        System.out.println(palindromell(list));
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
    public static void printList(LinkedList list){
        Node n = list.head;
        while(n != null){
            System.out.print(n.data);
            n = n.next;
        }
    }
    public static boolean palindromell(LinkedList list) {

        LinkedList newlist = new LinkedList();
        Node node = list.head;
        
        StringBuilder sb = new StringBuilder();
        while(node != null) {
            insert(newlist,node.data);
            
            node = node.next;
        }

        Node previous = null;
        Node current = newlist.head;
        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        newlist.head = previous;

        Node next1 = list.head;
        Node next2 = newlist.head;
        int count = 0;
        while(next1 != null && next2 != null){
            if(next1.data == next2.data){
                next1 = next1.next;
                next2 = next2.next;
            }else{
                count = 1;
                break;
            }
        }
        System.out.println(list);
        System.out.println(newlist);
        if(count == 0){
            return true;
        }else{
            return false;
        }
        
    }
}
//Using stack - store first half of elements on to stack, pop and check remaining ll
package GayleLaakmann;

import java.util.Stack;

public class permutationllstack {
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

        Stack<Integer> stack = new Stack<>();

        permutationllstack list1 = new permutationllstack();
        list1.insert(list1,1);
        list1.insert(list1,4);
        list1.insert(list1,3);
        list1.insert(list1,2);
        list1.insert(list1,1);

        Node fast = list1.head;
        Node slow = list1.head;

        while(fast != null && fast.next != null){
            stack.push(slow.data);
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null){
            slow = slow.next;
        }

        int count = 0;
        while(slow != null){
            int top = stack.pop().intValue();
            if(top != slow.data){
                count = 1;
                break;
            }
            slow = slow.next;
        }
        if(count == 1){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
    public static permutationllstack insert(permutationllstack list, int d){
        Node newnode = new Node(d);
        newnode.next = null;
        if(list.head == null){
            list.head = newnode;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newnode;
        }
        return list;
    }
}
