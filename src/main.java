import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Placement Eligibility Decision engine");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of Candidate: ");
        String name = sc.next();

        System.out.println("Enter percentage of the candidate: ");
        double percentage = sc.nextDouble();

        System.out.println("Enter the no of Backlogs (if not enter 0): ");
        int backlogs = sc.nextInt();

        System.out.println("Enter the Graduation year");
        int graduationYear = sc.nextInt();

        // System.out.println("Candidate: " + name);
        // System.out.println("Percentage: " + percentage);
        // System.out.println("Backlogs: " + backlogs);
        // System.out.println("Graduation Year: " + graduationYear);

        Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Percentage: " + candidate.getPercentage());
        System.out.println("Backlogs: " + candidate.getBacklogs());
        System.out.println("Graduation Year: " + candidate.getGraduationYear());
        System.out.println();

        Job job = new Job("Infosys", "Java Developer", 65.0, 0, 2026);

        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println("Minimum Percentage: " + job.getMinimumPercentage());
        System.out.println("Maximum Backlogs: " + job.getMaximumBacklogs());
        System.out.println("Required graduation year: " + job.getRequiredGraduationYear());
        System.out.println();
        System.out.println();

        //// Final output printing
        /// 

        System.out.println("=============================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("=============================================");
        System.out.println();

        System.out.println("Candidate :" + candidate.getName());
        System.out.println("Company   :" + job.getCompany());
        System.out.println("Role      :" + job.getRole());
        System.out.println();

        if (candidate.getPercentage() >= job.getMinimumPercentage()) {
            System.out.println("Percentage   :PASS");
        } else {
            System.out.println("Percentage   :FAIL");
        }

        if (candidate.getBacklogs() <= job.getMaximumBacklogs()) {
            System.out.println("Backlogs    :PASS");
        } else {
            System.out.println("Backlogs    :FAIL");
        }

        if (candidate.getGraduationYear() == job.getRequiredGraduationYear()) {
            System.out.println("Graduation year   :PASS");
        } else {
            System.out.println("Graduation year   :FAIL");
        }

        System.out.println();

        if (candidate.getPercentage() >= job.getMinimumPercentage()
                && candidate.getBacklogs() <= job.getMaximumBacklogs()
                && candidate.getGraduationYear() == job.getRequiredGraduationYear()) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBBLE");
        }

        System.out.println("=============================================");
        sc.close();

    }

}
