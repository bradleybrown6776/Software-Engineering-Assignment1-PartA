package PartA;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.joda.time.DateTime;


public class CourseTest {
    Course course;

    @Before public void init() {
        // Reset module test object before each test.
        course = new Course("CS & IT", DateTime.now(), DateTime.now());
    }

    @Test public void studentsCanBeAddedToCourse() {
        Student student = new Student("Eoin McArdle", 21, "05/12/1999", 198181929);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student);
        course.setStudents(students);
        assertEquals(students, course.getStudents());
    }

    @Test public void modulesCanBeAddedToCourse() {
        Module module = new Module("Software Engineering","CT417");
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(module);
        course.setModules(modules);
        assertEquals(modules, this.course.getModules());
    }
}
