import java.util.*;
public class lab2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if(money > 50000) {
            System.out.println(money*0.10);
        }else if(money <= 50000){
            System.out.println(money*0.05);
        }
        
    }
}
