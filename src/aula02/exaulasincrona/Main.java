package aula02.exaulasincrona;

import java.util.Scanner;

//Digite seu nome e sobrenome separadamente, a partir dessas variáveis obtenha em uma terceira, suas iniciais e
// sua data de nascimento, para a data digite 3 valores que representam dia, mês e ano.
// Em seguida, exiba uma mensagem, como se fosse um token, com seu nomes, as iniciais do seu nome e sobrenome e
// sua data de nascimento no formato "dd / mm / aaaa"
// Nota: Use alguma função para resolver, por exemplo, dados os 3 valores, retorne a data como uma string.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu primeiro nome:");
        String nome = scanner.nextLine();
        System.out.println("Insira seu sobrenome:");
        String sobrenome = scanner.nextLine();
        String nomeCompleto = nome + " " + sobrenome;
        String iniciais = String.format("%s.%s.", nome.substring(0,1), sobrenome.substring(0,1));

        System.out.println("Digite o dia do seu nascimento: ");
        int dia = scanner.nextInt();
        System.out.println("Digite o mes do seu nascimento: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano do seu nascimento: ");
        int ano = scanner.nextInt();

        String dataFormatada = formatadorDeData(dia, mes, ano);

        System.out.println("Nome completo: " + nomeCompleto + "\nIniciais: " + iniciais + "\nData de nascimento: " + dataFormatada);

    }
    static String formatadorDeData(int dia, int mes, int ano) {
        return dia + "/" + mes + "/" + ano;
    }
}
