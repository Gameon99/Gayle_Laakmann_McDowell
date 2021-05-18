package GayleLaakmann;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args){
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(2);
        stack1.push(3);
        stack1.push(1);
        stack1.push(4);
        stack1.push(5);

        Stack<Integer> stack = sort(stack1);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
    public static Stack sort(Stack stack1){
        Stack<Integer> stack = new Stack<>();
        while(!stack1.isEmpty()){
            int temp = (Integer)stack1.pop();
            while(!stack.isEmpty() && stack.peek() > temp){
                stack1.push(stack.pop());
            }
            stack.push(temp);
        }
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        return stack1;
    }
}
