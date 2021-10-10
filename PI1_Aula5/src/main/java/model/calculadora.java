// arquivo Calculadora.java (camada Model)

package model; // coloque a classe dentro de um pacote

public class calculadora {
	public int calcular(String paramNum1, String paramNum2, String paramOperacao) {
		int num1 = Integer.parseInt(paramNum1);
		int num2 = Integer.parseInt(paramNum2);
		int total = 0;
		if (paramOperacao.equals("somar")) {
			total = num1 + num2;
		} else {
			total = num1 * num2;
		}
		return total;
	}
}
