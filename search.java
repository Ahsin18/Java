
import java.util.Scanner;
import java.util.ArrayList;

public class search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        int index = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                index = i;
                break;
            }
        }

        System.out.println("Index = " + index);
        sc.close();
    }
}
