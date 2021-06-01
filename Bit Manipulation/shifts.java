There are two types of right shift operators. 
The arithmetic right shift essentially divides by two.
The logical right shift does what we would visually see as shifting the bits. This is best seen on a negative number. 
 
Arithmetic Shift :
int repeatedArithmeticShift(int n, int count){
  for(int i = 0;i < count;i++){
    n >>= 1;
  }
  return n;
}

Logical Shift : 
int repeatedLogicalShift(int n, int count){
  for(int i = 0;i < count;i++){
    n >>>= 1;
  }
  return n;
}
