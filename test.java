import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("Please insert your name: ");
        String name = sc.nextLine();

        System.out.print("Please insert your age: ");
        int age = sc.nextInt();

        System.out.print("Please insert number of working days: ");
        int numDay1 = sc.nextInt();

        System.out.print("Please insert number of absent days: ");
        int numDay2 = sc.nextInt();

        System.out.print("Please insert your body weight: ");
        double weight = sc.nextDouble();

        // คำนวณเงินเดือนตามเงื่อนไข
        double salary = calculateSalary(age, numDay1, numDay2);

        // คำนวณโบนัสตามน้ำหนัก
        double bonus = calculateBonus(weight);

        // แสดงผลลัพธ์
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        System.out.println("Your salary and bonus is " + (salary + bonus) + " Baht");

        sc.close();
    }

    // ฟังก์ชันคำนวณเงินเดือนตามเงื่อนไข
    public static double calculateSalary(int age, int numDay1, int numDay2) {
        double salary;

        if (age >= 21 && age <= 30) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        } else if (age >= 31 && age <= 40) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        } else if (age >= 41 && age <= 50) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        } else if (age >= 51 && age <= 60) {
            salary = numDay1 * 3000;
        } else {
            salary = 0;
            System.out.println("Invalid age");
        }

        return salary;
    }

    // ฟังก์ชันคำนวณโบนัสตามน้ำหนัก
    public static double calculateBonus(double weight) {
        double bonus;

        if (weight >= 10 && weight <= 60) {
            bonus = 5000;
        } else if (weight > 60 && weight <= 90) {
            bonus = 5000 - ((weight - 60) * 10);
        } else {
            bonus = 0;
        }

        return bonus;
    }
}

