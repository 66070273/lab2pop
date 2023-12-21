import java.util.*;
public class lab2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        String text = sc.next();
        double count = 0;
        if (text.equals("A")) {
            count = money * 0.015 + money;
        } else if (text.equals("B")) {
            count = money * 0.02 + money;
        } else if (text.equals("C")) {
            count = money * 0.015 + money;
        } else if (text.equals("X")) {
            count = money * 0.05 + money;
        }
        System.out.println("Input your money : " + money);
        System.out.println("Input your account type(Please type A B C or X in uppercase) : " + text);
        System.out.println("Your total money in one year = " + count);

        }
    }

