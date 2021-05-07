//sorting strings and equating
import java.util.*;
import java.io.*;
public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextInt();
    String b = sc.nextInt();
    if(a.length != b.length){
      System.out.println("false");
    }else{
      a.toCharArray();
      Arrays.sort(a);
      b.toCharArray();
      Arrays.sort(b);
      System.out.println(Arrays.equals(a,b));
    }
  }
}
//count number of occurences of each character in each string
import java.util.*;
import java.io.*;
public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextInt();
    String b = sc.nextInt();
    if(a.length != b.length){
      System.out.println("false");
    }else{
      int[] letters = new int[128];
      char[] characters = a.toCharArray();
      for(char c : characters){
        letters[c]++;
      }
      for(int i = 0;i < b.length;i++){
        int c = (int)b.charAt(i);
        letters[c]--;
        if(letters[c] < 0) return false;
      }
      return true;
    }
  }
