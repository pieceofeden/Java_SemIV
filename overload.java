import java.io.*;
import java.util.*;
class overload
  {
   Scanner input = new Scanner(System.in);
   public static void area()
     {
      
      int a = input.nextInt();
      System.out.println(a*a);
      }
   public static void area(double l, double b)
     {
      System.out.println(l*b);
      }
   public static void area(double r)
     {
      System.out.println((22/7)*r*r);
      }
   public static void main (String args[])
     {
      overload obj = new overload();
      Scanner input = new Scanner(System.in);
      System.out.println("1: SQUARE  2: RECTANGLE  3:CIRCLE");
      int choice = input.nextInt();
      switch(choice)
       	{
         case 1: obj.area();
                 break;
         case 2: 
      		 int l = input.nextInt();
                 int b = input.nextInt(); 
                 obj.area(l,b);
                 break;
         case 3:
      		 int r = input.nextInt();
                 obj.area(r);
                 break;
        }
     }
   }