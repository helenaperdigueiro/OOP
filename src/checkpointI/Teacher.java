package checkpointI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher extends Person{
    private List <Course> courses;
    private double hourlyRate;
    private Title title;

    public Teacher(String name, String cpf, String phone, Gender gender, String email, Address address, List<Course> courses, double hourlyRate, Title title) {
        super(name, cpf, phone, gender, email, address);
        this.courses = courses;
        this.hourlyRate = hourlyRate;
        this.title = title;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public String toString() {
        return String.format("Nome: %s\nCPF: %s\nTelefone: %s\nSexo: %s\nEmail: %s\nEndereço:\n%s\nValor hora: %s\nTítulo: %s\nCursos: %s",
                super.getName(), super.getCpf(), super.getPhone(), super.getGender().getAbbreviation(), super.getEmail(),
                super.getAddress(), this.hourlyRate, this.title.getTitleName(), getCoursesNames(this.courses));
    }

    private String getCoursesNames(List <Course> courses) {
        List <String> coursesNames = new ArrayList<>();
        courses.forEach(course -> coursesNames.add(course.getName()));
        return Arrays.toString(coursesNames.toArray());
    }
}
