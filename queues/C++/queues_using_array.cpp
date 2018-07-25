// Array implementation for queues.

#include <iostream>
using namespace std ; 
int QUEUE [30];
int front = -1 ; // responsible for Dequeuing 
int rear = -1; // Responsible for Dequeuing. Enqueuing

bool isEmpty() {
    if (front == -1 && rear == -1) {
        return true ; 
    } else
    return false; 
}

void enqueue(int x) {
    front++; 
    rear++;
    QUEUE[++rear] = x ; 
    return ; 

}
void dequeue() {
     if (front == -1 && rear == -1) {

         bool test = isEmpty();
         if (test) {
             cout<<"QUEUE is empty"<<endl;
         } else {
             front--;
         }
     }
}

int main () {
    enqueue(12);
    dequeue();
    cout<<isEmpty()<<endl;
   

}
