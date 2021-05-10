public static LinkedList removeDup(LinkedList list){
        HashSet<Integer> set = new HashSet<>();
        Node n = list.head;
        Node previous = null;
        while(n != null){
            if(set.contains(n.data)){
                previous.next = n.next;
            }else{
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
        return list;
    }
    
    
