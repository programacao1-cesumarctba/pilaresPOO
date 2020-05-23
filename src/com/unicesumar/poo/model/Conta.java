package com.unicesumar.poo.model;

public abstract class Conta implements Operacao {

    protected int agencia;
    protected int conta;
    protected Double saldo;

    public Conta(){}

    public Conta(int agencia, int conta, Double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
