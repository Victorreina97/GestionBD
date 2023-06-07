package Usuario;

import java.sql.Date;
import java.time.LocalDate;

public class Actores {

	private String nombre;
	private String apellido;
	private String nacionalidad;

	public Actores(String nombre, String apellido, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Actores [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + "]";
	}

	public static Actores pedirActores() {

		return new Actores(PedirDatos.pedirNombreActor(), PedirDatos.pedirApellidoActor(),PedirDatos.pedirNacionalidad());
	}
}
