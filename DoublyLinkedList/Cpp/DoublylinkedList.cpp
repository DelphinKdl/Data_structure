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
Node * Insert_at_nth (Node * head, int data ,int index) {
    // TODO 
    // insert in the beg
    Node * newNode = new Node(); 
    newNode-> data  = data ; 
    newNode->next = NULL ; 
    newNode->prev = NULL ; 

    if (index == 1){
        if (head == NULL) {
            head= newNode ; 
            return head ; 
        }
        newNode->next = head ;
        head->prev = newNode; 
        head= newNode ; 
        return head ; 
    }
    Node * temp = head ; 
    for (int i = 0 ; i<index-1; i++) {
         
        temp = temp->next ;
    }
    // Node * temp2 = temp->next ; 
    // Node * prev = temp->prev; 




    return head ; 
}

Node * remove_at_nth(Node * head, int index) {
    //TODO
    return head ; 
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
head = Insert_at_nth(head,101,1);
head = Insert_at_nth(head,2001,1);
head = Insert_at_nth(head,2001,4);
// printForward(head);
// printBackwards(head);
 }