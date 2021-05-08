//solution - check
package GayleLaakmann;
import java.util.*;
public class oneAway {
    public static void main(String[] args){

        String a = "hale";
        String b = "phale";
        if(a == b){
            System.out.println("true");
        }

        int alength = a.length();
        int blength = b.length();
        int maxlength = Math.max(alength,blength);

        int j = 0;
        int count = 0;
        for(int i = 0;i < maxlength-1;i++){
            if(a.charAt(i) != b.charAt(j)) {
                if (a.charAt(i + 1) == b.charAt(j)) {
                    j--;
                } else if (a.charAt(i) == b.charAt(j + 1)) {
                    i--;
                }
                count++;
            }

            j++;
        }
        if(count <= 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
//almost similar solution on Gayle Laakmann
