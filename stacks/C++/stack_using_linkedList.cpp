#include <iostream> 


// This is the implementation of stack using linkned list. 
using namespace std ; 

struct Node {
    int data; 
    Node * next ;

};

Node * push (Node* head, int data){
    Node * newNode = new Node();
    newNode->data = data ; 
    newNode->next = NULL ;


    newNode->next = head ; 
    head = newNode ; 
    return head ; 
}
void print(Node * head) {
    Node * temp = head; 
    while(temp != NULL) {
        cout<<temp->data<<endl;
        temp = temp->next ; 
    }

}
Node * pop (Node * head) {
    if (head == NULL) {
        cout<<"Stack is empty"<<endl;
        return NULL;
    }
    Node * temp = head ; 
    Node * newTemp = temp->next ; 
    head = newTemp;
    delete(temp);
    return head; 

}
int main () {
Node * head = NULL ; 
head = push(head, 12);
head = push(head, 1);
head = push(head, 14);

head = push(head, 15465);
head= pop(head);


print(head);
}