package projeto;

public class Iris {

	private double comprimentoSepala;
	private double larguraSepala;
	private double comprimentoPetala;
	private double larguraPetala;
	private String tipo;

	public Iris(double comprimentoSepala, double larguraSepala, double comprimentoPetala, double larguraPetala,
			String tipo) {
		this.comprimentoSepala = comprimentoSepala;
		this.larguraSepala = larguraSepala;
		this.comprimentoPetala = comprimentoPetala;
		this.larguraPetala = larguraPetala;
		this.tipo = tipo;
	}

	public double getComprimentoSepala() {
		return comprimentoSepala;
	}

	public void setComprimentoSepala(double comprimentoSepala) {
		this.comprimentoSepala = comprimentoSepala;
	}

	public double getLarguraSepala() {
		return larguraSepala;
	}

	public void setLarguraSepala(double larguraSepala) {
		this.larguraSepala = larguraSepala;
	}

	public double getComprimentoPetala() {
		return comprimentoPetala;
	}

	public void setComprimentoPetala(double comprimentoPetala) {
		this.comprimentoPetala = comprimentoPetala;
	}

	public double getLarguraPetala() {
		return larguraPetala;
	}

	public void setLarguraPetala(double larguraPetala) {
		this.larguraPetala = larguraPetala;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
