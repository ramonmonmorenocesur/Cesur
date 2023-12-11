package alumnocesur;

class Alumno extends Persona{
	
	private String curso;
	//CONSTRUCTOR
	public Alumno(String nombre, int edad, String curso) {
		
		super(nombre,edad);
		this.curso = curso;
	}

	//SETTER Y GETTERS
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String toString() {
		return ("Alumno: " + super.getNombre() + " Edad " + super.getEdad() + " Curso " + curso);
	}
} // Alumno