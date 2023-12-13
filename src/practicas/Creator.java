package practicas;
import java.util.Random;
public class Creator {
	
	private static String[] nombres = { "Daniel", "Andres", "Francisco", "Santiago", "JoseRamon", "Ramon", "Dario", "JuanCarlos",
			"Alvaro", "Janhin", "Adrian", "Alejandro", "Simri"};

	private static String[] apellidos = { "Fernandez", "Campos", "Garcia", "Perez", "Ruiz", "Ungureanu", "Diaz", "Rodriguez", "Torres",
			"Villa" };
	
	private static String[] asistencia= {"PremiumPlus","online","presencial"};
	private static String[] tipocurso= {"DAM","DAW","Ciberseguridad","Bigdata"};
	
	
	public static String newName() {
		Random aleatorio= new Random();
		return(nombres[aleatorio.nextInt(nombres.length)]+" "+ 
		apellidos[aleatorio.nextInt(apellidos.length)]+" "+
		apellidos[aleatorio.nextInt(apellidos.length)]);		
	
		
	}
	public static int newAge() {
		Random aleatorio =new Random();
		return (17+aleatorio.nextInt(33));
		
	}
	public static String newClase() {
		Random aleatorio= new Random();
		return (asistencia[aleatorio.nextInt(asistencia.length)]+" "
		+tipocurso[aleatorio.nextInt(tipocurso.length)]);
	}
}
