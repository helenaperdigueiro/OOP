package checkpointI;

import java.util.ArrayList;

public class Teacher extends Person{
    private ArrayList <Course> courses;
    private double hourlyRate;
    private Title title;

    public Teacher(String name, String cpf, String phone, Gender gender, String email, Address address, ArrayList<Course> courses, double hourlyRate, Title title) {
        super(name, cpf, phone, gender, email, address);
        this.courses = courses;
        this.hourlyRate = hourlyRate;
        this.title = title;
    }
}
