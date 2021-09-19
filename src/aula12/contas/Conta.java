package aula12.contas;

import aula12.cadastro.Cliente;

public abstract class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente cliente;
    private ContaTipo contaTipo;

    public void depositar(double valor) {
        saldo += valor;
    }
    public abstract void sacar(double valor);
    protected void notificar() {
        // o protected é para que somente seus filhos consigam ver esse método
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ContaTipo getContaTipo() {
        return contaTipo;
    }

    public void setContaTipo(ContaTipo contaTipo) {
        this.contaTipo = contaTipo;
    }
}
