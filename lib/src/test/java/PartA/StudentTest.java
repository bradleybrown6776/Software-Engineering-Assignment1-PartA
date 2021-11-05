package PartA;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class StudentTest {
    Student student;

    @Before public void init() {
        // Reset student test object before each test.
        student = new Student("Eoin McArdle", 21, "05/12/1999", 198181929);
    }

    @Test public void getUserNameReturnsCorrectUsername() {
        assertEquals("Eoin McArdle-05/12/1999", student.getUsername());
    }

    @Test public void modulesCanBeAddedToStudent() {
        Module module = new Module("Software Engineering","CT417");
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(module);
        student.setModules(modules);
        assertEquals(modules, student.getModules());
    }

    @Test public void coursesCanBeAddedToStudent() {
        Course course = new Course("CS & IT",DateTime.now(), DateTime.now());
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(course);
        student.setCourses(courses);
        assertEquals(courses, student.getCourses());
    }

    @Test public void toStringOutputsCorrectRepresentation() {
        Module module = new Module("Software Engineering","CT417");
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(module);
        student.setModules(modules);
        Course course = new Course("CS & IT",DateTime.now(), DateTime.now());
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(course);
        student.setCourses(courses);
        String out = student.toString();
        assertEquals("Eoin McArdle-05/12/1999\nModules:\n\tSoftware Engineering\nCourses:\n\tCS & IT\n", out);
    }
}
