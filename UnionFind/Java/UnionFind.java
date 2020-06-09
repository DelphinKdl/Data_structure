public class UnionFind {

  public static void main (String [] args) {
    int [] ids = new int [10] ;

    for(int i =0 ; i<ids.length ; i++) {
      ids[i] = -1 ;
    }



     // The default value is -1


  }

  boolean find (int p, int q) {
    if (p == -1  && q == -1) {
      System.out.println("The two points have not been connected yet"); 
      return false ;
    }
    else if (p == q) {
      System.out.println("Connected");
      return true ;
    }
    else {
      System.out.println("Not connected");
      return false ;

    }
  }
}
