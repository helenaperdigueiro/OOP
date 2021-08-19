package aula06.impressora;

import java.time.LocalDate;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temFolha() {
        return folhasDisponiveis > 0;
    }
    public void imprimir(String texto) {
        if(temFolha()) {
            System.out.println(texto);
            this.folhasDisponiveis--;
        } else {
            System.out.println("Nao tem folha");
        }
    }
}
