import java.util.Scanner;
import java.util.ArrayList;
public class largestelement{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter The NUmber of Elements ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            {
                list.add(sc.nextInt());
            }
        System.out.println("Enter The Target Elements ");
        int target= sc.nextInt();

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i) == target )
            {
               list.remove(i) ;
                i--;
            }
        }
       System.out.println(list); 
    }
}