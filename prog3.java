// Print even numbers between 1 to 30 using Do..while Loop

public class Prog3
{
    public static void main(String[] args)
    {
        int i=1;
        do
      {
            if(i%2==1)
           {
              System.out.println(i + " ");
           }
           i++;
      }
      while (i<=30);  
    }
}