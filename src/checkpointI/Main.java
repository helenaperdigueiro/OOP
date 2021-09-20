package checkpointI;

import java.util.ArrayList;

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

        ArrayList <Course> coursesStudent1 = new ArrayList<>();
        coursesStudent1.add(englishBeginnerCourse);
        coursesStudent1.add(technologyBeginnerCourse);
        coursesStudent1.add(administrationBeginnerCourse);

        Person student1 = new Student("Joao", "12345", "12345", Gender.MALE, "joao@gmail.com",
                new Address("Rua Primavera", (short)10, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent1);

        ArrayList <Course> coursesStudent2 = new ArrayList<>();
        coursesStudent2.add(englishIntermediateCourse);
        coursesStudent2.add(technologyIntermediateCourse);
        coursesStudent2.add(administrationIntermediateCourse);

        Person student2 = new Student("Maria", "12346", "12346", Gender.FEMALE, "maria@gmail.com",
                new Address("Rua Inverno", (short)20, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent2);

        ArrayList <Course> coursesStudent3 = new ArrayList<>();
        coursesStudent3.add(englishAdvancedCourse);
        coursesStudent3.add(technologyAdvancedCourse);
        coursesStudent3.add(administrationAdvancedCourse);

        Person student3 = new Student("Pedro", "12347", "12347", Gender.MALE, "pedro@gmail.com",
                new Address("Rua Primavera", (short)30, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent3);

        ArrayList <Course> coursesStudent4 = new ArrayList<>();
        coursesStudent4.add(englishAdvancedCourse);
        coursesStudent4.add(technologyAdvancedCourse);
        coursesStudent4.add(administrationAdvancedCourse);

        Person student4 = new Student("Marcela", "12348", "12348", Gender.FEMALE, "marcela@gmail.com",
                new Address("Rua Inverno", (short)21, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent4);

        ArrayList <Course> coursesStudent5 = new ArrayList<>();
        coursesStudent5.add(englishBeginnerCourse);
        coursesStudent5.add(technologyBeginnerCourse);
        coursesStudent5.add(administrationBeginnerCourse);

        Person student5 = new Student("Alex", "12349", "12349", Gender.MALE, "alex@gmail.com",
                new Address("Rua Primavera", (short)10, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent5);

        ArrayList <Course> coursesStudent6 = new ArrayList<>();
        coursesStudent6.add(englishIntermediateCourse);
        coursesStudent6.add(technologyIntermediateCourse);
        coursesStudent6.add(administrationIntermediateCourse);

        Person student6 = new Student("Joana", "12350", "12350", Gender.FEMALE, "joana@gmail.com",
                new Address("Rua Inverno", (short)20, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent6);

        ArrayList <Course> coursesStudent7 = new ArrayList<>();
        coursesStudent7.add(englishAdvancedCourse);
        coursesStudent7.add(technologyAdvancedCourse);
        coursesStudent7.add(administrationAdvancedCourse);

        Person student7 = new Student("Rafael", "12351", "12351", Gender.MALE, "rafael@gmail.com",
                new Address("Rua Primavera", (short)30, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent7);

        ArrayList <Course> coursesStudent8 = new ArrayList<>();
        coursesStudent8.add(englishAdvancedCourse);
        coursesStudent8.add(technologyAdvancedCourse);
        coursesStudent8.add(administrationAdvancedCourse);

        Person student8 = new Student("Mariana", "12352", "12352", Gender.FEMALE, "mariana@gmail.com",
                new Address("Rua Inverno", (short)21, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent8);

        ArrayList <Course> coursesStudent9 = new ArrayList<>();
        coursesStudent9.add(englishAdvancedCourse);
        coursesStudent9.add(technologyAdvancedCourse);
        coursesStudent9.add(administrationAdvancedCourse);

        Person student9 = new Student("Helena", "12353", "12353", Gender.FEMALE, "helena@gmail.com",
                new Address("Rua Inverno", (short)21, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent9);

        ArrayList <Course> coursesStudent10 = new ArrayList<>();
        coursesStudent10.add(englishAdvancedCourse);
        coursesStudent10.add(technologyAdvancedCourse);
        coursesStudent10.add(administrationAdvancedCourse);

        Person student10 = new Student("Isabela", "12354", "12354", Gender.FEMALE, "isabela@gmail.com",
                new Address("Rua Inverno", (short)21, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent10);

        ArrayList <Course> coursesStudent11 = new ArrayList<>();
        coursesStudent11.add(englishAdvancedCourse);
        coursesStudent11.add(technologyAdvancedCourse);
        coursesStudent11.add(administrationAdvancedCourse);

        Person student11 = new Student("Carolina", "12355", "12355", Gender.FEMALE, "carolina@gmail.com",
                new Address("Rua Inverno", (short)21, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent11);

        ArrayList <Course> coursesStudent12 = new ArrayList<>();
        coursesStudent12.add(englishAdvancedCourse);
        coursesStudent12.add(technologyAdvancedCourse);
        coursesStudent12.add(administrationAdvancedCourse);

        Person student12 = new Student("Roberta", "12356", "12356", Gender.FEMALE, "roberta@gmail.com",
                new Address("Rua Inverno", (short)21, "Estacoes", "12346", "Campinas", "Sao Paulo"),
                coursesStudent12);

        ArrayList <Course> coursesStudent13 = new ArrayList<>();
        coursesStudent13.add(englishAdvancedCourse);
        coursesStudent13.add(technologyAdvancedCourse);
        coursesStudent13.add(administrationAdvancedCourse);

        Person student13 = new Student("Roberto", "12357", "12357", Gender.MALE, "roberto@gmail.com",
                new Address("Rua Primavera", (short)30, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent13);

        ArrayList <Course> coursesStudent14 = new ArrayList<>();
        coursesStudent14.add(englishAdvancedCourse);
        coursesStudent14.add(technologyAdvancedCourse);
        coursesStudent14.add(administrationAdvancedCourse);

        Person student14 = new Student("Matheus", "12358", "12358", Gender.MALE, "matheus@gmail.com",
                new Address("Rua Primavera", (short)30, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent14);

        ArrayList <Course> coursesStudent15 = new ArrayList<>();
        coursesStudent15.add(englishAdvancedCourse);
        coursesStudent15.add(technologyAdvancedCourse);
        coursesStudent15.add(administrationAdvancedCourse);

        Person student15 = new Student("Fabio", "12359", "12359", Gender.MALE, "fabio@gmail.com",
                new Address("Rua Primavera", (short)30, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent15);

        ArrayList <Course> coursesStudent16 = new ArrayList<>();
        coursesStudent16.add(englishAdvancedCourse);
        coursesStudent16.add(technologyAdvancedCourse);
        coursesStudent16.add(administrationAdvancedCourse);

        Person student16 = new Student("Thiago", "12360", "12360", Gender.MALE, "thiago@gmail.com",
                new Address("Rua Primavera", (short)30, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent16);

        ArrayList <Course> coursesStudent17 = new ArrayList<>();
        coursesStudent17.add(englishAdvancedCourse);
        coursesStudent17.add(technologyAdvancedCourse);
        coursesStudent17.add(administrationAdvancedCourse);

        Person student17 = new Student("Diego", "12361", "12361", Gender.MALE, "diego@gmail.com",
                new Address("Rua Primavera", (short)30, "Estacoes", "12345", "Campinas", "Sao Paulo"),
                coursesStudent17);

        ArrayList <Course> coursesTeacher1 = new ArrayList<>();
        coursesTeacher1.add(englishBeginnerCourse);
        coursesTeacher1.add(englishIntermediateCourse);
        coursesTeacher1.add(englishAdvancedCourse);

        Person teacher1 = new Teacher("Alessandra", "1234567", "987654", Gender.FEMALE, "teacher.alessandra@gmail.com",
                new Address("Rua Verao", (short) 22, "Estacoes", "1234567", "Campinas", "Sao Paulo"),
                coursesTeacher1, 100.0, Title.HIGHER_EDUCATION);

        ArrayList <Course> coursesTeacher2 = new ArrayList<>();
        coursesTeacher2.add(technologyBeginnerCourse);
        coursesTeacher2.add(technologyIntermediateCourse);
        coursesTeacher2.add(technologyAdvancedCourse);

        Person teacher2 = new Teacher("Patricia", "1234568", "987655", Gender.FEMALE, "teacher.patricia@gmail.com",
                new Address("Rua Verao", (short) 33, "Estacoes", "1234567", "Campinas", "Sao Paulo"),
                coursesTeacher2, 120.0, Title.POSTGRADUATE);

        ArrayList <Course> coursesTeacher3 = new ArrayList<>();
        coursesTeacher3.add(administrationBeginnerCourse);
        coursesTeacher3.add(administrationIntermediateCourse);
        coursesTeacher3.add(administrationAdvancedCourse);

        Person teacher3 = new Teacher("Murilo", "1234569", "987656", Gender.MALE, "teacher.murilo@gmail.com",
                new Address("Rua Outono", (short) 33, "Estacoes", "1234567", "Campinas", "Sao Paulo"),
                coursesTeacher3, 110.0, Title.EXPERTISE);

        ArrayList <Person> englishBeginnerCourseStudents = new ArrayList<>();
        englishBeginnerCourseStudents.add(student1);
        englishBeginnerCourseStudents.add(student5);

        ArrayList <Person> englishIntermediateCourseStudents = new ArrayList<>();
        englishIntermediateCourseStudents.add(student2);
        englishIntermediateCourseStudents.add(student6);

        ArrayList <Person> englishAdvancedCourseStudents = new ArrayList<>();
        englishAdvancedCourseStudents.add(student3);
        englishAdvancedCourseStudents.add(student4);
        englishAdvancedCourseStudents.add(student7);
        englishAdvancedCourseStudents.add(student8);
        englishAdvancedCourseStudents.add(student9);
        englishAdvancedCourseStudents.add(student10);
        englishAdvancedCourseStudents.add(student11);
        englishAdvancedCourseStudents.add(student12);
        englishAdvancedCourseStudents.add(student13);
        englishAdvancedCourseStudents.add(student14);
        englishAdvancedCourseStudents.add(student15);
        englishAdvancedCourseStudents.add(student16);
        englishAdvancedCourseStudents.add(student17);

        ArrayList <Person> technologyBeginnerCourseStudents = new ArrayList<>();
        technologyBeginnerCourseStudents.add(student1);
        technologyBeginnerCourseStudents.add(student5);

        ArrayList <Person> technologyIntermediateCourseStudents = new ArrayList<>();
        technologyIntermediateCourseStudents.add(student2);
        technologyIntermediateCourseStudents.add(student6);

        ArrayList <Person> technologyAdvancedCourseStudents = new ArrayList<>();
        technologyAdvancedCourseStudents.add(student3);
        technologyAdvancedCourseStudents.add(student4);
        technologyAdvancedCourseStudents.add(student7);
        technologyAdvancedCourseStudents.add(student8);
        technologyAdvancedCourseStudents.add(student9);
        technologyAdvancedCourseStudents.add(student10);
        technologyAdvancedCourseStudents.add(student11);
        technologyAdvancedCourseStudents.add(student12);
        technologyAdvancedCourseStudents.add(student13);
        technologyAdvancedCourseStudents.add(student14);
        technologyAdvancedCourseStudents.add(student15);
        technologyAdvancedCourseStudents.add(student16);
        technologyAdvancedCourseStudents.add(student17);

        ArrayList <Person> administrationBeginnerCourseStudents = new ArrayList<>();
        administrationBeginnerCourseStudents.add(student1);
        administrationBeginnerCourseStudents.add(student5);

        ArrayList <Person> administrationIntermediateCourseStudents = new ArrayList<>();
        administrationIntermediateCourseStudents.add(student2);
        administrationIntermediateCourseStudents.add(student6);

        ArrayList <Person> administrationAdvancedCourseStudents = new ArrayList<>();
        administrationAdvancedCourseStudents.add(student3);
        administrationAdvancedCourseStudents.add(student4);
        administrationAdvancedCourseStudents.add(student7);
        administrationAdvancedCourseStudents.add(student8);
        administrationAdvancedCourseStudents.add(student9);
        administrationAdvancedCourseStudents.add(student10);
        administrationAdvancedCourseStudents.add(student11);
        administrationAdvancedCourseStudents.add(student12);
        administrationAdvancedCourseStudents.add(student13);
        administrationAdvancedCourseStudents.add(student14);
        administrationAdvancedCourseStudents.add(student15);
        administrationAdvancedCourseStudents.add(student16);
        administrationAdvancedCourseStudents.add(student17);



        System.out.println(student1);
        System.out.println(teacher1);
    }
}
