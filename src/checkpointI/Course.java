package checkpointI;

import java.util.ArrayList;

public class Course {
    private double value;
    private String classroomName;
    private Teacher teacher;
    private ArrayList <Student> student;
    private Period period;

    public Course(double value, String classroomName, Period period) {
        this.value = value;
        this.classroomName = classroomName;
        this.period = period;
    }
}
