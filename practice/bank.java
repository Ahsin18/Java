import java.util.Scanner;
public class bank 
{
    public static void main (String args [])
    {
        int choice,age,dep,Password;
        String name;
       Scanner sc = new Scanner(System.in);
        System.out.println("choose your Account ");
        System.out.println("WELCOME TO BOA");
        System.out.println("1. Saving Account ");
        System.out.println("2. Current Account");
        
        System.out.println("mention the number");


        System.out.println("Enter The Number");
        choice = sc.nextInt();

        if(choice == 1)
        {
            System.out.println("Opening Savings Account ");
            System.out.println("Enter your name");
            name =sc.next();
            System.out.println("Enter Age ");
            age =sc.nextInt();
            System.out.println(" Enter Your Password for account");
            Password= sc.nextInt();
            System.out.println(" Enter the Amount to Deposite");
            dep= sc.nextInt();
            System.out.println(name);
            System.out.println(age);
            System.out.println(Password);
            System.out.println(dep);
        }



    }
}
