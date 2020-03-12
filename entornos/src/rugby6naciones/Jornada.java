package rugby6naciones;

import java.sql.Date;

public class Jornada {
	private Date fecha;
	
	public Partido partido;
	public Jornada() {
		partido = new Partido();
	}
}
