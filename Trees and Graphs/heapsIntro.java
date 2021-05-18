1.Min Heaps{
  Complete binary tree
  Each node is smaller than its children
  Min element - Root
  Operations - insert, extract_min{
    insert - always at the bottom and rightmost, compare with parent and swap - O(logn)
    extract_min - return head, put last element of heap as head, swap down until min heap prop satisfies - O(logn)
  }
2.Max heap
  Same as above but reverse
  Each node is greater than it's children
  
