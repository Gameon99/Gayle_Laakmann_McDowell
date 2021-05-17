package GayleLaakmann;

import java.util.Stack;

public class QueueUsingStacks {
    public static class Queue{
        Stack<Integer> stack1;
        Stack<Integer> stack2;
    }

    public static void main(String[] args){
        Queue q = new Queue();
        q.stack1 = new Stack<>();
        q.stack2 = new Stack<>();
        enQueue(q,1);
        enQueue(q,2);
        enQueue(q,3);

        System.out.println(deQueue(q));
        System.out.println(deQueue(q));
        System.out.println(deQueue(q));

    }
    public static Queue enQueue(Queue q,int x){
        q.stack1.push(x);
        return q;
    }
    public static int deQueue(Queue q){
        if(q.stack2.isEmpty()){
            while(!q.stack1.isEmpty()){
                q.stack2.push(q.stack1.pop());
            }
        }
        int result = q.stack2.pop();
        return result;
    }

}
