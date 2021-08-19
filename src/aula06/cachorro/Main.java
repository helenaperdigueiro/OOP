package aula06.cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Yorkshire", 2020,
                2.5f, true, false, "Belinha");
        Cachorro cachorro2 = new Cachorro("Caramelo", false);
        Cachorro cachorro3 = new Cachorro("Poodle", 2019, 4.5f,
                false, false, "Bolacha");

        System.out.println(cachorro1.isEstaParaAdocao());
        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getAnoNascimento());
        cachorro2.setAnoNascimento(2018);
        cachorro2.setRaca("Viralata");
        cachorro2.setTemChip(false);
        cachorro2.setPeso(10);
        System.out.println(cachorro2.getRaca());
        System.out.println(cachorro2.getAnoNascimento());

        cachorro1.colocarParaAdocao();
        System.out.println(cachorro1.isEstaParaAdocao());
        cachorro2.colocarParaAdocao();
        System.out.println(cachorro2.isEstaParaAdocao());

        cachorro1.adotar();
        cachorro2.adotar();
        System.out.println(cachorro2.isEstaParaAdocao());

        System.out.println(cachorro1.calcularIdade(2021));
    }
}
