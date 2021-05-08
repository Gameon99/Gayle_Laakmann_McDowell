//Solution - check - similar to solution2
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
package GayleLaakmann;
import java.util.*;
public class isPermutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] table = buildTable(s);
        int count = 0;
        for(int i : table){
            if(i % 2 == 1){
                count++;
            }
        }
        if(count > 1){
            System.out.println("Not possible");
        }else{
            System.out.println("Possible");
        }
    }
    public static int[] buildTable(String s){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for(char c : s.toCharArray()){
            int x = getCharNumber(c);
            if(x != -1){
                table[x]++;
            }
        }
        return table;
    }
    public static int getCharNumber(char c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue(c);
        if(value >= a && value <= z){
            return value - a;
        }
        return -1;
    }

}
//read bitvectors
    
