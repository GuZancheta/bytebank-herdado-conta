package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

    public static void main(String[] args) {

        List<Conta> list = new ArrayList<>();

        Conta cc = new ContaCorrente(22, 11);
        list.add(cc);
        Conta cc2 = new ContaCorrente(22, 22);
        list.add(cc2);

        System.out.println("Tamanho: " + list.size());
        Conta ref = list.get(0);
        System.out.println(ref.getNumero());

        list.remove(0);

        System.out.println("Tamanho: " + list.size());

        Conta cc3 = new ContaCorrente(33, 311);
        list.add(cc3);
        Conta cc4 = new ContaCorrente(33, 322);
        list.add(cc4);

        for (Conta conta : list) {
            System.out.println(conta);
        }

        System.out.println("-----------");

        for (Object oRef : list) {
            System.out.println(oRef);
        }
    }
}
