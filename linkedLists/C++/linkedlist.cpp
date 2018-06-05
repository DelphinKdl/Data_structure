#include <iostream>
using namespace std; 
struct Node {
    int data; 
    Node * next ; 
}; 

Node * insert_at_end(Node * head, int item) {
    Node *temp = new Node(); 
    
    temp->data = item ;
    temp->next = NULL ; 

    if (head == NULL) {
        temp->next = head ; 
        head = temp ;
        return head; 
    }
    Node * temp2 = head ; 

    while (temp2->next != NULL) {
        temp2 = temp2->next ; 
    }
    temp2->next = temp ;
    return head ; 
}
Node *add (Node * head, int item){
    Node * temp = new Node();
    temp->data = item ; 
    temp->next = NULL; // Whu NULL vs nullpte? 
    if (head == NULL) {
        head = temp ;
        return head;
    } else {
        // TODO: Insert items in the begninning of the lnkedlis
        temp->next = head ; 
        head = temp ;
    }
    return head;
}

Node * delete_node (Node *head, int index) {

    Node * temp = head ;
    if (head == NULL) {

        cout<<"List is empty"<<endl; 
        return head ;
    } 
    if (index == 0 ){
        head = temp->next ; 
        return head;
    }
    for (int i = 0 ;  i<index-2; i++ ) {
        temp = temp->next ; 
    }
    Node *temp2;

   temp2 = temp->next ; 
   temp->next = temp2->next ; 
   delete(temp2);


    return head ; 

}
void print(Node * head) {
    Node * temp = head; 
    while(temp != NULL) {
        cout<<temp->data<<endl;
        temp = temp->next ; 
    }

}
int main () {
    Node * head = NULL; 
    // head = add(head,10);
    // head = add(head,12);
    // head = add(head,14);
    // head = add(head,13);

    head = insert_at_end(head,10);
    head = insert_at_end(head,13);
    head = insert_at_end(head,15);
    head = insert_at_end(head,17);
    head = insert_at_end(head,18);
    head = insert_at_end(head,20);
    head = delete_node(head,0);
    print(head);

}