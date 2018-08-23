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

  public boolean isBstUtil(Node root, int max, int min){
    if (root == null)
        return true;
    if (root.text <= min  || root.text > max){
         return false;
    }
    return isBstUtil(root.left, min, root.text) &&
    isBstUtil(root.right, root.text, max);
}
public boolean isValidBST(Node root) {
    return isBstUtil(root,Integer.MAX_VALUE, Integer.MIN_VALUE);
}

  public Node checkd(Node root){

    if (root == null){
        return null;
    }



    // if (root.left.text > root.text || root.right.text < root.text){
    //     return root; // Wrong
    // }

    root.left = checkd(root.left);
    root.right = checkd(root.right);
    return root;
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
      // Node x = tree.rootGetter();
          tree.add(10);
          tree.add(11);
          tree.add(19);
          tree.add(17);
          tree.add(21);
          // tree.add(6);
          // tree.add(8);


      boolean x = tree.isValidBST(tree.root);
          // tree.removeNode(tree.root, 0);
          // tree.inOrder(tree.root);
      System.out.println(x);

    }
    Node FindMin(Node temp){
    while(temp.left != null) temp = temp.left;
    return temp;
    }
    // NOTE DONE
    public Node removeNode(Node head,int val){
      if (head == null) return head;
      else if (val < head.text) head.left = removeNode(head.left,val);
      else if (val > head.text) head.right = removeNode(head.right,val);
      // We found the son of bitch.
      else {
        // Case one:
        if (head.left == null && head.right == null){
          head = null ;
          return head;
        } // case 2:
        else if (head.left == null){
          Node temp = head;
          head = head.right;
          temp = null ;
          return head;
        }

        else if (head.right == null){
          Node temp = head;
          head = head.left;
          temp = null ;
          return head;
        }
        // Thrid case:
        else {
          Node temp = FindMin(head.right);
          head.text = temp.text;
          head.right = removeNode(head.right, temp.text);
          return head;
        }

      }
  return head;
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
        if (text <= trav.text ){
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
