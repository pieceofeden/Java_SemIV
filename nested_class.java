import java.io.*;
 class outer
 {
  static int x=10;
  void show()
  {
   System.out.println(x);
  }
   class inner
 {
  int y=40;  
  void sh()
  {
   System.out.println(y);
  }
}
public static void main(String args[])
{
outer.inner oi=new outer().new inner();
oi.sh();
outer out=new outer();
out.show();
}
}
