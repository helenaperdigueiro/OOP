package checkpointI;

import java.util.ArrayList;

public class Student extends Person {
    private static int count = 0;
    private ArrayList <Course> courses;
    private int id;

    public Student(String name, String cpf, String phone, Gender gender, String email, Address address, ArrayList<Course> courses) {
        super(name, cpf, phone, gender, email, address);
        this.courses = courses;
        this.id = ++count;
    }

    public int getId() {
        return this.id;
    }
}
