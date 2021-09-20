package checkpointI;

import java.util.ArrayList;

public class Course {
    private String name;
    private double value;
    private String classroomName;
    private Teacher teacher;
    private ArrayList <Student> student;
    private Period period;

    public Course(String name, double value, String classroomName, Period period) {
        this.name = name;
        this.value = value;
        this.classroomName = classroomName;
        this.period = period;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }
}
