package curso;

public class Carro {

	int velocidadeAtual;

	void acelerar() {
		velocidadeAtual += 5;
	}

	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Velocidade atual é " + velocidadeAtual + "Km/h";
	}

}
