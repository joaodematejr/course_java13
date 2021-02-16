package curso;

public class Heroi extends Jogador {
	
	Heroi(int x, int y){
		super(x, y);
	}

	boolean atacar(Jogador opJogador) {
		boolean ataque1 = super.atacar(opJogador);
		boolean ataque2 = super.atacar(opJogador);
		boolean ataque3 = super.atacar(opJogador);
		return ataque1 || ataque2 || ataque3;
	}
}
