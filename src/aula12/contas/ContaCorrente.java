package aula12.contas;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    @Override
    public void sacar(double valor) {
        if(this.getSaldo() + this.chequeEspecial >= valor) {
            this.setSaldo(this.getSaldo() - valor);
        }
    }
    public void calcularCustoChequeEspecial() {
    }
}
