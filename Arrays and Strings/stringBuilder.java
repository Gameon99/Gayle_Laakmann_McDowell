//The StringBuilder in Java represents a mutable sequence of characters.
String joinWords(String[] words){
  StringBuilder sb = new StringBuilder();
  for(String word : words){
    sb.append(word);
  }
  return sb.toString();
}
