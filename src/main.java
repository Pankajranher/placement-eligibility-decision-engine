import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Placement Eligibility Decision engine");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double percentage = sc.nextDouble();

        int backlogs = sc.nextInt();
        int graduationYear = sc.nextInt();

        System.out.println("Candidate: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Backlogs: " + backlogs);
        System.out.println("Graduation Year: " + graduationYear);

        sc.close();

    }

}
