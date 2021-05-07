Declaration: 

public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, Serializable
default load factor of 0.75 and an initial capacity is 11

Example : 
Hashtable<Integer, String> ht = new Hashtable<>();
Hashtable<Integer, String> ht1 = new Hashtable<>(4); - Initial capacity declared
Hashtable<Integer, String> ht1 = new Hashtable<>(4, 0.75f); - Size and fill ratio/load factor

Methods:
.put();                     - ht.put("vishal", 10);
.containsKey();             - if (ht.containsKey("vishal")) {
.get();                     -    Integer a = ht.get("vishal");
                                 System.out.println("value for key" + " \"vishal\" is:- " + a);}
.remove(4);                 -removes entry with key 4
traversal                   -for (Map.Entry<String, Integer> e : ht.entrySet())
                                System.out.println(e.getKey() + " " + e.getValue());
.clear()
.clone()
.toString()





