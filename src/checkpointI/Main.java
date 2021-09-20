package checkpointI;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course englishBeginnerCourse = new Course("English beginner", 700.0, "E01", Period.MORNING);
        Course englishIntermediateCourse = new Course("English intermediate", 700.0, "E02", Period.AFTERNOON);
        Course englishAdvancedCourse = new Course("English advanced", 700.0, "E03", Period.EVENING);

        Course technologyBeginnerCourse = new Course("Technology beginner", 800.0, "T01", Period.MORNING);
        Course technologyIntermediateCourse = new Course("Technology intermediate", 800.0, "T02", Period.AFTERNOON);
        Course technologyAdvancedCourse = new Course("Technology advanced", 800.0, "T03", Period.EVENING);

        Course administrationBeginnerCourse = new Course("Administration beginner", 850.0, "A01", Period.MORNING);
        Course administrationIntermediateCourse = new Course("Administration intermediate", 850.0, "A02", Period.AFTERNOON);
        Course administrationAdvancedCourse = new Course("Administration advanced", 850.0, "A03", Period.EVENING);

        List<Course> coursesStudent1 = new ArrayList<>();
        coursesStudent1.add(englishBeginnerCourse);
        coursesStudent1.add(technologyBeginnerCourse);

        Person student1 = new Student("Joao", "12345", "12345", Gender.MALE, "joao@gmail.com",
                new Address("Rua Primavera", (short)10, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent1);

        ((Student) student1).addCourse(administrationBeginnerCourse);

        List <Course> coursesStudent2 = new ArrayList<>();
        coursesStudent2.add(englishIntermediateCourse);
        coursesStudent2.add(technologyIntermediateCourse);
        coursesStudent2.add(administrationIntermediateCourse);

        Person student2 = new Student("Maria", "12346", "12346", Gender.FEMALE, "maria@gmail.com",
                new Address("Rua Inverno", (short)20, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent2);

        List <Course> coursesStudent3 = new ArrayList<>();
        coursesStudent3.add(englishAdvancedCourse);
        coursesStudent3.add(technologyAdvancedCourse);
        coursesStudent3.add(administrationAdvancedCourse);

        Person student3 = new Student("Pedro", "12347", "12347", Gender.MALE, "pedro@gmail.com",
                new Address("Rua Primavera", (short)30, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent3);

        List <Course> coursesStudent4 = new ArrayList<>();
        coursesStudent4.add(englishAdvancedCourse);
        coursesStudent4.add(technologyAdvancedCourse);
        coursesStudent4.add(administrationAdvancedCourse);

        Person student4 = new Student("Marcela", "12348", "12348", Gender.FEMALE, "marcela@gmail.com",
                new Address("Rua Inverno", (short)21, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent4);

        List <Course> coursesStudent5 = new ArrayList<>();
        coursesStudent5.add(englishBeginnerCourse);
        coursesStudent5.add(technologyBeginnerCourse);
        coursesStudent5.add(administrationBeginnerCourse);

        Person student5 = new Student("Alex", "12349", "12349", Gender.MALE, "alex@gmail.com",
                new Address("Rua Primavera", (short)10, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent5);

        List <Course> coursesStudent6 = new ArrayList<>();
        coursesStudent6.add(englishIntermediateCourse);
        coursesStudent6.add(technologyIntermediateCourse);
        coursesStudent6.add(administrationIntermediateCourse);

        Person student6 = new Student("Joana", "12350", "12350", Gender.FEMALE, "joana@gmail.com",
                new Address("Rua Inverno", (short)20, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent6);

        List <Course> coursesStudent7 = new ArrayList<>();
        coursesStudent7.add(englishAdvancedCourse);
        coursesStudent7.add(technologyAdvancedCourse);
        coursesStudent7.add(administrationAdvancedCourse);

        Person student7 = new Student("Rafael", "12351", "12351", Gender.MALE, "rafael@gmail.com",
                new Address("Rua Primavera", (short)30, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent7);


        List <Course> coursesTeacher1 = new ArrayList<>();
        coursesTeacher1.add(englishBeginnerCourse);
        coursesTeacher1.add(englishIntermediateCourse);

        Person teacher1 = new Teacher("Alessandra", "1234567", "987654", Gender.FEMALE, "teacher.alessandra@gmail.com",
                new Address("Rua Verao", (short) 22, "Estacoes", "1234567", "Campinas", "Sao Paulo"),
                coursesTeacher1, 100.0, Title.HIGHER_EDUCATION);

        ((Teacher) teacher1).addCourse(englishAdvancedCourse);

        englishBeginnerCourse.setTeacher(teacher1);
        englishIntermediateCourse.setTeacher(teacher1);
        englishAdvancedCourse.setTeacher(teacher1);

        List <Course> coursesTeacher2 = new ArrayList<>();
        coursesTeacher2.add(technologyBeginnerCourse);
        coursesTeacher2.add(technologyIntermediateCourse);
        coursesTeacher2.add(technologyAdvancedCourse);

        Person teacher2 = new Teacher("Patricia", "1234568", "987655", Gender.FEMALE, "teacher.patricia@gmail.com",
                new Address("Rua Verao", (short) 33, "Estacoes", "1234567", "Campinas", "Sao Paulo"),
                coursesTeacher2, 120.0, Title.POSTGRADUATE);

        technologyBeginnerCourse.setTeacher(teacher2);
        technologyIntermediateCourse.setTeacher(teacher2);
        technologyAdvancedCourse.setTeacher(teacher2);

        List <Course> coursesTeacher3 = new ArrayList<>();
        coursesTeacher3.add(administrationBeginnerCourse);
        coursesTeacher3.add(administrationIntermediateCourse);
        coursesTeacher3.add(administrationAdvancedCourse);

        Person teacher3 = new Teacher("Murilo", "1234569", "987656", Gender.MALE, "teacher.murilo@gmail.com",
                new Address("Rua Outono", (short) 33, "Estacoes", "1234567", "Campinas", "Sao Paulo"),
                coursesTeacher3, 110.0, Title.EXPERTISE);

        administrationBeginnerCourse.setTeacher(teacher3);
        administrationIntermediateCourse.setTeacher(teacher3);
        administrationAdvancedCourse.setTeacher(teacher3);

        List <Person> englishBeginnerCourseStudents = new ArrayList<>();
        englishBeginnerCourseStudents.add(student1);
        englishBeginnerCourseStudents.add(student5);

        englishBeginnerCourse.addStudents(englishBeginnerCourseStudents);

        List <Person> englishIntermediateCourseStudents = new ArrayList<>();
        englishIntermediateCourseStudents.add(student2);
        englishIntermediateCourseStudents.add(student6);

        englishIntermediateCourse.addStudents(englishIntermediateCourseStudents);

        List <Person> englishAdvancedCourseStudents = new ArrayList<>();
        englishAdvancedCourseStudents.add(student3);
        englishAdvancedCourseStudents.add(student4);

        englishAdvancedCourse.addStudents(englishAdvancedCourseStudents);

        englishAdvancedCourse.addStudent(student7);

        List <Person> technologyBeginnerCourseStudents = new ArrayList<>();
        technologyBeginnerCourseStudents.add(student1);
        technologyBeginnerCourseStudents.add(student5);

        technologyBeginnerCourse.addStudents(technologyBeginnerCourseStudents);

        List <Person> technologyIntermediateCourseStudents = new ArrayList<>();
        technologyIntermediateCourseStudents.add(student2);
        technologyIntermediateCourseStudents.add(student6);

        technologyIntermediateCourse.addStudents(technologyIntermediateCourseStudents);

        List <Person> technologyAdvancedCourseStudents = new ArrayList<>();
        technologyAdvancedCourseStudents.add(student3);
        technologyAdvancedCourseStudents.add(student4);
        technologyAdvancedCourseStudents.add(student7);

        technologyAdvancedCourse.addStudents(technologyAdvancedCourseStudents);

        List <Person> administrationBeginnerCourseStudents = new ArrayList<>();
        administrationBeginnerCourseStudents.add(student1);
        administrationBeginnerCourseStudents.add(student5);

        administrationBeginnerCourse.addStudents(administrationBeginnerCourseStudents);

        List <Person> administrationIntermediateCourseStudents = new ArrayList<>();
        administrationIntermediateCourseStudents.add(student2);
        administrationIntermediateCourseStudents.add(student6);

        administrationIntermediateCourse.addStudents(administrationIntermediateCourseStudents);

        List <Person> administrationAdvancedCourseStudents = new ArrayList<>();
        administrationAdvancedCourseStudents.add(student3);
        administrationAdvancedCourseStudents.add(student4);
        administrationAdvancedCourseStudents.add(student7);

        administrationAdvancedCourse.addStudents(administrationAdvancedCourseStudents);

        System.out.println(student1);
        System.out.println("*****");
        System.out.println(teacher1);
        System.out.println("*****");
        System.out.println(englishAdvancedCourse);
    }
}
