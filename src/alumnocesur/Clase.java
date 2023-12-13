package alumnocesur;

class Clase {
	private String nombre;
	private static final int TOTALALUMNOS = 15;
	private int numAlumnos;
	private Alumno[] alumnos;
	private Profesor profesor;

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Clase(String nombre) {
		alumnos = new Alumno[TOTALALUMNOS];
		numAlumnos = 0;
		this.nombre = nombre;
	}

	public void add(Alumno alumno) {
		if (numAlumnos < TOTALALUMNOS) {
			alumnos[numAlumnos] = alumno;
			numAlumnos++;
		}
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public static int getTotalalumnos() {
		return TOTALALUMNOS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return ("Clase: " + nombre + "NumAlumnos " + numAlumnos + "Profesor" + profesor);
	}// fin metodo

	public void delete(String nombre) {
		int indice = 0;
		while ((indice < numAlumnos) && (alumnos[indice].getNombre() != nombre)) {
			indice++;
		}
		if (indice < numAlumnos) {
			for (; indice < numAlumnos - 1; indice++) {
				alumnos[indice] = alumnos[indice + 1];

			}
			numAlumnos = numAlumnos - 1;
		}  

		}
	public void delete2(String nombre) {
	int	indice=0;
		boolean encontrado = false;
		while (!encontrado&&(indice<numAlumnos-1)) {
			if(alumnos[indice].getNombre()==nombre) {
				encontrado = true;
				
			}else {
				indice++;
				
			
			}
		}
		if (encontrado == true);
		
	}

	public void setAlumnos(String newName, int newAge, String newClase) {
		// TODO Auto-generated method stub
		
	}

	}

// fin clase