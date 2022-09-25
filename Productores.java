public class Productores {

	private String nombre;
	Componente_Biotico PartOf;

	public Productores(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void printProductores() {
		System.out.println(getNombre());
	}
}