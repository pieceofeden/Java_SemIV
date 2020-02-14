import java.io.*;
import java.util.*;
class rect
  {
   int length = 10, breadth = 20;
   rect()
     {
       System.out.println(length*breadth);
      }
   rect(int l, int b)
     {
      System.out.println(l*b);
      }
   rect(rect r)
     {
      System.out.println(r.length*r.breadth);
     }
   public static void main (String args[])
     {
      rect r = new rect();
      rect r1 = new rect(1,2);
      rect r2 = new rect(r);
      }
   }


