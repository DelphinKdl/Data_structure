import java.util.LinkedList;
public class HashTables {
  LinkedList [] names ;
  int size = 0 ;

  HashTables(int size) {
    this.size = size ;
    this.names = new LinkedList[size];
    LinkedList coll = new LinkedList();
  }
  int hashFunction (String name) {
    int str_size = name.length();
    int sum = 0 ;
    for (int i = 0 ; i<str_size ; i++) {
      sum+=name.charAt(i);
    }
    sum = sum % str_size;

    return sum ;
  }
  void put (String name) {
    int index = hashFunction(name);
    this.names[index] = name;
  }
  String get(String name) {
    return null ;
  }
  void print() {
    for (int i = 0 ; i<this.size ; i++)
    System.out.println(this.names[i]);
  }
  public static void main (String [] args) {
    HashTables hashtables = new HashTables(20);
    hashtables.put("Aziz");
    hashtables.put("Marry");
    hashtables.put("Abdul");
    hashtables.put("Sarah");
    hashtables.put("Mike");
    hashtables.print();

  }
}
