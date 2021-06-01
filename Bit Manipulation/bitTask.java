Get Bit : 

boolean getBit(int n, int i){
  return (n & (1 << i) != 0);
}

Set Bit : 
int setBit(int n, int i){
  return (n | (1 << i));
}

Clear Bit :
int clearBit(int n, int i){
  return (n & ~(1 << i));
