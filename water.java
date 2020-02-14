import java.util.*;

class water
  {
   static int filled = 150;
   static int remain(int used)
     {
      filled = filled-used;
      return filled;
     }
   public static void main (String args[])
     {
      System.out.println(remain(20));
      System.out.println(remain(40));
      }
   }
