public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    boolean hasPassed() {
        if (grade >= 5.0) {
            return true;
        } else {
            return false;
        }
    }
}
