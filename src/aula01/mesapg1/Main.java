package aula01.mesapg1;

public class Main {
    public static void main(String[] args) {
        Mascote mascote1 = new Mascote("cachorro", "Shesheu", 2, 1.5f, "au au");
        Mascote mascote2 = new Mascote("peixe", "Nemo", 1, 0.14f, "glub glub");
        Mascote mascote3 = new Mascote("gato", "Snow", 3, 0.5f, "miau miau");

        System.out.println("O " + mascote1.nome + " eh um " + mascote1.tipo + ", tem " + mascote1.idade +
                " ano(s), come " + mascote1.qtdComida + " kg de comida e faz \'" + mascote1.som + "\'.");
        System.out.println("O " + mascote2.nome + " eh um " + mascote2.tipo + ", tem " + mascote2.idade +
                " ano(s), come " + mascote2.qtdComida + " kg de comida e faz \'" + mascote2.som + "\'.");
        System.out.println("O " + mascote3.nome + " eh um " + mascote3.tipo + ", tem " + mascote3.idade +
                " ano(s), come " + mascote3.qtdComida + " kg de comida e faz \'" + mascote3.som + "\'.");
    }
}
