package learnJava.PolyMorphism;

class School {
    private String schoolName;
    private String branch;
    private int history;
    private double fees;

    public School(String schoolName, String branch, int history, double fees) {
        this.schoolName = schoolName;
        this.branch = branch;
        this.history = history;
        this.fees = fees;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getBranch() {
        return branch;
    }

    public int getHistory() {
        return history;
    }

    protected double getFees() {
        return fees;
    }
}

class Teacher extends School {
    public Teacher(String schoolName, String branch, int history, double fees) {
        super(schoolName, branch, history, fees);
    }

    public void accessSchoolInfo() {
        System.out.println("School Name: " + getSchoolName());
        System.out.println("Branch: " + getBranch());
        System.out.println("History: " + getHistory());
        System.out.println("Fees: " + getFees());
    }
}

class Student extends School {
    public Student(String schoolName, String branch, int history, double fees) {
        super(schoolName, branch, history, fees);
    }

    public void accessSchoolInfo() {
        System.out.println("School Name: " + getSchoolName());
        System.out.println("Branch: " + getBranch());
        System.out.println("History: " + getHistory());
    }
}

public class Assaign {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("ABC School", "Main Branch", 50, 10000.0);
        Student student = new Student("Abc School", "Main Branch", 50, 10000.0);

        System.out.println("Teacher's Access:");
        teacher.accessSchoolInfo();

        System.out.println("\nStudent's Access:");
        student.accessSchoolInfo();
    }
}
