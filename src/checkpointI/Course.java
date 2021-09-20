package checkpointI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    private String name;
    private double value;
    private String classroomName;
    private Person teacher;
    private Period period;
    private List<Person> students = new ArrayList<>();

    public Course(String name, double value, String classroomName, Period period) {
        this.name = name;
        this.value = value;
        this.classroomName = classroomName;
        this.period = period;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Curso: %s\nMensalidade: %s\nSala: %s\nProfessor(a): %s\nPeríodo: %s\nAlunos: %s",
                this.name, this.value, this.classroomName, teacher.getName(), period.getPeriodName(), getStudentsNames(this.students));
    }

    public void addStudents(List <Person> students) {
        this.students.addAll(students);
    }

    public void addStudent(Person student) {
        this.students.add(student);
    }

    private String getStudentsNames(List<Person> students) {
        List <String> studentsNames = new ArrayList<>();
        students.forEach(student -> studentsNames.add(student.getName()));
        return Arrays.toString(studentsNames.toArray());
    }
}
