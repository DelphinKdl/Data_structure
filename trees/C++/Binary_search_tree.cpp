// You need to use  the class syntax for binary search tree.


#include <iostream>

using namespace std ;
struct Node {
    int data;
    Node * left ;
    Node * right;
};
// note, whenever we worl on trees, recerusion will be the choice
Node * createNode (int data){
    Node * root = new Node();
    root->data = data;
    root->left = NULL ;
    root->right = NULL ;
    return root;
}
Node * insert(int data, Node * root) {
    if (root == NULL){
        root = createNode(data);
    } else if (data <= root->data){
        root->left = insert(data, root->left);
    } else {
        root->right = insert(data, root->right);
    }
    return root;
}
void print(Node * root) {
    if (root == NULL) {
        return ;
    }
      cout<<root->data<<endl;
    print(root->left);
  
}

int FindMin(Node * root){
//    if (root == NULL){
//        return root->data;
//    }
//   return  FindMin(root->left);
    
    // Iterative solution
    
    Node * current = root ;
    while (current->left != NULL){
        current = current->left ;
    }
    
    return current->data;
}
int main () {
    Node * root = NULL ;
    root = insert(15, root);
    root = insert(10, root);
    root = insert(20, root);
    root = insert(0, root);
    root = insert(25, root);
   int x =  FindMin(root);
    cout<<"Samalest number is "<<x<<endl;
    
}
