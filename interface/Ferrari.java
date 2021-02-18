package curso;

public class Ferrari extends Carro implements Esportivo{

	public Ferrari() {
		// TODO Auto-generated constructor stub
		this(315);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}

	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		// super.acelerar();
		velocidadeAtual += 15;
	}

	public void ligarTurbo() {
		// TODO Auto-generated method stub
		delta = 90;
	}

	public void desligarTurbo() {
		// TODO Auto-generated method stub
		delta = 15;
	}
}
