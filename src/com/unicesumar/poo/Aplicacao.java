package com.unicesumar.poo;

import com.unicesumar.poo.model.Conta;
import com.unicesumar.poo.model.ContaCorrente;
import com.unicesumar.poo.model.ContaPoupanca;

public class Aplicacao {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente(1452, 5555, 500.0);
        System.out.println(cc);
        cc.sacar(154.50);
        System.out.println(cc);
        cc.depositar(100.0);
        System.out.println(cc);

        Conta cp = new ContaPoupanca(1457, 7874, 100.0, 0.1);
        System.out.println(cp);
    }
}
