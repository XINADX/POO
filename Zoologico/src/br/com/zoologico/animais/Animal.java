package br.com.zoologico.animais;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInfo() {
        System.out.println("|	Nome: "+nome+"		|");
        System.out.println("|	Idade: "+idade+" anos			|");
    }
}
