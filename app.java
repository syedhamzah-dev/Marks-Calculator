import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        sc.close();
    }
}