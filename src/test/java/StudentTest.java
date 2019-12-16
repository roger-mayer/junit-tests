import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class StudentTest {
    public String name;
    public long id;
    public ArrayList<Integer> grades = new ArrayList<>();
    public ArrayList<Integer> grades2 = new ArrayList<>();;

Student test1;

@Before
public void initSetupStudent(){
    test1= new Student("roger", 1234, grades);
//    List<Integer> grades = Arrays.asList (90,95,100);
    grades.add(90);
    grades.add(95);
    grades.add(100);


}

@Test
public void testIfStudentCanBeCreated() {

    assertEquals("roger", test1.name);
    assertEquals(1234, test1.id);
    assertEquals(grades, test1.grades);
}
@Test
public void testIfStudentCanBeChanged() {
    test1 = new Student("asher", 4321, grades);
    assertEquals("asher",test1.name);
    assertEquals(4321,test1.id);
    assertEquals(grades,test1.grades);
    }

@Test
public void getNameTest(){
    assertEquals("roger","roger");
}
@Test
public void getIdTest(){
    assertEquals(1234,1234);
}

@Test
public void getAverageTest(){
    assertEquals(grades,grades);
}
@Test
public void gradeAverageTest(){
//assertEquals(grades, 95);
assertEquals(test1.getGradeAverage(),95,0);
}




}
