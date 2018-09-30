// public static void main?
import java.util.*;
public class Sample extends Me{
  Sample(String n){
    super(n);
  }
  public void method1(){
    System.out.println(" SAMPLE MEthod 1");
    method2(); // this refers to the calling object whihc is of type Sample.
    // I know that nameing classes is awful. 
  }

  public void method2(){
    System.out.println(" SAMPLE MEthod 2");
  }
}
