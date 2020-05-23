package com.unicesumar.poo.model;

public class ContaPoupanca extends Conta {

    private Double jurosPoupanca;

    public ContaPoupanca(int agencia, int conta, Double saldo, Double jurosPoupanca) {
        super(agencia, conta, saldo);
        this.jurosPoupanca = jurosPoupanca;
    }

    @Override
    public void sacar(Double qtd) {
        if(super.getSaldo() > 0.0 && qtd < super.getSaldo()) {
            Double valor = super.saldo - qtd;
            super.setSaldo(valor);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(Double qtd) {

        Double valor = super.saldo + qtd;
        super.setSaldo(valor);

    }

    public Double getJurosPoupanca() {
        return jurosPoupanca;
    }

    public void setJurosPoupanca(Double jurosPoupanca) {
        this.jurosPoupanca = jurosPoupanca;
    }

    public void saldoComJuros(Double saldo) {
        Double valor = super.getSaldo() + (getJurosPoupanca() * saldo);
        super.setSaldo(valor);
    }

    @Override
    public String toString() {
        return "ContaPoupanca {" +
                "agencia: " + agencia +
                ", conta: " + conta +
                ", saldo: R$" + saldo +
                '}';
    }
}
