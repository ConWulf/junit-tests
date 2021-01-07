import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CohortsTest {

    Cohort jupiter;
    Student s1;
    Student s2;
    Student s3;

    @Before
    public void setUp() {
        s1 = new Student(1, "Kristen");
        s2 = new Student(2, "THE Ryan");
        s3 = new Student(3, "Evan");
        s1.addGrade(99);
        s1.addGrade(89);
        s2.addGrade(95);
        s2.addGrade(94);
        s2.addGrade(87);
        s3.addGrade(97);
        s3.addGrade(92);
        s3.addGrade(93);
        s3.addGrade(99);
        s3.addGrade(98);
        s3.addGrade(91);
        s3.addGrade(90);
        s3.addGrade(96);
        s3.addGrade(96);
        s3.addGrade(93);
        s3.addGrade(98);
        s3.addGrade(80);
        s3.addGrade(70);
        s3.addGrade(96);
        s3.addGrade(77);
        s3.addGrade(96);
        s3.addGrade(96);
        s3.addGrade(88);
        s3.addGrade(96);
        s3.addGrade(96);
        s3.addGrade(96);
        jupiter = new Cohort();
        jupiter.addStudent(s1);
        jupiter.addStudent(s2);
        jupiter.addStudent(s3);
    }

    @Test
    public void testStudentGrades() {
        assertNotNull(jupiter.getStudents().get(0).getGrades());
        assertEquals(2, jupiter.getStudents().get(0).getGrades().size());
        assertEquals(3, jupiter.getStudents().get(1).getGrades().size());
        assertEquals(94.0, jupiter.getStudents().get(0).getGradeAverage(), 0.1);
        assertEquals(92.0, jupiter.getStudents().get(1).getGradeAverage(), 0.1);
    }

    @Test
    public void testGetCohortAverage() {
        assertEquals(92.2, jupiter.getCohortAverage(), .05);
    }


    @Test
    public void testAddStudent() {
        assertEquals(3, jupiter.getStudents().size());
        jupiter.addStudent(new Student(4, "connor"));
        assertEquals(4, jupiter.getStudents().size());

    }



}
