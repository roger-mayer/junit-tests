import java.util.ArrayList;

public class Student {
    public static long id;
    public static String name;
    public static ArrayList<Integer> grades;

    // constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String name, long id, ArrayList<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;

    }


    //return student name
    public long getId() {
        return this.id;
    }


    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }


}
