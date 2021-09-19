package aula12.contas;

public enum ContaTipo {
    CORRENTE("Corrente"),
    POUPANCA("Poupanca"),
    SALARIO("Salario");

    private String tipo;

    ContaTipo(String tipo) {
        this.tipo = tipo;
    }
}
