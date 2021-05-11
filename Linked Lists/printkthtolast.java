//Solution
public static void printkthtolast(LinkedList list, int k){
        Node n = list.head;
        int count = 0;
        while(count != k){
            n = n.next;
            count++;
        }
        if(count == k) {
            while (n != null) {
                System.out.print(n.data);
                n = n.next;
            }

        }
    }
