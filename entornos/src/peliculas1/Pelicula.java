package peliculas1;

import java.time.Year;

import peliculas2.Director;
import peliculas2.Genero;
import peliculas2.Guionista;
import peliculas2.Trailer;

public class Pelicula {
	private String titulo;
	private Year agno;
	private String sipnosis;
	private Genero genero;
	private String pais;
	
	public Trailer trailer;
	public Persona actor;
	public java.util.Collection director = new java.util.TreeSet();
	public Persona productor;
	public java.util.Collection guionista = new java.util.TreeSet();
	
	public Pelicula() {
		trailer = new Trailer();
	}

}

