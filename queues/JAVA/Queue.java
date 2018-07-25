// Implementing a queue since it is tticky
public class Queue {
  private Node head ;
  private Node tail ;
  private int size ;
  public void enqueue(String add){
    Node newNode = new Node(add);
    if (head == null){
      this.head = newNode;
      this.tail = newNode;
      this.size++;
      return;
    }
    tail.next = newNode;
    tail = newNode;
    this.size++;
    return;
  }
  public void dequeue(){
    if (this.head == null || this.tail == null)
    return;
    Node temp = this.head.next ;
    this.head = temp;
    return;
  }
  public void printHead(){
    System.out.println(this.head.text);
  }

  public void printTail(){
    System.out.println(this.tail.text);
  }
  public static void main (String [] args){
    Queue queue = new Queue();
    queue.enqueue("A");
    queue.enqueue("B");

    queue.enqueue("C");
    queue.enqueue("D");

    queue.dequeue();
      queue.dequeue();

    queue.printHead();
  }
  private class Node {
    Node next;
    String text;
    public Node(String text){
      this.next = null ;
      this.text = text;
    }
  }
}
