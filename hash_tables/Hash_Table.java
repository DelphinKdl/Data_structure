import java.util.LinkedList;
public class Hash_Table{
  // Linked list

  private LinkedList buckets [] ;
  private int size ;

  Hash_Table(int bucketSize){
    buckets = new LinkedList[bucketSize];
    size = 0 ;
  }
  public int hashFunction(String val){
    int sum = 0 ;
    for (int i   = 0 ;i<val.length() ; i++) {
      sum+=val.charAt(i);
    }
    return sum % val.length();
  }

  public  void store(String s){
    int index = hashFunction(s);
    if (this.buckets[index] == null){
      this.buckets[index] = new LinkedList();
      this.buckets[index].add(s);
    } else {
      // int bucketSize = this.buckets[index].size();
      this.buckets[index].add(s);

    }
    return;
  }
  public int isKeyExisit(String s){
    int index = hashFunction(s);
    if (this.buckets[index] == null){
      System.out.println("Does not Exists");
      return -1;
    } else {
      System.out.println("It Exists ");
      return index;
    }
  }

  public static void main (String[] args){
    Hash_Table table = new Hash_Table(6);
    // LinkedList []x = new LinkedList[3];
    // x[0] = new LinkedList();
    // x[0].add("A");
    // // x[0].add("B");
    // System.out.println(x[0].get(0));
    // table.store("Aziz");
        table.store("Aziz");
          table.store("MoeMoeMoe");
        table.store("Moe");
        table.store("iZ");
        int in = table.isKeyExisit("iZs");
      System.out.println("INDEX: "+in);
      // table.store("Azi");
      // table.store("Loaui");
      // table.store("Moe");
      // table.store("Abdul");
      // table.search("Azz"); // 2

  }
}
