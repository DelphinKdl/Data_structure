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
    public void add(int val){
        if (size == 0){
            maxHeap[0] = val ;
            this.size++;
        }
        if (size == capacity){
            doubleArray();
        }

    }
    public void remove(){

    }

    public void removeMin(){

    }
    public void getMin(){
        
    }
    public static void main(String [] args){

    }
}