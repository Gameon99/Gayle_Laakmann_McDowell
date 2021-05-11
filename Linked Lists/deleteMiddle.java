public static LinkedList deleteMiddle(LinkedList list){
        Node s1 = list.head;
        Node s2 = list.head;
        Node previous = null;

        while(s1 != null && s1.next != null){
            s1 = s1.next.next;
            previous = s2;
            s2 = s2.next;
        }
        previous.next = s2.next;
        return list;
    }
