package aula04.teste;

public class Main {
    public static void main(String[] args) {
        Pessoa.raca = "humano";

        Pessoa pessoa1 = new Pessoa("Helena", 30);
        System.out.println(pessoa1);

        Pessoa pessoa2 = new Pessoa("Alex", 44);
        System.out.println(pessoa2);

        System.out.println(Pessoa.contador); //usei a variavel da classe
    }
}
