package peliculas2;

import java.time.Year;

public class Pelicula {
	private String titulo;
	private Year agno;
	private String sipnosis;
	private Genero genero;
	private String pais;
	
	public Trailer trailer;
	public Guionista guinista;
	public Director director;
	
	public Pelicula() {
		trailer = new Trailer();
	}

}
