package checkpointI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends Person {
    private static int count = 0;
    private List <Course> courses;
    private int id;

    public Student(String name, String cpf, String phone, Gender gender, String email, Address address, List<Course> courses) {
        super(name, cpf, phone, gender, email, address);
        this.courses = courses;
        this.id = ++count;
    }

    public int getId() {
        return this.id;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public String toString() {
        return String.format("ID: %s\nNome: %s\nCPF: %s\nTelefone: %s\nSexo: %s\nEmail: %s\nEndereço:\n%s\nCursos: %s",
                this.id, super.getName(), super.getCpf(), super.getPhone(), super.getGender().getAbbreviation(), super.getEmail(), super.getAddress(), getCoursesNames(this.courses));
    }

    private String getCoursesNames(List<Course> courses) {
        List <String> coursesNames = new ArrayList<>();
        courses.forEach(course -> coursesNames.add(course.getName()));
        return Arrays.toString(coursesNames.toArray());
    }
}
