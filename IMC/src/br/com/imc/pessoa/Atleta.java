package br.com.imc.pessoa;

public class Atleta extends Pessoa {
	private String esportePraticado;
	
	/*public Atleta(String nome, double peso, double altura, double imc, String esportePraticado) {
		super(nome, peso, altura, imc);
		this.esportePraticado = esportePraticado;
	}*/

	public String getEsportePraticado() {
		return esportePraticado;
	}

	public void setEsportePraticado(String esportePraticado) {
		this.esportePraticado = esportePraticado;
	}
	
	@Override
	public void calcularImc() {
		super.calcularImc();
		super.setImc(getImc() * 0.95);
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Esporte: "+getEsportePraticado());
	}
}