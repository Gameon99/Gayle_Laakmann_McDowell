//O(length + character seq^2) - String concatenation operates in O(n^2) TC. Hence it is better to use String Builder.
package GayleLaakmann;
import java.util.*;

public class stringCompression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        int count = 0;
        for(int i = 0;i < length;i++){
            count++;
            if(i+1 >= length || s.charAt(i) != s.charAt(i+1)){
                sb.append(s.charAt(i));
                sb.append(count);
                count = 0;
            }
        }
        System.out.println(sb);
    }
}
