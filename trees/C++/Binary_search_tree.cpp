// You need to use  the class syntax for binary search tree.


#include <iostream>
#include <queue>
using namespace std ;
struct Node {
    char data;
    Node * left ;
    Node * right;
};
Node* FindMin(Node* root)
{
	while(root->left != NULL) root = root->left;
	return root;
}

// Function to search a delete a value from tree.
struct Node* Delete(struct Node *root, int data) {
	if(root == NULL) return root;
	else if(data < root->data) root->left = Delete(root->left,data);
	else if (data > root->data) root->right = Delete(root->right,data);
	// Wohoo... I found you, Get ready to be deleted
	else {
		// Case 1:  No child
		if(root->left == NULL && root->right == NULL) {
			delete root;
			root = NULL;
		}
		//Case 2: One child
		else if(root->left == NULL) {
			struct Node *temp = root;
			root = root->right;
			delete temp;
		}
		else if(root->right == NULL) {
			struct Node *temp = root;
			root = root->left;
			delete temp;
		}
		// case 3: 2 children
		else {
			struct Node *temp = FindMin(root->right);
			root->data = temp->data;
			root->right = Delete(root->right,temp->data);
		}
	}
	return root;
}
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
void levelOrder (Node * root) {
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



void PreOrder(Node * root){
    if (root == NULL) return ;

    cout<<root->data<<" ";
    PreOrder(root->left);
    PreOrder(root->right);
}

void Inorder (Node * root){
    if (root == NULL) {
        return;
    }
    Inorder(root->left);
    cout<<root->data<<" ";
    Inorder(root->right);
    return;
}

void PostOrder (Node * root){
    if (root == NULL) {
        return;
    }
    PostOrder(root->left);
    PostOrder(root->right);
    cout<<root->data<<" ";
    return;
}

char FindMinRec(Node * root){
        if (root->left == NULL){
            return root->data;
        }
       return  FindMinRec(root->left);
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
bool isBinarySearchTree(Node * root) {
    // Basically , we need ot check if this tree holds for a BST properties.
    // They are, left is less than patent, and right is greater than parent.

    return false;
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
//    LevelOrder(root);
//
    cout<<"PreORder traversal"<<endl;
    PreOrder(root);

    cout<<"InORder traversal"<<endl;
    Inorder(root);


    cout<<"Post ORder traversal"<<endl;
    PostOrder(root);


}
