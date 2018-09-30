public class Me {
  private String name ;
  public Me(String s){
    super();
    this.name = s ;
    System.out.println(this.name);
  }
  public void method2(){
    System.out.println(" Me MEthod 2");
  }
  public void method1(){
    System.out.println(" Me MEthod 1");
  }
  public static void main (String [] args){
  Me s = new Sample("Aziz");
  s.method1();
  }
}
