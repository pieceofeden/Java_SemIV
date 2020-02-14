class detail
  {
   String name = "Ashish", rno = "20181CSE0077", branch = "CSE" ;
   detail()
     {
       System.out.println(name+", "+rno+", "+branch);
      }
   detail(String n, String r, String b)
     {
      System.out.println(n+", "+r+", "+b);
      }
   detail(detail d)
     {
      System.out.println(d.name+", "+d.rno+", "+d.branch);
     }
   public static void main (String args[])
     {
      detail d = new detail();
      detail d1 = new detail("a","B","c");
      detail d2 = new detail(d);
      }
   }
