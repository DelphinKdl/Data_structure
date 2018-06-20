// You need to use  the class syntax for binary search tree.


#include <iostream>
#include <queue>
using namespace std ;
struct Node {
    char data;
    Node * left ;
    Node * right;
};
// note, whenever we worl on trees, recerusion will be the choice
Node * createNode (char data){
    Node * root = new Node();
    root->data = data;
    root->left = NULL ;
    root->right = NULL ;
    return root;
}
Node * insert(char data, Node * root) {
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
void LevelOrder (Node * root) {
    if (root == NULL) return ;
    queue<Node*> Q;
    Q.push(root); // First is root.
    while(!Q.empty()){
        Node * current = Q.front();
        cout<<current->data<<endl;
        if (current->left != NULL) Q.push(current->left);
        if (current->right != NULL) Q.push(current->right);
        Q.pop();
    }
}

char FindMinIter(Node * root){
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

char FindMinRec(Node * root){
        if (root->left == NULL){
            return root->data;
        }
       return  FindMinRec(root->left);
}

int main () {
    Node * root = NULL ;
    root = insert('F', root);
    root = insert('D', root);
    root = insert('B', root);
    root = insert('A', root);
    root = insert('C', root);
     root = insert('E', root);
     root = insert('J', root);
     root = insert('G', root);
     root = insert('K', root);
     root = insert('I', root);
    root = insert('H', root);
   char x =  FindMinIter(root);
   char y =  FindMinRec(root);
    cout<<"Samalest number is "<<x<<endl;
    cout<<"Samallest number recuresuivly is "<<y<<endl;
    LevelOrder(root);
    
}
