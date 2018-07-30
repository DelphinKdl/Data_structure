public class BST {
  private Node root;
  private static int size ;
  // BASIC of BST.
  //1 Left is less than a root.
  // Right is greater tha
  public BST(){
    this.size = 0;
    this.root = null;
  }
  public Node addrec(Node root, int data){
    if(root == null){
      root = new Node(data);

    }
    else if (data <= root.text){
      root.left = addrec(root.left, data);
    }
    else
    root.right = addrec(root.right, data);

    return root;
  }
  public Node rootGetter(){
    return this.root;
  }
  public void getrootValue(){
    System.out.println(root.right.text);
  }
  public static int getSize(){
    return size;
  }

    public static void main (String [] args){
      BST tree = new BST();
      Node x = tree.rootGetter();
          tree.add(10);
          tree.add(2);
          tree.add(12);
          tree.add(4);
          tree.add(3);
          tree.add(11);
          tree.add(19);
          tree.add(21);
          tree.add(9);
          tree.inOrder(tree.root);

         // x=  tree.addrec(x,10);
         //  x= tree.addrec(x,2);
         //  x = tree.addrec(x,12);
         //  x= tree.addrec(x,4);
         //  x=tree.addrec(x,3);
         //  x=tree.addrec(x,11);
         // x= tree.addrec(x,19);
         //  x=

         System.out.println(tree.getSize());





    }
    public void removeNode(int val){
      if (this.root == null){
        System.out.println("Tree is empty");
        return ;
      }
      Node temp = this.root; // iterativsly
      if (temp != null){
        if (val < temp.text){
          //
          if (temp.text == val){

          }
          temp = temp.left ;
        } else if (val > temp.text){
          //
          if (temp.text == val){

          }
          temp = temp.right ;
        }
      }

    }
    public void preorder(Node head){
      if (head == null){
        return;
      }
      System.out.println(head.text);
      preorder(head.left);
      preorder(head.right);
    }
    public void inOrder(Node head){
      if (head == null){
        return;
      }
      inOrder(head.left);
      System.out.println(head.text);
      inOrder(head.right);
    }
    public void postOrder(Node head){
      if (head == null){
        return;
      }

      postOrder(head.left);

      postOrder(head.right);

      System.out.println(head.text);
    }
    public void add(int text){
      Node temp = new Node(text);
      if (this.root == null){
        this.root = temp;
        this.size++;
        return ;
      }
      Node trav = this.root;
      while(trav != null){
        if (text < trav.text ){
          if (trav.left == null){
            trav.left = temp;
            this.size++;
            return ;
          }
          trav = trav.left ;
        } else {
          if (trav.right == null){
                  trav.right = temp;
                    this.size++;
                  return;
          }

           trav = trav.right;
        }

      }
    }

    private class Node {
        private Node right ;
        private Node left ;
        private int text;

        private Node(int data){
          this.text = data;
          this.right = null;
          this.left = null ;
      }
    }


}
