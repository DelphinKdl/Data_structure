public class Sparse_Med {
  static int[] matchingStrings(String[] strings, String[] queries) {

// Honestly , I think there is a better solution for this. 
        int lengthStrings = strings.length;
        int lengthQueries = queries.length;
        int [] lengthOfOcurrences = new int[lengthQueries] ;
        int val = 0 ;
        int index = 0 ;
        // Note:  this solution is going to be taking a O(n^2)
        // I think it is a little bad or may be it is
        // so freaking bad.
        for (int i = 0 ; i <lengthQueries ; i++) {
           for (int j = 0 ;  j <lengthStrings ; j++) {
               if (queries[i].equals(strings[j])) {
                    val++;
               }
           }
           lengthOfOcurrences[index] = val ;
           val = 0 ;
           index++;

        }

        return lengthOfOcurrences ;

    }

  public static void main (String [] args) {

  }
}
