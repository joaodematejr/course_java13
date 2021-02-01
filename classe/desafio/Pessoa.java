package classe.desafio;

public class Pessoa {

	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}

	String apresentar() {
		return "Olá eu sou " + nome + " e tenho " + peso + "Kgs.";
	}

}
