import java.io.*;
import java.util.*;


class odd_even
 {
   public static void main(String args[])
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the class size: ");
      int n = input.nextInt();
      int even_sum=0,odd_sum=0;
      for(int i=1; i<=n; i++)
       {
         if(i%2==0)
            even_sum=even_sum+i;
          else
             odd_sum=odd_sum+i;
        }
      System.out.println("Sum of ODD and EVEN: "+ (odd_sum+even_sum));
      System.out.println("Even sum: "+even_sum);
      System.out.println("Odd sum: "+odd_sum);
    }
 }
