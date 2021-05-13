Stack -> LIFO
Java Collection framework provides a Stack class that models and implements a Stack data structure.
.pop();
.push(item);
.peek();
.isEmpty();
package GayleLaakmann;

import java.util.*;

public class stack{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(7);
        for (int i = 0;i < 5;i++){
            stack.push(i);
        }

        int x = stack.pop();
        int y = stack.peek();
        System.out.println(x);
        System.out.println(y);
        int search = stack.search(0);
        System.out.println(search);

    }
}
