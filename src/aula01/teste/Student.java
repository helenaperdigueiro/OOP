package aula01.teste;

public class Student {
    public String name;
    public int absences;
    public float[] grades;
    public Student(String name, int absences, float[] grades) {
        this.name = name;
        this.absences = absences;
        this.grades = grades;
    }
    public float getFinal() {
        float gradesSum = 0.0f;
        for(int i=0; i<grades.length; i++) {
            gradesSum += grades[i];
        }
        return gradesSum/grades.length;
    }
}
//nao finalizado!!