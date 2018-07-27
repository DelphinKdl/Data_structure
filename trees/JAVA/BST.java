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
         tree.add(10);
          tree.add(2);
          tree.add(12);
          tree.add(4);
          tree.add(3);
          tree.add(11);
          tree.add(19);
          Node x = tree.rootGetter();
          tree.postOrder(x);




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
            return ;
          }
          trav = trav.left ;
        } else {
          if (trav.right == null){
                  trav.right = temp;
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
