public class LinkedList {
    private Node head ;
    private static int size ; 
    public LinkedList(){
        this.head = null; 
    } 
    public int getSize(){
        return this.size;
    }
    public void add(int x){
        Node newNode = new Node(x);
        this.size++;
        if (this.head == null){
            this.head = newNode ;
            return ; 
        }
        Node temp = this.head ; 
        while (temp.next != null){
            temp = temp.next ;
        }
        temp.next = newNode;
        
    }
    public void print(){
        Node temp = this.head ; 
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next; 
        }
    }
    

    public void remove(int x){

    }
    
    public static void main (String[] args){
        LinkedList list = new LinkedList();
     
        list.add(12);
        // System.out.println(list.getSize());
        list.add(120);
        list.add(12120);
        // System.out.println(list.getSize());
        list.print();
        System.out.println(list.getSize());
    }
    boolean isEmpty (){
        if (this.head == null){
            return true;
        }
        else return false ;
    }

    // Provate class: Not visible to anyone. 
    private class Node{
        Node next; 
        int data ; 
        Node(int data) {
            this.data = data ; 
            this.next = null ;
        }
    }
}