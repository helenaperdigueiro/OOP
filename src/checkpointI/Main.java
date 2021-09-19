package checkpointI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course englishBeginnerCourse = new Course(700.0, "English beginner", Period.MORNING);
        Course englishIntermediateCourse = new Course(700.0, "English intermediate", Period.AFTERNOON);
        Course englishAdvancedCourse = new Course(700.0, "English advanced", Period.EVENING);

        Course technologyBeginnerCourse = new Course(800.0, "Technology beginner", Period.MORNING);
        Course technologyIntermediateCourse = new Course(800.0, "Technology intermediate", Period.AFTERNOON);
        Course technologyAdvancedCourse = new Course(800.0, "Technology advanced", Period.EVENING);

        Course administrationBeginnerCourse = new Course(850.0, "Technology beginner", Period.MORNING);
        Course administrationIntermediateCourse = new Course(850.0, "Technology intermediate", Period.AFTERNOON);
        Course administrationAdvancedCourse = new Course(850.0, "Technology advanced", Period.EVENING);

        ArrayList <Course> coursesStudent1 = new ArrayList<>();
        coursesStudent1.add(englishBeginnerCourse);
        coursesStudent1.add(technologyBeginnerCourse);
        coursesStudent1.add(administrationBeginnerCourse);

        Student student1 = new Student("Joao", "12345", "12345", Gender.MALE, "joao@gmail.com",
                new Address("Rua Primavera", (short)10, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent1);

        Student student2 = new Student("Maria", "12346", "12346", Gender.FEMALE, "maria@gmail.com",
                new Address("Rua Inverno", (short)20, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent1);

        System.out.println(student1.getId());
        System.out.println(student2.getId());
    }
}
