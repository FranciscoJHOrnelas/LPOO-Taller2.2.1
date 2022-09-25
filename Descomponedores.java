public class Descomponedores {

	private String nombre;
	Componente_Biotico PartOf;

	public Descomponedores(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void printDescomponedores() {
		System.out.println(getNombre());
	}
}