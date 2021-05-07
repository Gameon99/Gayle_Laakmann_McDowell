//we will have to triple the space count
import java.util.*;
import java.io.*;
public class Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char[] characters = s.toCharArray();
    int trueLength = sc.nextInt();
    int spacecount = 0, index, i = 0;
    for(int i = 0;i < truelength;i++){
      if(characters[i] == ' '){
        spacecount++;
      }
    }
    index = truelength + spacecount * 2;
    for(int i = truelength - 1; i >= 0; i--){
      if(characters[index] = ' '){
        characters[index - 1] = '0';
        characters[index - 2] = '2';
        characters[index - 3] = '%';
        index = index - 3;
      }else{
        characters[index - 1] = characters[i];
        index--;
      }
    }
  }
}
       
