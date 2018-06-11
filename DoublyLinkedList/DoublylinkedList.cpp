// Doubly linked list is the same as the singly, except, we add a nother var to our node. 

#include <iostream>
using namespace std ;
struct Node {
    int data; 
    Node *next ; 
    Node * prev ; 

};
void printBackwards (Node * head){
    Node * temp = head ; 
    while (temp->next != NULL) {
        temp = temp->next; 
    }
    Node *n = temp ; 
    while (n != NULL) {
        cout<<n->data<<" ";
        n = n->prev; 
    }
    cout<<endl;
}
void printForward(Node * head) {
    Node * temp = head ; 
    while(temp != NULL) {
        cout<<temp->data<<" ";
        temp = temp->next; 
    }
    cout<<endl;
}
Node * Insert_at_nth (Node * head, int index) {
    // TODO 
    return head ; 
}

Node * remove_at_nth(Node * head, int index) {
    //TODO
}

Node * insert(Node * head, int data){
    Node * newNode = new Node();
    newNode->data = data; 
    newNode->next = NULL ; 
    newNode->prev = NULL ; 

    if (head == NULL) {
        head = newNode;
        return head; // this is not  a good code. 
    } 
        Node * temp = head; 
        while (temp->next != NULL) {
            temp = temp->next ; 
        }
        temp->next = newNode ; 
        newNode->prev = temp ; 

    return head;
}
int main() {

Node * head = NULL ; 
head = insert(head, 10);
head = insert(head, 12);
head = insert(head, 13);
printForward(head);
printBackwards(head);
 }