import java.io.*;
import java.util.*;
class args
  {
   public static void main (String args[])
     {
      Scanner input = new Scanner(System.in);
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println("String Concantenation:"+(args[0]+args[1]));
      System.out.println("Integer Sum:"+(a+b));
      }
   }