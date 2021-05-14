package GayleLaakmann;

public class sumList {
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
        sumList list1 = new sumList();
        sumList list2 = new sumList();

        list1 = insert(list1, 2);
        list1 = insert(list1, 4);
        list1 = insert(list1, 3);

        list2 = insert(list2, 5);
        list2 = insert(list2, 6);
        list2 = insert(list2, 6);

        int carry = 0;

        printList(sum(list1,list2));
    }
    public static sumList insert(sumList list, int k){
        Node new_node = new Node(k);
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

//    public static sumList reverse(sumList list){
//        Node node = list.head;
//        sumList reverselist = new sumList();
//        while(node != null){
//            insert(reverselist,node.data);
//        }
//
//        Node previous = reverselist.head;
//        Node current = previous.next;
//        while(current != null){
//            Node next = current.next;
//            current.next = previous;
//            previous = current;
//            current = next;
//        }
//        reverselist.head = previous;
//        return reverselist;
//    }
    public static void printList(sumList list){
        Node n = list.head;
        while(n != null){
            System.out.print(n.data);
            n = n.next;
        }
    }
    public static sumList sum(sumList list1, sumList list2){
        sumList result = new sumList();

        Node node1 = list1.head;
        Node node2 = list2.head;

        int carry = 0;
        int value;
        while(node1 != null && node2 != null){
            value = node1.data + node2.data + carry;
            if(value >= 10){
                value = value % 10;
                carry = 1;
                insert(result, value);
            }else{
                insert(result,value);
                carry = 0;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        if(carry == 1){
            insert(result,1);
        }
        return result;
    }
}

