package alumnocesur;

import java.util.Random;
import practicas.Creator;

public class alumnocesur {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		Centroestudio cesurEste = new Centroestudio("Cesur El Palo", 5, 4);
		Clase claseTemp;
		String nombreClaseTemp;
		Administrativo adminTemporal;
		for (int i = 0; i < 5; i++) {// construir 5 clases.
			 nombreClaseTemp = Creator.newClase();
			claseTemp = new Clase(Creator.newClase());
			claseTemp.setProfesor(new Profesor(Creator.newName(), Creator.newAge(), nombreClaseTemp));//
	
			for (int j = 0; j < 15; j++) {

				claseTemp.add(new Alumno(Creator.newName(), Creator.newAge(), nombreClaseTemp));

			}
			cesurEste.getClases()[i]=claseTemp;
		}
		for (int i =0;i<4;i++) {
			adminTemporal= new Administrativo (Creator.newName(),
					Creator.newAge(),
					aleatorio.nextBoolean()); 
			
				cesurEste.getAdministrativos()[i]=adminTemporal;
			

		}   System.out.println(cesurEste.getAdministrativos());
		Centroestudio cesurPTA = new Centroestudio("CesurPTA");

	}

}