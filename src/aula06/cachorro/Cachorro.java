package aula06.cachorro;

public class Cachorro {
    private boolean estaParaAdocao;
    private String raca;
    private int anoNascimento;
    private float peso;
    private boolean temChip;
    private boolean estaFerido;
    private String nome;

    public Cachorro(String raca,
                    int anoNascimento,
                    float peso,
                    boolean temChip,
                    boolean estaFerido,
                    String nome) {
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.temChip = temChip;
        this.estaFerido = estaFerido;
        this.nome = nome;
    }
    public Cachorro(String nome, boolean estaFerido) {
        this.nome = nome;
        this.estaFerido = estaFerido;
    }
    public void colocarParaAdocao() {
        if(!this.estaFerido && this.peso > 5) {
            estaParaAdocao = true;
        } else {
            estaParaAdocao = false;
        }
    }
    public void adotar() {
        if(estaParaAdocao) {
            System.out.println("Parabens! Voce adotou um caozinho! =)");
            estaParaAdocao = false;
        } else {
            System.out.println("Que pena! Este caozinho nao esta para adocao! =(");
        }
    }

    public boolean isEstaParaAdocao() {
        return estaParaAdocao;
    }

    public String getRaca() {
        return raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isTemChip() {
        return temChip;
    }

    public boolean isEstaFerido() {
        return estaFerido;
    }

    public String getNome() {
        return nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setTemChip(boolean temChip) {
        this.temChip = temChip;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - this.anoNascimento;
    }
}
