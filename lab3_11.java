import java.util.*;
public class lab3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int Lines = sc.nextInt();

        for (int i = 1; i <= Lines; i++) {
            System.out.print("|");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
