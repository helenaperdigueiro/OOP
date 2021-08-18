package aula05.mesa2;

public class Main {
    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo("Joao", "joaozinho");
        UsuarioJogo usuario2 = new UsuarioJogo("Maria", "mariazinha");

        usuario1.aumentarPontuacao();
        System.out.println(usuario1.getPontuacao());
        usuario1.bonus(1000);
        System.out.println(usuario1.getPontuacao());

        System.out.println(usuario2.getPontuacao());
        usuario2.aumentarPontuacao();
        usuario2.bonus(500);
        System.out.println(usuario2.getPontuacao());

        usuario1.subirNivel();
        usuario1.subirNivel();
        usuario1.subirNivel();
        System.out.println(usuario1.getNivel());

        usuario2.subirNivel();
        usuario2.subirNivel();
        System.out.println();
    }
}
