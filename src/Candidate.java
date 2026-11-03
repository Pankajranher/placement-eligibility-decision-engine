public class Candidate {

    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;
    private String[] skills;

    public Candidate(String name, double percentage, int backlogs, int graduationYear, String[] skills) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
        this.skills = skills;

    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public boolean hasSkills(String requiredSkills) {
        for (int i = 0; i < skills.length; i++) {
            if (skills[i].equalsIgnoreCase(requiredSkills)) {
                return true;
            }
        }

        return false;
    }
}
