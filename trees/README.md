# Tree data structure.

A tree is one of the non-linear data structure that we can use to store data in a computer.


## Types of trees in computer science.

1- Binary Tree.

2- Binary search tree.

3- AVL tree

4- Red-Black tree.

5- Splay tree

6- Tries

7- Ternary trees.

8- Heap Structure

and more


## Applications

There are many applications in different computer science domains that use trees such as artificial intelligence, security,
networking, compilers, graphics, and many more.

Operating system uses a tree in file systems.

Word dictionary uses tries for searching easier.

and many more.

## Properties.

A tree composes of a collection of entities called "nodes", these nodes are connected to each other with "edge/link" which creates the whole hierarchy of a tree.


The topmost node is called "ROOT", it a special node in the tree.


Nodes under the root are called "children".


Leaves or frontier, are the nodes who do not have children.


The height the length of the longest path from the root to a leaf. This is the height of the tree.


A height of a node x is the path from this node x to the longest path to a leaf.


A tree can be called a recursive data structure since a the sub-parent can form a whole new tree. Recursive data structure a sub-tree of the whole tree can form a tree itself.



A depth of a certain node. So, the depth of node X is the length of the path from the root to this node X.


The depth of the root node is ZERO or o :).



Binary tree. This is the most famous. It is a tree representation in which each node has at most 2 nodes or less.


A complete binary tree is a  tree that all of their children exactly the frontier/ leaves have exactly 2 children. Or, If all levels except the last level are completely filled. The number of nodes in each level is 2 ^ I where I represent the level number. The number of nodes in the whole perfect tree is 2^0 + ... + 2 ^h where h  is the height of the tree.


a balanced binary tree is  when we have the difference of height of left and right subtrees for every node is not more than k (most 1)


## Binary Trees.

A binary tree is a data structure that has at most 2 nodes to be stored. The parent can have 0, 1, or 2 nodes.



### Binary search tree.

A BST in short, is a type of a binary tree where it nodes values are order which means the lft node has value less than the parent, and the right node has vlaue greater than the parent.


#### Traversing a Binary tree.

There are multiple way to traverse a binary tree.


1- Breadth-first or (level order traversal)

For this algorithm, we visit all nodes on the same level, In order to do that we have to use another data structure which is a <code>queue</code>.


This is the syntax for level order or Breadth first for vising every node in a a tree.


```c++
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

```


Time complexity is <code> O(n) </code> since the number of node determines the time.

Space complexity is <code>O(n)</code> which is determined by the nodes in the  <code>queue</code>, so if we have a big tree then each level of this tree will be in the queue unless of course, the tree has a linear structure.


2- Depth-first can have three ways.

 - Preorder: <Visit><Left><Right>

 - Inorder: <Left><Visit><Right>

 - Postorder: <Left><Right><Visit>

 - 2-1: We know in Preorder algorithm, the traversal is like this <Visit><Left><Right>, so the algorithm is as follows,

 1- Visit a root.

 2- Recurse on the left sub-tree.

 3- Recurse on the right sub-tree.



The source code for it.

```c++
void PreOrder(Node * root){
if (root == NULL) return ;

cout<<root->data<<" ";
PreOrder(root->left);
PreOrder(root->right);
}
```


- 2-2: We know in Inorder algorithm, the traversal is like this <Left><Visit><Right>, so the algorithm is as follows,

1- Recurse on the left sub-tree.

2-  Visit a root.

3- Recurse on the right sub-tree.



The source code for it.

```c++
void Inorder (Node * root){
if (root == NULL) {
return;
}
Inorder(root->left);
cout<<root->data<<" ";
Inorder(root->right);
return;
}
```


- 2-3: We know in Postorder algorithm, the traversal is like this <Left><Right><Visit>, so the algorithm is as follows,

1- Recurse on the left sub-tree.

2-   Recurse on the right sub-tree. Visit a root.

3- Visit a root.


The source code for it.

```c++
void PostOrder (Node * root){
if (root == NULL) {
return;
}
PostOrder(root->left);
PostOrder(root->right);
cout<<root->data<<" ";
return;
}
```


### Deleting a node form a BST.


Deleting a node in a BST is not straightforward since a BST has to hold for its structures and properties which are left node is less than its parent and right node is greater than its parent.


If the node we want to delete is a leaf node from  a BST, then we do not have to any adjacent to the structure of the tree.  
