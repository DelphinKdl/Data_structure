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
    private void swap(int first, int second){
        
    }
    private void rightChildBublle(int index, int val){
        this.maxHeap[this.size] = val;
        while (index != 0){

            index = index/2;
            if (maxHeap[index] < val){
              
              int temp = maxHeap[this.size];
              maxHeap[this.size] = maxHeap[index];
              maxHeap[index] = temp ;

            }
        }
        this.size++;
    } 

    private void leftChildBublle(int index, int val){
        
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
        if (index%2 == 0) { 
            // this is even. Right child.
            //RightChildBubble
            rightChildBublle(index-1, val);
        } else {
            // LEft child bulbble.
            rightChildBublle(index, val);

        }
        
    }
    public void remove(){

    }

    public void removeMin(){

    }
    public void getMin(){
        
    }
    public void print(){
        for (int i= 0 ; i<this.size ; i++)
        System.out.println(maxHeap[i]);
    }
    public static void main(String [] args){
        MaxHeap heap = new MaxHeap(6);

        heap.add(18);
        heap.add(15);
        heap.add(10);
        heap.add(16);
        heap.add(17);

        heap.print();
    }
}