#include <iostream>
// ADT: pop, push, top, isEmpty

using namespace std ; 

int STACK [20]; 
int i = -1;
void pop(){
i--;

}
void push(int data) {
    i++; 
    STACK[i] = data;
}
bool isEmpty() {
    if ( i == -1){
        return true;
    } 
    return false ; 
}
int top() {
    bool temp = isEmpty();
    if (temp) {
        cout<<"STACK is EMPTY"<<endl;
        return -1;
    }
    return STACK[i];
}
int main () {
    push(10);
    pop();
    cout<<top()<<endl;
    cout<<isEmpty()<<endl;;
}