import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CohortTest {
    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;
    @Before
    public void setup(){
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();
        Student roger = new Student(1,"Roger");
        roger.addGrade(100);
        Student riley = new Student(2,"Riley");
        riley.addGrade(100);
        riley.addGrade(95);
        riley.addGrade(90);

        cohortWithMany.addStudent(new Student(1,"Roger"));
    }

    @Test
    public void testAddStudent(){
        Cohort cohortWithOne = new Cohort();
        assertEquals(0,emptyCohort.getStudents().size());

        assertEquals(1,cohortWithOne.getStudents().size());
//        assertEquals(1,cohortWithOne.getStudents().get(0).getId());
    }

    @Test
    public void testIfAverageIsCorrect(){
        assertEquals(95.0, cohortWithMany.getCohortAverage(),0);






    }
}
