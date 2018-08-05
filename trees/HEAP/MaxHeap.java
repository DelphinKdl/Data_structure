public class MaxHeap {
    private static int size ; 
    private int maxHeap [] ;
    private int  capacity;
    // Constructor is used 
    MaxHeap(int capacity){
        size = 0 ;
        this.capacity = capacity;
        this.maxHeap = new int[capacity];
    }
    private void doubleArray(){
        int [] temp = new int [capacity];
        
        for (int i = 0 ; i<capacity ; i++){
            temp[i] = maxHeap[i];
        }
        maxHeap = new int [capacity*2];

        for (int i = 0 ; i<capacity ; i++){
            maxHeap[i] = temp[i];
        }
        
    }

    private void bubbleUp(int index, int val){
        this.maxHeap[this.size] = val ; // Store the value in the heap. 

        System.out.println(this.size);
        this.size++;
    } 
    public void add(int val){
        // Add at the end
        // Check paranets, if greater than the parent, swap.

        if (size == 0){
            maxHeap[0] = val ;
            this.size++;

            return;
        }
        if (size == capacity){
            doubleArray();
        }
        int index = this.size;
        // maxHeap[this.size++] = val;
    
            // this is even. Right child
            // LEft child bulbble.
           
            bubbleUp(index, val);
        
        
    }
    public void remove(){

    }

    public void getMin(){
        
    }
    public void print(){
        for (int i= 0 ; i<this.size ; i++)
        System.out.println(maxHeap[i]);
    }
    public static void main(String [] args){
        MaxHeap heap = new MaxHeap(6);
        // 93, 90, 81, 79, 74, 73
        heap.add(73);
        heap.add(74);
        heap.add(81);
        // heap.add(79);
        // heap.add(90);
        // heap.add(93);
        // heap.print();
       
    }
}