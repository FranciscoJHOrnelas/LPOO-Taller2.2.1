public class Componente_Biotico {

	private String nombre;

	public Componente_Biotico(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void printComponente_Biotico() {
		System.out.println(getNombre());
	}
}