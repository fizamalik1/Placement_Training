public class Fibonacci {
    public static void main(String[] args) {

         int n1=0;
         int n2=1;
         int n3;
         int i;

         System.out.println(n1);
         System.out.println(n2);

         for(i=3;i<=10;i++)
         {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
         }
    }
}