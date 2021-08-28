import java.util.Scanner;

public class Project 
{
   public static void main(String[] args) 
   {
      Scanner kb = new Scanner(System.in);

      System.out.print("My name is: ");
      String yourName = kb.nextLine();

      System.out.print("My age is: ");
      int yourAge = kb.nextInt();

      kb.nextLine();

      System.out.print("I hope to work for: ");
      String yourCompany = kb.nextLine();

      System.out.print("To earn: ");
      double salary = kb.nextDouble();

      System.out.println("My name is " + yourName + ", my age is " + yourAge + " and I hope to work for " + yourCompany
            + " and earn $" + salary + " per year.");
   }
}
