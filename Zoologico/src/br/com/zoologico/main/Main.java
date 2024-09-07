package br.com.zoologico.main;

import br.com.zoologico.animais.*;

public class Main {
    public static void main(String[] args) {
    	System.out.println("+---------------------------------------+");
        Mamifero leao = new Mamifero("Onça Pintada", 3, "Camuflagem");
        leao.exibirInfo();
        leao.amamentar();
        System.out.println("+---------------------------------------+");
        

        System.out.println();

        System.out.println("+---------------------------------------+");
        Ave aguia = new Ave("Coruja Comum", 5, "Gancho");
        aguia.exibirInfo();
        aguia.migrar();
        System.out.println("+---------------------------------------+");
    }
}
