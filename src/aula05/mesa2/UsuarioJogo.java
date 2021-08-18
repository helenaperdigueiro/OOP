package aula05.mesa2;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }
    public void aumentarPontuacao() {
        this.pontuacao += 10;
    }
    public void subirNivel() {
        this.nivel++;
    }
    public void bonus(int valor) {
        this.pontuacao += valor;
    }

    public String getNome() {
        return nome;
    }

    public String getNickname() {
        return nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }
}
