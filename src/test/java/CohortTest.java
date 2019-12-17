import org.junit.Test;

import static org.junit.Assert.*;


public class CohortTest {
    @Test
    public void testAddStudent(){
        Cohort cohortWithOne = new Cohort();
        assertEquals(0,cohortWithOne.getStudents().size());
        cohortWithOne.addStudent(new Student(1,"Roger"));
        assertEquals(1,cohortWithOne.getStudents().size());
//        assertEquals(1,cohortWithOne.getStudents().get(0).getId());
    }

    @Test
    public void testIfAverageIsCorrect(){
        Cohort cohortWithMany = new Cohort();

        Student roger = new Student(1,"Roger");
        roger.addGrade(100);
        Student riley = new Student(2,"Riley");
        riley.addGrade(100);
        riley.addGrade(95);
        riley.addGrade(90);

        cohortWithMany.addStudent(new Student(1,"Roger"));

    }
}
