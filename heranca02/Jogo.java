package curso;

public class Jogo {

	public static void main(String[] args) {
		Mostro mostro = new Mostro();

		mostro.x = 10;
		mostro.y = 10;

		Heroi heroi = new Heroi();

		heroi.x = 10;
		heroi.y = 11;

		System.out.println("Monstro tem => " + mostro.vida);
		System.out.println("Heroi tem = > " + heroi.vida);

		mostro.atacar(heroi);
		heroi.atacar(mostro);
		
		mostro.andar(Direcao.NORTE);
		mostro.atacar(heroi);
		heroi.atacar(mostro);
		
		//mostro.andar(Direcao.NORTE);
		mostro.atacar(heroi);
		heroi.atacar(mostro);

		System.out.println("Monstro tem => " + mostro.vida);
		System.out.println("Heroi tem = > " + heroi.vida);
	}

}
