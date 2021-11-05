package PartA;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.joda.time.DateTime;


public class ModuleTest {
    Module module;

    @Before public void init() {
        // Reset module test object before each test.
        module = new Module("Software Engineering", "CT417");
    }

    @Test public void studentsCanBeAddedToModule() {
        Student student = new Student("Eoin McArdle", 21, "05/12/1999", 198181929);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student);
        module.setStudents(students);
        assertEquals(students, module.getStudents());
    }

    @Test public void coursesCanBeAddedToModule() {
        Course course = new Course("CS & IT",DateTime.now(), DateTime.now());
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(course);
        module.setCourses(courses);
        assertEquals(courses, module.getCourses());
    }
}
