import java.io.*;
import java.util.*;
class swiggy
  {
   public static void main (String args[])
     {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter order number");
      int order_num= input.nextInt();
      System.out.println("Kitna udaya hai ?");
      int price = input.nextInt();
      int prime = 0;
      for(int i=1; i<=order_num; i++)
        {
         if(order_num%i==0)
           prime++;
        }
      if(prime==2)
       {
        System.out.println("Badhai Ho");
        System.out.println(price-(0.8*price));
       }
      else
       {
        System.out.println("Nope");
        System.out.println(price-(0.5*price));
       }
      }
   }