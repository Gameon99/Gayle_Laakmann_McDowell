//O(n^2) solution
import java.util.*;
import java.io.*;
public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int check = 0;
    String s = sc.nextLine();
    for(int i = 0; i < s.length();i++){
      for(int j = 1;j < s.length();j++){
        if(s.charAt(j) == s.charAt(i){
          check = 1;
        }
      }
    }
    if(check == 1){
      System.out.println("string has duplicate");
    }else{
      System.out.println("String has no duplicate");
    }
  }
}

//O(1) solution
import java.util.*;
import java.io.*;
public class Solution{
  boolean isUnique(String s){
    if s.length > 128{
      return false;
    }
    boolean[] value = new boolean[128];
    for(int i = 0; i < 128; i++){
      int val = s.charAt(i);
      if(value[val]){
        return false;
      }
      value[val] = true;
    }
    return true;
  }
//if modification of input string is allowed - sort and linear check - O(nlogn)
