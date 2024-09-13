package br.com.zoologico.main;

import br.com.zoologico.animais.*;

public class Main {
    public static void main(String[] args) {
    	System.out.println("+---------------------------------------+");
        Mamifero onca = new Mamifero("Onça Pintada", 3, "Camuflagem");
        onca.exibirInfo();
        onca.amamentar();
        System.out.println("+---------------------------------------+");
        

        System.out.println();

        System.out.println("+---------------------------------------+");
        Ave coruja = new Ave("Coruja Comum", 5, "Gancho");
        coruja.exibirInfo();
        coruja.migrar();
        System.out.println("+---------------------------------------+");
    }
}
