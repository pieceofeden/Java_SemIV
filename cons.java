import java.io.*;
import java.util.*;
class rect
  {
   rect()
     {
      System.out.println("no para");
      }
   rect(int a, int b)
     {
      System.out.println("two para");
      l = a;
      b = b;
      }
   rect(rect r)
     {
      length =  r.l;
      breadth = r.b;
      System.out.println(length,breadth)
     }
   public static void main (String args[])
     {
      rect r = new rect(1,2);
      rect r1 = new rect(r);
      }
   }