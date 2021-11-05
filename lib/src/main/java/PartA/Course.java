package PartA;
import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;

    public Course(String name) {
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
