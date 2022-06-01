/*
* Algoritmo que l� e valida os seguintes dados de um aluno:
* a. Nota: entre 0 e 10.
* b. Sal�rio: maior que zero.
* c. Sexo: m ou f.
* d. Idade: entre 6 e 150.
*/
package Refatoracao04;

import javax.swing.JOptionPane;

public class Ex01 {
	public static void main(String[] args) {
		// Declara��o de vari�veis:
		int idade = 0;
		String sexo = "", resp = null;
		boolean repetir = true;
		double nota = 0, salario = 0;
		/*-------------------------------
		* Leitura e valida��o da nota:
		*-------------------------------
		*/
		do {
			resp = JOptionPane.showInputDialog("Infome a nota [0, 10]", 0);
			// Verifica se o bot�o "cancelar foi pressionado."
			if (resp == null) {
				System.err.println("Aviso: o bot�o \"cancelar\" foi pressionado.");

				System.exit(1);
			}
			try {
				nota = Double.parseDouble(resp);
				if (nota >= 0 && nota <= 10)
					repetir = false;
				else
					repetir = true;
			} catch (NumberFormatException e) {
				System.err.println("ERRO: n�mero n�o identificado.");
				repetir = true;
			}
		} while (repetir == true);
		JOptionPane.showMessageDialog(null, "Nota informada: " + nota);
		/*---------------------------------
		* Leitura e valida��o do sal�rio:
		*---------------------------------
		*/
		do {
			resp = JOptionPane.showInputDialog("Infome o sal�rio", 0);
			// Verifica se o bot�o "cancelar foi pressionado."
			if (resp == null) {
				System.err.println("Aviso: o bot�o \"cancelar\" foi pressionado.");

				System.exit(1);
			}
			try {
				salario = Double.parseDouble(resp);
				if (salario > 0)
					repetir = false;
				else
					repetir = true;
			} catch (NumberFormatException e) {
				System.err.println("ERRO: n�mero n�o identificado.");
				repetir = true;
			}
		} while (repetir == true);
		JOptionPane.showMessageDialog(null, "Sal�rio informado: " + salario);
		/*-------------------------------
		* Leitura e valida��o do sexo:
		*-------------------------------
		*/
		do {
			sexo = JOptionPane.showInputDialog("Infome o sexo");
			// Verifica se o bot�o "cancelar foi pressionado."
			if (sexo == null) {
				System.err.println("Aviso: o bot�o \"cancelar\" foi pressionado.");

				System.exit(1);
			}
			if (sexo.equalsIgnoreCase("f") == true || sexo.equalsIgnoreCase("m")

					== true)

				repetir = false;
			else
				repetir = true;
		} while (repetir == true);
		JOptionPane.showMessageDialog(null, "Sexo informado: " + sexo);
		/*-------------------------------
		* Leitura e valida��o da idade:
		*-------------------------------
		*/
		do {
			resp = JOptionPane.showInputDialog("Infome a idade", 6);
			// Verifica se o bot�o "cancelar foi pressionado."
			if (resp == null) {
				System.err.println("Aviso: o bot�o \"cancelar\" foi	pressionado.");

				System.exit(1);
			}
			try {
				idade = Integer.parseInt(resp);
				if (idade >= 6 && idade <= 150)
					repetir = false;
				else
					repetir = true;
			} catch (NumberFormatException e) {
				System.err.println("ERRO: n�mero n�o identificado.");
				repetir = true;
			}
		} while (repetir == true);
		JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
	}
}
