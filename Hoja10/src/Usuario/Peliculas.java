package Usuario;



public class Peliculas {
	

	private String titulo;
	private String genero;
	private int ano;
	
	
	
	
public Peliculas(String titulo, String genero, int ano) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
		
	}




@Override
public String toString() {
	return "Peliculas [titulo=" + titulo + ", genero=" + genero + ", ano=" + ano + "]";
}




public String getTitulo() {
	return titulo;
}




public void setTitulo(String titulo) {
	this.titulo = titulo;
}




public String getGenero() {
	return genero;
}




public void setGenero(String genero) {
	this.genero = genero;
}




public int getAno() {
	return ano;
}




public void setAno(int ano) {
	this.ano = ano;
}



//creo pedir datos de la pelicula para tener pelicula creada
public static Peliculas pedirDatos() {
		
		return new Peliculas(PedirDatos.pedirTitulo(), PedirDatos.pedirGenero(), PedirDatos.pedirAno());
	}
	
	

}
