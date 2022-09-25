public class Consumidores {

	private String nombre;
	Componente_Biotico PartOf;

	public Consumidores(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void printConsumidores() {
		System.out.println(getNombre());
	}
}