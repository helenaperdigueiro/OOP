package aula04.teste;

public class Pessoa {
    String nome;
    int idade;
    static String raca;
    static int contador; //quando usa static nao pertence ao objeto e sim a classe

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;
    }
    public String toString() {
        return "nome: " + this.nome + "\nidade: " + this.idade + "\nraca: " + raca + "\ncontador: " + contador;
    }
}
