package GayleLaakmann;

public class findIntersection {
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
        findIntersection list1 = new findIntersection();
        findIntersection list2 = new findIntersection();
        list1 = insert(list1,3);
        list1 = insert(list1,1);
        list1 = insert(list1,5);
        list1 = insert(list1,9);
        list1 = insert(list1,8);
        list1 = insert(list1,2);
        list1 = insert(list1,1);

        list2 = insert(list2,4);
        list2 = insert(list2,6);
        list2 = insert(list2,7);
        list2 = insert(list2,2);
        list2 = insert(list2,1);

        System.out.println(intersection(list1,list2));
    }
    public static findIntersection insert(findIntersection list, int d){
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
    public static findIntersection reverse(findIntersection list){
        Node previous = list.head;
        Node current = previous.next;
        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        list.head = previous;
        return list;
    }
    public static int intersection(findIntersection list1, findIntersection list2){
        int length1 = 0;
        int length2 = 0;

        Node node1 = list1.head;
        Node node2 = list2.head;


        while(node1 != null){
            length1++;
            node1 = node1.next;
        }
        while(node2 != null){
            length2++;
            node2 = node2.next;
        }

        int dif = length1 - length2 + 2;


        list1 = reverse(list1);
        list2 = reverse(list2);

        findIntersection newlist1 = new findIntersection();

        Node node = list1.head;
        while(dif-- != 0 && node != null){
            insert(newlist1,node.data);
            node = node.next;
        }

        node1 = newlist1.head;
        node2 = list2.head;
        Node newnode = null;
        while(node1.data == node2.data && node1 != null && node2 != null && node1.next != null && node2.next != null){
            newnode = new Node(node1.data);
            node1 = node1.next;
            node2 = node2.next;
        }

        return newnode.data;
    }
}
