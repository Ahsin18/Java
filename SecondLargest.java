
import java.util.Scanner;
import java.util.ArrayList;

public class SecondLargest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Integer largest = null;
        Integer secondLargest = null;

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);

            if (largest == null || value > largest) {
                if (largest != null) {
                    secondLargest = largest;
                }
                largest = value;
            } else if (value < largest &&
                       (secondLargest == null || value > secondLargest)) {
                secondLargest = value;
            }
        }

        if (secondLargest == null) {
            System.out.println("Second-largest element does not exist");
        } else {
            System.out.println("Second-largest = " + secondLargest);
        }

        sc.close();
    }
}
