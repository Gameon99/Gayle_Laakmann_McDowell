public static int kthtolast(Node node, int k){

        if(node == null){
            return 0;
        }
        int index = kthtolast(node.next, k) + 1;
        if(index == k){
            System.out.println(node.data);
        }
        return index;
    }
