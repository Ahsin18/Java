import java.util.Scanner;


public class currency 
{
    public static void main (String args [])
    {
        System.out.println("SELECT YOUR CURRECY To Convert IN INR");
        System.out.println("1. Dollars");
        System.out.println("2. Pounds");
        System.out.println("3. Dinars");
        System.out.println("4. Yan");
        
        int choice;
        double  amt,inr;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Choice");
        choice= sc.nextInt();

        if(choice == 1)
        {
            System.out.println("You selected Dollar");
            System.out.println("Enter the Amount to convert");
            amt = sc.nextDouble();
            
            inr=amt*84.04;
            System.out.println("Amount is Rs :-" + inr);
        }

        else if(choice == 2)
        {
            System.out.println("You selected Pounds");
            System.out.println("Enter the Amount to convert");
            amt = sc.nextDouble();
            
            inr=amt*109.21;
            System.out.println("Amount is Rs :-" + inr);
        }

        else if(choice == 3)
        {
            System.out.println("You selected Dinars");
            System.out.println("Enter the Amount to convert");
            amt = sc.nextDouble();
            
            inr=amt*274.39;
            System.out.println("Amount is Rs :-" + inr);
        }
        else if(choice == 4)
        {
            System.out.println("You selected yan");
            System.out.println("Enter the Amount to convert");
            amt = sc.nextDouble();
            
            inr=amt*0.34;
            System.out.println("Amount is Rs :-" + inr);
        }
        else
        {
            System.out.println("Invalid Option........");
        }

    }  
}
