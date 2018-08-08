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
        int [] temp = new int [capacity+1];
        
        for (int i = 1 ; i<capacity-1 ; i++){
            temp[i] = maxHeap[i];
        }
        maxHeap = new int [capacity*2];

        for (int i = 1 ; i<capacity-1 ; i++){
            maxHeap[i] = temp[i];
        }
        
    }

    private void bubbleUp(int index){
         while (index != 1){
                if (this.maxHeap[index] > this.maxHeap[(index)/2]){
                    int temp = this.maxHeap[index/2];
                    this.maxHeap[index/2] = this.maxHeap[(index)];
                    this.maxHeap[index] = temp;
             } else {
                 return;
             }
             index/=2;
         }
    } 
    public void add(int val){
        // Add at the end
        // Check paranets, if greater than the parent, swap.

        if (this.size == 1){
            this.maxHeap[1] = val ;
            this.size++;
            return; 
        }
        if (size == this.capacity-1){
            doubleArray();
        }
        int index = this.size;
        this.size++; 
        this.maxHeap[index] = val ;
        // After inserting, we need to check if it is in the proper position.
        bubbleUp(index);
    }
    public void remove(int index){
        if (index == 0){
            System.out.println("Not allowed");
            return; 
        }
        if (index  == this.size-1){
            this.size--;
            return;
        }
        int temp = this.maxHeap[this.size-1];
        this.maxHeap[this.size-1] = this.maxHeap[index];
        this.maxHeap[index] = temp ; 
        this.size--;

        // I am at the last level.
        while ((index * 2) < (this.size-1) ){
            if (this.maxHeap[index*2] > this.maxHeap[index*2+1] ){
                int temp2 = this.maxHeap[index] ; 
                this.maxHeap[index] = this.maxHeap[index*2];
                this.maxHeap[index*2] = temp2 ;
                index=index*2;
            } else {
                int temp2 = this.maxHeap[index] ; 
                this.maxHeap[index] = this.maxHeap[index*2+1];
                this.maxHeap[index*2+1] = temp2 ;
         
                index=index*2+1;
            }
        }

    }
    public int getMin(){
        return this.maxHeap[1];
    }
    public static void main(String [] args){
        MaxHeap heap = new MaxHeap(6);
        heap.add(1);
        heap.add(5);
        heap.add(7);
        heap.add(3);
        heap.add(4);
        heap.add(9);
        heap.add(2);
        heap.add(1);
        heap.add(10);
        // System.out.println("SIZE "+(heap.size-1));
        // heap.remove(2);
        // 8, 5, 6, 3,4, 1, 2,1
            for (int i = 1 ; i<heap.size; i++){
            System.out.println(": "+heap.maxHeap[i]);
        }

        // System.out.println("Last Eleement: "+(heap.size- 1));
        // heap.add(94);
    //    heap.print();
    }
}