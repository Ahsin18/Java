import java.util.Scanner;
public class vote
 {
    public static void main(String[] args)
     {
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter Your Age");
        age=sc.nextInt();

        if(age >= 18) {
         System.out.println("You Are Eligible To Vote");
     } else {
         System.out.println("You Are Not Eligible To Vote");
     }

      }
    
 }
