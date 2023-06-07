package Usuario;

import java.util.Scanner;

public class PedirDatos {


	public static String pedirTitulo() {

		String Titulo;
		Scanner lector = new Scanner(System.in);

		System.out.println("Dime el Titulo");
		Titulo = lector.nextLine();

		return Titulo;
	}

	public static String pedirGenero() {

		String genero;
		Scanner lector = new Scanner(System.in);

		System.out.println("Dime el genero de la pelicula");
		genero = lector.nextLine();

		return genero;
	}
	
	public static int pedirAno() {

		int ano;
		Scanner lector = new Scanner(System.in);

		System.out.println("Dime el año ");
		ano = lector.nextInt();

		return ano;
	}
	
	public static String pedirNombreActor() {

		String Nombre;
		Scanner lector = new Scanner(System.in);

		System.out.println("Dime el Nombre");
		Nombre = lector.nextLine();

		return Nombre;
	}
	
	public static String pedirApellidoActor() {

		String Apellido;
		Scanner lector = new Scanner(System.in);

		System.out.println("Dime el Apellido");
		Apellido = lector.nextLine();

		return Apellido;
	}
	
	
	
	
	public static String pedirNacionalidad() {

		String nacionalidad;
		Scanner lector = new Scanner(System.in);

		System.out.println("Dime la Nacionalidad");
		nacionalidad = lector.nextLine();

		return nacionalidad;
	}
	
	
	
	

}

