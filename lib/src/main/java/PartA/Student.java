package PartA;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private long id;
    private ArrayList<Module> modules;
    private ArrayList<Course> courses;

    public Student(String name, int age, long id) {
     this.name = name;
     this.age = age;
     this.id = id;
    }

    public String getName() {
     return this.name;
    }

    public void setName(String name) {
     this.name = name;
    }

    public int getAge() {
     return this.age;
    }

    public void setAge(int age) {
     this.age = age;
    }

    public long getId() {
     return this.id;
    }

    public void setId(long id) {
     this.id = id;
    }

    public String getUsername() {
     return this.name  + "-" + this.dob;
    }

    public ArrayList<Module> getModules() {
     return this.modules;
    }

    public void setModules(ArrayList<Module> modules) {
     this.modules = modules;
    }

    public ArrayList<Course> getCourses() { return this.courses; }

    public void setCourses(ArrayList<Course> courses) {
     this.courses = courses;
    }
}
