package Datos;

//confirmar conexion:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import Usuario.PedirDatos;
import Usuario.Peliculas;

public class BaseDatos {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");

			conexion.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		}

		System.out.println("Conectado/desconectado");

	}

	public static void updatePeliculas(int numero) throws ClassNotFoundException {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado = 0;
		String sql = "";
		int id = numero;
		String titulo;
		int ano;
		String genero;

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");// proporcionamos
																								// la
																								// dirección, el
																								// administrador
																								// y
																								// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = (Statement) conexion.createStatement();

			titulo = PedirDatos.pedirTitulo();
			ano = PedirDatos.pedirAno();
			genero = PedirDatos.pedirGenero();

			sql = "UPDATE Peliculas SET idPeliculas = '" + id + "', titulo = '" + titulo + "', genero = '" + genero
					+ "', genero = '" + genero + "'  WHERE idPelicula = '" + id + "';";
			System.out.println(sql);
			// System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println("Se ha actualizado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void updateActores(int numero) throws ClassNotFoundException {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado = 0;
		String sql = "";
		int id = numero;
		String nombre;
		String apellido;
		String nacionalidad;

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");// proporcionamos
																								// la
																								// dirección, el
																								// administrador
																								// y
																								// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = (Statement) conexion.createStatement();

			nombre = PedirDatos.pedirNombreActor();
			apellido = PedirDatos.pedirApellidoActor();
			nacionalidad = PedirDatos.pedirNacionalidad();

			sql = "UPDATE Actores SET idActor = '" + id + "', nombre = '" + nombre + "', apellido = '" + apellido
					+ "', nacionalidad = '" + nacionalidad + "'  WHERE idPelicula = '" + id + "';";
			System.out.println(sql);
			// System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println("Se ha actualizado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void DeletePeliculas(int numero) throws ClassNotFoundException {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado = 0;
		String sql = "";
		int id = numero;
		String titulo;
		int ano;
		String genero;

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");// proporcionamos
																								// la
																								// dirección, el
																								// administrador
																								// y
																								// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = (Statement) conexion.createStatement();

			titulo = PedirDatos.pedirTitulo();
			ano = PedirDatos.pedirAno();
			genero = PedirDatos.pedirGenero();

			sql = "DELETE Peliculas SET idPeliculas = '" + id + "', titulo = '" + titulo + "', genero = '" + genero
					+ "', genero = '" + genero + "'  WHERE idPelicula = '" + id + "';";
			System.out.println(sql);
			// System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println("Se ha actualizado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void DeleteActores(int numero) throws ClassNotFoundException {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado = 0;
		String sql = "";
		int id = numero;
		String nombre;
		String apellido;
		String nacimiento;
		String nacionalidad;

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");// proporcionamos
																								// la
																								// dirección, el
																								// administrador
																								// y
																								// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = (Statement) conexion.createStatement();

			nombre = PedirDatos.pedirNombreActor();
			apellido = PedirDatos.pedirApellidoActor();

			nacionalidad = PedirDatos.pedirNacionalidad();

			sql = "DELETE Actores SET idActor = '" + id + "', nombre = '" + nombre + "', apellido = '" + apellido
					+ "', nacionalidad = '" + nacionalidad + "'  WHERE idPelicula = '" + id + "';";
			System.out.println(sql);
			// System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println("Se ha actualizado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static String subirPelicula() throws ClassNotFoundException {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado = 0;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = (Statement) conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)

			sql = "INSERT INTO `peliculas` (`titulo`, `año`, `genero`) VALUES ('" + PedirDatos.pedirTitulo() + "','"
					+ PedirDatos.pedirAno() + "','" + PedirDatos.pedirGenero() + "')";

			// sql = "INSERT INTO `pisos` (`idpiso`, `fidpropietario`, `direccion`, `m2`)
			// VALUES (NULL, '"+nPropietario+"', '"+calle+"', '"+m2+"')";

			// System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println("Se ha insertado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Conectado/desconectado");
		return sql;
	}
	
	public static String subirActores() throws ClassNotFoundException {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;
		int resultado = 0;
		String sql = "";

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/hoja10", "root", "");

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = (Statement) conexion.createStatement();

			// almaceno el resultado de la sql en un resulset (conjunto de registros)

			sql = "INSERT INTO `actores` (`nombre`, `apellido`, `nacionalidad`) VALUES ('" + PedirDatos.pedirNombreActor() + "','"
					+ PedirDatos.pedirApellidoActor() + "','" + PedirDatos.pedirNacionalidad() + "')";

			// sql = "INSERT INTO `pisos` (`idpiso`, `fidpropietario`, `direccion`, `m2`)
			// VALUES (NULL, '"+nPropietario+"', '"+calle+"', '"+m2+"')";

			// System.out.println(sql);

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println("Se ha insertado bien.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Conectado/desconectado");
		return sql;
	}

}
