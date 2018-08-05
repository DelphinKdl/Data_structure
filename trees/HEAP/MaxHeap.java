public class MaxHeap {
    private static int size ; 
    private int maxHeap [] ;
    private int  capacity;
    // Constructor is used 
    MaxHeap(int capacity){
        size = 1 ;
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
    private void swap(int x, int y){
        
    }
    private void bubbleUp(int index, int val){
         while (index != 1){
                if (this.maxHeap[index] > this.maxHeap[(index)/2]){
                    int temp = this.maxHeap[index];
                    this.maxHeap[index] = this.maxHeap[(index)/2];
                    this.maxHeap[(index)/2] = temp;
                    this.size++; 
                
             }
             index/=2;
         }
    } 
    public void add(int val){
        // Add at the end
        // Check paranets, if greater than the parent, swap.

        if (this.size == 1){
            maxHeap[1] = val ;
            this.size++;
            return; // 
        }
        if (size == this.capacity-1){
            doubleArray();
        }
        int index = this.size;
        this.maxHeap[index] = val ;
        // After inserting, we need to check if it is in the proper position.
        bubbleUp(index, val);
    }
    public void remove(){

    }
    public int getMin(){
        return this.maxHeap[1];
    }
    public void print(){
        for (int i= 1 ; i<this.size-1 ; i++)
        System.out.println(maxHeap[i]);
    }
    public static void main(String [] args){
        MaxHeap heap = new MaxHeap(6);
        heap.add(73);
        heap.add(74);
        heap.add(81);
        heap.add(79);
        heap.add(90);
        heap.add(93);
        // heap.add(94);
       heap.print();
    }
}