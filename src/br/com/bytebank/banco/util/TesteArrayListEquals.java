package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

//        Conta cc1 = new ContaCorrente(22, 22);
//        Conta cc2 = new ContaCorrente(22, 22);
//
//        boolean igual = cc1.ehIgual(cc2);
//        System.out.println(igual);

        ArrayList<Conta> list = new ArrayList<>();

        Conta cc = new ContaCorrente(22, 11);
        list.add(cc);
        Conta cc2 = new ContaCorrente(22, 22);
        list.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);
        boolean existe = list.contains(cc3);

        System.out.println("Já existe? " + existe);

        for (Object oRef : list) {
            System.out.println(oRef);
        }
    }
}
