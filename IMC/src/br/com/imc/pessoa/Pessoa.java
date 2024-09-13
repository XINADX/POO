package br.com.imc.pessoa;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	private double imc;
	
	/*public Pessoa(String nome, double peso, double altura, double imc) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
	}*/
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		do {
			if((peso <= 0) || (peso > 597)) {
				System.out.println("Peso inválido! Programa encerrado.");
				System.exit(1);
			} else {
				this.peso = peso;
			}
		} while((peso <= 0) || (peso > 597));
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if((altura <= 0) || (altura > 2.51)) {
			System.out.println("Altura inválida! Programa encerrado.");
			System.exit(1);
		} else {
			this.altura = altura;
		} 
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public void calcularImc() {
		setImc(this.peso / (this.altura * this.altura));
	}
	
	public void exibirInfo() {
		System.out.println("Nome: "+getNome());
		System.out.println(String.format("Peso: %.2fkg", getPeso()));
		System.out.println(String.format("Altura: %.2fm", getAltura()));
		System.out.println(String.format("IMC: %.2f", getImc()));
	}
}