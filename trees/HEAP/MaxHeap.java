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
    private void swap(int x, int y){
        
    }
    private void bubbleUp(int index, int val){
         // Store the value in the heap. 

         while (index > 0){
             if (index%2 == 0){
                 if (this.maxHeap[index] > this.maxHeap[(index-1)/2]){
                     int temp = this.maxHeap[index];
                     this.maxHeap[index] = this.maxHeap[(index-1)/2];
                     this.maxHeap[(index-1)/2]  = temp;
                     this.size++; 
                 }
             } else if (index%2 != 0){
                if (this.maxHeap[index]> this.maxHeap[(index)/2]){
                    int temp = this.maxHeap[index];
                    this.maxHeap[index] = this.maxHeap[(index)/2];
                    this.maxHeap[(index)/2] = temp;
                    this.size++; 
                }
             }
             index/=2;
         }
    } 
    public void add(int val){
        // Add at the end
        // Check paranets, if greater than the parent, swap.

        if (this.size == 0){
            maxHeap[0] = val ;
            this.size++;
            return; // 
        }
        if (size == this.capacity){
            doubleArray();
        }
        int index = this.size;
        this.maxHeap[index] = val ;
        // After inserting, we need to check if it is in the proper position.
        bubbleUp(index, val);
    }
    public void remove(){

    }
    private void swapme(int x, int y){
        int temp = x ; 
        x = y ; 
        y = temp ;
    }
    public int getMin(){
        return this.maxHeap[0];
    }
    public void print(){
        for (int i= 0 ; i<this.size ; i++)
        System.out.println(maxHeap[i]);
    }
    public static void main(String [] args){
        MaxHeap heap = new MaxHeap(10);
        // 93, 90, 81, 79, 74, 73
        heap.add(73);
        heap.add(74);
        heap.add(81);
        heap.add(79);
        heap.add(90);
        heap.add(93);
        heap.print();
       
    }
}