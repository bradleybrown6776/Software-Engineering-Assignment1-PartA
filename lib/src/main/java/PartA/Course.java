package PartA;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
    private String name;
    private DateTime startDate;
    private DateTime endDate;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;

    public Course(String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Course: " + name + "\n");
        str.append("Modules:\n");
        for(Module module : modules) {
            str.append("\t");
            str.append(module);
            str.append("\n");
        }
        return str.toString();
    }
}
