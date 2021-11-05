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
        student = new Student("Bradley Brown", 21, 198181929);
    }

    @Test public void getUserNameReturnsCorrectUsername() {
        assertEquals("Brad12", student.getUsername());
    }

    @Test public void canAddModulesToStudent() {
        Module module = new Module("Software Engineering","CT417");
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(module);
        student.setModules(modules);
        assertEquals(modules, student.getModules());
    }

}
