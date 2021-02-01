package classe;

public class Usuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object objeto) {
		// TODO Auto-generated method stub

		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return emailIgual && nomeIgual;
		} else {
			return false;
		}

	}

}
