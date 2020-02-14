import java.util.*;

class small
  {
   static int min2(int x, int y)
     {
      if(x>y)
        return y;
      else
        return x;
     }
   static double min2(double x, double y)
     {
      if(x>y)
        return y;
      else
        return x;
     }
   public static void main (String args[])
     {
      small obj = new small();
      System.out.println(obj.min2(1,2));
      System.out.println(obj.min2(1.2,3.2));
      }
   }
