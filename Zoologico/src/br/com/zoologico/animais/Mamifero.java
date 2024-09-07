package br.com.zoologico.animais;

public class Mamifero extends Animal {
    private String tipoPelo;

    public Mamifero(String nome, int idade, String tipoPelo) {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }

    public void amamentar() {
    	System.out.println("|	Está amamentando...		|");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("|	Tipo de pelo: "+tipoPelo+"	|");
    }
}
