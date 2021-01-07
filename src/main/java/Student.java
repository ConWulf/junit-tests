import java.util.ArrayList;
import java.util.List;

public class Student {

    private long id;
    private String name;
    private List<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrades(int grade) {
        grades.add(grade);
    }

    public double getAverage() {
        int total = 0;
        for (int i : this.grades) {
            total += i;
        }
        return (double) total / grades.size();
    }

    public void updateGrade(int i, int grade) {
        grades.set(i, grade);
    }

    public void deleteGrade(int i) {
        grades.remove(i);
    }
}
