import java.util.Scanner;

public class calculator 
{
  public static void main(String args [])
  {
    int choice, add, sub, multi, div,fno,sno;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Any OPtion ");
    System.out.println("1. Add");
    System.out.println("2. Substract");
    System.out.println("3. Multiplication");    
    System.out.println("4. Divition");
    System.out.println("5. Exit ");


    System.out.println(" Enter Your Choice");
    choice = sc.nextInt();


    if(choice == 1)
    {
        System.out.println("Enter The First Number");
        fno=sc.nextInt();
        System.out.println("Enter The Second  Number");
        sno=sc.nextInt();
        {
            add=fno+sno;
        }
        System.out.println("total of "+ fno + "+" + sno +"=" +add);
        
    }

    else if(choice == 2)
    {
        System.out.println("Enter The First Number");
        fno=sc.nextInt();
        System.out.println("Enter The Second  Number");
        sno=sc.nextInt();
        {
            sub=fno-sno;
        }
        System.out.println("total of "+ fno + "-" + sno +"=" + sub);
        
    }

    else if(choice == 3)
    {
        System.out.println("Enter The First Number");
        fno=sc.nextInt();
        System.out.println("Enter The Second  Number");
        sno=sc.nextInt();
        {
            multi=fno*sno;
        }
        System.out.println("total of "+ fno + " X "+ sno +"=" + multi);
        
    }

    else if(choice == 4)
    {
       System.out.println("Enter The First Number");
        fno=sc.nextInt();
        System.out.println("Enter The Second  Number");
        sno=sc.nextInt();
        {
            div=fno/sno;
        }
        System.out.println("total of "+ fno + " / "+ sno + "=" + div);        

    }

    else if(choice == 5)
    {
        System.out.println("5. exiting the Program...."); 
    }
  }
}
