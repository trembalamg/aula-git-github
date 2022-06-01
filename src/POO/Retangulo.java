package POO;

public class Retangulo {

	private float altura, largura;

	public Retangulo() {

		altura = 0;
		largura = 0;

	}

	public float getAltura() {
		return (altura);

	}

	public void setAltura(float alt) {

		altura = alt;

	}

	public float getLargura() {
		return (largura);

	}

	public void setLargura(float larg) {

		largura = larg;

	}

	public float calculaArea() {

		return altura * largura;

	}

	public float calculaPerimetro() {

		return 2 * altura + 2 * largura;

	}

	/**
	 * Metodo para exibir as informa��es do Ret�ngulo!!!
	 */
	public void exibe() {

		System.out.println(" Altura: " + getAltura() + "" + "\n" + " Largura: " + getLargura() + "\n" + " Area: "
				+ calculaArea() + "\n" + " Perimetro: " + calculaPerimetro());

	}
}
