#include <iostream>
using namespace std ; 
struct Node {
    int data; 
    Node * next ; 
};
Node * add(Node *head, int data) {

    Node * temp  = new Node();

    temp->data = data;
    temp->next = nullptr;
    head = temp;
    return head;
}
int main () {

Node * head = NULL;

head = add(head,12);

cout<<head->data<<endl;


}