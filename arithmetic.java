import java.io.*;
import java.util.*;
class arithmetic
  {
   public static void main (String args[])
     {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a and b");
      int a = input.nextInt();
      int b = input.nextInt();
      System.out.println("1: Sum, 2: Substract, 3: Multiply, 4: Divide");
      int choice = input.nextInt();
      switch(choice)
        { 
         case 1: System.out.println(a+b);
		 break;
         case 2: System.out.println(a-b);
		 break;
         case 3: System.out.println(a*b);
		 break;
         case 4: System.out.println(a/b);
		 break;
        }
      }
   }