package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o número");
		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			JOptionPane.showConfirmDialog(null, "Número par!");
		} else {
			JOptionPane.showConfirmDialog(null, "Número ímpar!");
		}
	}

}
