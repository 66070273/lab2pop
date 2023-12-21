import java.util.*;
public class lab3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        while (true) {
            int number = sc.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.print("Odd number = " + oddCount + " and");
        System.out.println("Even number = " + evenCount);
    }
}
