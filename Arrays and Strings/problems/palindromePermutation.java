//Solution - check
import java.util.*;
import java.io.*;
public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextInt();
    int count = 0;
    int[] values = new int[128];
    char[] characters = s.toCharArray();
    for(char c : characters){
      values[c]++;
    }
    for(int i = 0; i < 128; i++){
      if(values[i] % 2 = 0){
        i++;
      }else if{
        count++;
      }
    }
    if(count == 1||count == 0){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
//hashtable solution - O(N) TC
