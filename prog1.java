public class prog1
{
    public static void main(String args[]) 
    {
      int marks = 98;
      
      if(marks > 90)
      {
          System.out.println("A");
      }
      else if (marks < 80 && marks >= 90)
      {
          System.out.println("B");
      }
      else if(marks < 70 && marks >= 80)
      {
          System.out.println("C");
      }
      else 
      {
          System.out.println("fail");
        }
    }
}