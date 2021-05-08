//given isSubstring function
import java.util.*;
import java.io.*;
public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    sb.append(s2);
    sb.append(s2);
    if(s1.length == s2.length && s1.length > 0){
      return isSubstring(sb, s1);
    }
  }
}
