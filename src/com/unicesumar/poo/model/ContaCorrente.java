package com.unicesumar.poo.model;

public class ContaCorrente extends Conta {


    public ContaCorrente(int agencia, int conta, Double saldo) {
        super(agencia, conta, saldo);
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

    @Override
    public String toString() {
        return "ContaCorrente {" +
                "agencia:" + agencia +
                ", conta:" + conta +
                ", saldo: R$" + saldo +
                '}';
    }
}
