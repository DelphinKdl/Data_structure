public class LinkedList implements LinkedYarn {
	private int size ; 
	private Node head ; 
	public boolean isEmpty () {
    	return this.size == 0 ? true : false;
    }
    public int getSize () {
    	return  this.size;
    }
    public int getUniqueSize () {
    	// pretty tough
    	return 0;
    }
    public void insert (String toAdd) {
    	this.size++;
    	Node newNode = new Node(toAdd);
    	if (this.head == null) {
    		this.head = newNode;
    		return;
    	}
    	Node temp = this.head;
    	while(temp.next != null)
    		temp = temp.next;
    	temp.next = newNode;
    }
    public int remove (String toRemove) {
    	Node temp = this.head;
    	if (this.head.text.equals(toRemove)) {
    		this.head = temp.next;
    		this.size--;
    		return 0;
    	}
    	while (temp.next != null) {
    		if((temp.next).text.equals(toRemove)) {

    			Node remove = temp.next;

    			Node connect = remove.next;
    			temp.next = connect;
    			this.size--;
    			return 0;
    		}
    		temp = temp.next;
    		
    	}
    	return 0;
    } 
     Node deleteNode( int position) {
    	
        if (position==0){
        	Node temp = this.head.next;
            head = temp;
            return head;
        }
        Node temp = this.head;
        
        for (int i = 0 ;i<position-1; i++) {
        	temp = temp.next;
        }
        Node deleteME = temp.next;
        temp.next = deleteME.next ; 
        deleteME = null;
        return head;
    }
    public void insertRec (Node head, String data){
        if (head == null){
            head = new Node(data);
            return;
        }
    }
    public int count (String toCount) {
    	int size = 0 ; 
    	Node temp = this.head;
    	while (temp != null) {
    		if (temp.text.equals(toCount))
    			size = size + 1;
    		temp = temp.next; 
    	}
    	return size;
    }

    public void removeAll (String toNuke) {
    	Node temp = this.head ;
    	while (temp.next != null) {
    		if ((temp.next).text.equals(toNuke)) {
    			System.out.println(temp.next.text);
    			remove((temp.next).text);
    		}
    		temp = temp.next;
    	}
    	
	}
	public Node reverseList(Node head){
		Node temp = head;
		Node prev = null ; 
		Node next ;
		while(temp != null){
			next = temp.next;
			temp.next = prev ;
			prev = temp;

			temp = next; 
		}
		head = prev; // Head move is done at the end. 
		return head;

	}
	public Node removeNthFromEnd(Node head, int n){
		head = reverseList(head);

		Node temp = head; 
		if (n ==1){
			head = temp.next;
			temp = null ;
			return head;
		}
		for (int i = 1 ; i<n-1; i++){
			temp = temp.next; 
		}
		Node next = temp.next ; 
		temp.next = next.next;
		next = null;
		head = reverseList(head);
		return head;
	}
	public void reverseRecursvily(Node p){
		if (p.next == null){
			this.head = p ; // head points to the last node.
			return; 
		}
		reverseRecursvily(p.next);
		Node temp = p ; 


	}
   public  boolean contains (String toCheck) {
	   Node temp = this.head;
	   while (temp != null) {
		   if (temp.text.equals(toCheck))
			   return true;
		   temp = temp.next;
	   }
    	return false;
    }
   public String getMostCommon () {
    	return null;
    }
    public void swap (LinkedList other) {
    	// Refacotor.
    }
    public void print() {
    	Node temp = this.head ; 
    	while(temp != null) {
    		System.out.println(temp.text);
    		temp = temp.next ;
    	}
	}
	public void printMe(Node head){
		Node temp = head ; 
    	while(temp != null) {
    		System.out.println(temp.text);
    		temp = temp.next ;
    	}
	}
public static void main (String[] args) {
	// The main method is only for testing.
	LinkedList list = new LinkedList();
	list.insert("Aziz"); // edge case for removing.
	list.insert("FACE");
	list.insert("Moe");
	list.insert("BOOK");
	// list.head = list.reverseList(list.head);
	// list.head = list.removeNthFromEnd(list.head, 1);
	// list.reverseRecursvily(head);
	// list.print();
}
private class Node{
	private String text;
	private Node next;
	
	Node(String data){
		this.text = data; 
		this.next = null;
	}
}
}