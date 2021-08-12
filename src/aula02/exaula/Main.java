package aula02.exaula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String meuPrimeiroNome;
        System.out.println("Digite seu nome");
        meuPrimeiroNome = scanner.next();
        System.out.println("Meu nome é:" + meuPrimeiroNome);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Minha idade é: " + idade);

    }
}
