import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class StudentTest {

    Student student1;
    Student student2;
    Student student3;

    @Before
    public void setUp() {
        student1 = new Student(1L, "harry");
        student2 = new Student(2L, "ron");
        student3 = new Student(3L, "hermione");
        student2.addGrades(80);
        student2.addGrades(93);
        student2.addGrades(99);
        student3.addGrades(76);
        student3.addGrades(88);
        student3.addGrades(99);
    }



    @Test
    public void testStudent() {
        assertNotNull(student1);
        assertNotNull(student2);
        assertNotNull(student3);
    }

    @Test
    public void testGetId() {
        assertEquals(1L, student1.getId());
        assertEquals(2L, student2.getId());
        assertEquals(3L, student3.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("harry", student1.getName());
        assertEquals("ron", student2.getName());
        assertEquals("hermione", student3.getName());
    }

    @Test
    public void testGetGrades() {
        assertNotNull(student1.getGrades());
        assertNotNull(student2.getGrades());
        assertNotNull(student3.getGrades());
    }

    @Test
    public void testAddGrade() {
        assertTrue("no grades yet", student1.getGrades().isEmpty());
        student1.addGrades(77);
        student1.addGrades(97);
        student1.addGrades(87);
        assertFalse("has grades", student2.getGrades().isEmpty());
        assertFalse("has grades", student3.getGrades().isEmpty());
        assertFalse("now has grades", student1.getGrades().isEmpty());
    }

    @Test
    public void testGetAverage() {
        assertEquals(87.6, student3.getAverage(), 0.4);
        assertEquals(90.7, student2.getAverage(), 0.4);
    }

    @Test
    public void testUpdateGrade() {
        assertEquals(80, (int) student2.getGrades().get(0));
        student2.updateGrade(0, 88);
        assertEquals(88, (int) student2.getGrades().get(0));
        assertEquals(76, (int) student3.getGrades().get(0));
    }

    @Test
    public void testDeleteGrade() {
        assertEquals(3, student2.getGrades().size());
        student2.deleteGrade(0);
        assertEquals(2, student2.getGrades().size());
        assertEquals(3, student3.getGrades().size());
    }




}
