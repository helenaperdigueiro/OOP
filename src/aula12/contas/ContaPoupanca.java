package aula12.contas;

public class ContaPoupanca extends Conta {
    @Override
    public void sacar(double valor) {
        if(this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
        }
    }
    public void calcularRendimentos() {
    }
}
