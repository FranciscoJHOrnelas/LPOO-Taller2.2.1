import java.util.function.DoubleBinaryOperator;

public class Temperatura {

	private double grados_centigrados;
	Componente_Abiotico PartOf;

	public Temperatura(double c) {
		this.grados_centigrados = c;
	}

	public double getGrados_centigrados() {
		return this.grados_centigrados;
	}

	public void setGrados_centigrados(double grados_centigrados) {
		this.grados_centigrados = grados_centigrados;
	}

	public void printTemperatura() {
		System.out.println(getGrados_centigrados());
	}
}