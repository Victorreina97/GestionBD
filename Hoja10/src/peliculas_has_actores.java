
public class peliculas_has_actores {
	
	private int pelicula_id;
	private int actor_id;
	
	public peliculas_has_actores(int pelicula_id, int actor_id) {
		super();
		this.pelicula_id = pelicula_id;
		this.actor_id = actor_id;
	}

	public int getPelicula_id() {
		return pelicula_id;
	}

	public void setPelicula_id(int pelicula_id) {
		this.pelicula_id = pelicula_id;
	}

	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	@Override
	public String toString() {
		return "pelicula_has_actor [pelicula_id=" + pelicula_id + ", actor_id=" + actor_id + "]";
	}
	
	
	
	

}
