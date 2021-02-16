package curso;

public class Ferrari extends Carro {

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
}
