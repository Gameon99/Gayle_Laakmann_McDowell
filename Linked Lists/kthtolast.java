//recursive solution
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
//iterative solution
public static int kthtolast(Node node, int k){
        Node s1 = node;
        Node s2 = node;

        for(int i = 0;i < k;i++){
            s1 = s1.next;
        }
        while(s1 != null){
            s1 = s1.next;
            s2 = s2.next;
        }
        return s2.data;
    }
