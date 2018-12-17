class Hashtable2{
 private static final int SIZE = 97;
 private Pair[] map = null;

 public Hashtable2(){
  this(SIZE);
 }

 public Hashtable2(int N){
  map = new Pair[N];
  for(int i =0; i < N ; i++){
   map[i]=null;
  }
 }

 public void put(int key, int value) throws HashtableException {
  int hash = key % SIZE;
  int count = 0;
  while(map[hash] != null && map[hash].getKey() != key){ 
   hash = (hash + 1) % SIZE;
   if(count == SIZE)
    throw new HashtableException("Table full");
   count++;
  }
  map[hash]= new Pair(key,value);
 }

 public int get(int key) throws HashtableException{
  int hash = key % SIZE;
  int count = 0;

  while(map[hash] != null && map[hash].getKey() != key){
   hash = (hash+1) % SIZE;
   if(count == SIZE)
    throw new HashtableException("No matching key in the table");
   count++;
  }
  if(map[hash] == null)
   throw new HashtableException("No matching key in the table");

  return map[hash].getValue();

 }

}


class Pair{

 private int key;
 private int value;

 public Pair(int key, int value){
  this.key = key;
  this.value = value;
 }

 public int getKey(){
  return key;
 }

 public int getValue(){
  return value;
 }

}

class HashtableException extends RuntimeException{
 public HashtableException(String message){
  super(message);
 }
}