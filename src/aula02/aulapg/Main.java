package aula02.aulapg;

public class Main {
    public static void main(String[] args) {
        //ex variaveis
        int num1 = 30;
        int num2 = 5;
        int result = num1%num2;

        if(result == 0) {
            System.out.println(num1/num2);
        } else {
            System.out.println("A divisao nao eh exata"); //testei e deu certo
        }

        //ex linguagem java 01
        String text1 = "Helena";
        String text2 = "Helena";

        if(text1.equals(text2)) {
            System.out.println("As duas strings sao iguais");
        } else {
            System.out.println("As duas strings sao diferentes"); //testei e deu certo
        }

        //ex linguagem java 02
        Integer num3 = 50;
        Integer num4 = new Integer(30); //soh para ter registrado os dois jeitos de fazer

        if(num3.compareTo(num4) == 1) {
            System.out.println(num3 + " eh maior que " + num4);
        } else if (num3.compareTo(num4) == -1) {
            System.out.println(num4 + " eh maior que " +num3); //testei e deu certo
        } else {
            System.out.println("Os numeros sao iguais"); //testei e deu certo
        }
    }
}
