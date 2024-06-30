public class demo1 {
    
       public static void main(String args[])
       {
           System.out.println(" before call" );
           test(8,0);
           System.out.println(" after call" );
           System.out.println(" program end" );
       }
       public static void test( int a , int b )
       {
           int c=0;
           System.out.println("before expression...");
           c= a/b;
           System.out.println("after expression");
           System.out.println(" Result is :"+c );
       }
   }
