package br.com.zoologico.animais;

public class Ave extends Animal {
    private String tipoBico;

    public Ave(String nome, int idade, String tipoBico) {
        super(nome, idade);
        this.tipoBico = tipoBico;
    }
    
    public void migrar() {
    	System.out.println("|	Está migrando...		|");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("|	Tipo de Bico: "+tipoBico+"		|");
    }
}
