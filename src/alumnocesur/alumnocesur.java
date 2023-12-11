package alumnocesur;

public class alumnocesur {

	public static void main(String[] args) {

		
		Alumno ramon = new Alumno("ramon", 24, "DAM");

		
		Alumno paco = new Alumno("paco", 17, "DAM");
		Alumno SANTI = new Alumno("santi", 22, "DAM");
		Alumno andres = new Alumno("andres", 20, "DAM");
		Alumno alvaro = new Alumno("alvaro", 18, "DAM");
		Alumno adria = new Alumno("adrian", 25, "DAM");
		Alumno yajin = new Alumno("yajin", 27, "DAM");
		Alumno simran = new Alumno("simran", 23, "DAM");
		Alumno ale = new Alumno("ale", 23, "DAM");
		Alumno dario = new Alumno("dario", 17, "DAM");
		Alumno JOSERAMON = new Alumno("Josera", 39, "DAM");
		Alumno juanan = new Alumno("Juanan",23,"DAW");
		// TODO Auto-generated method stub
		Clase premiumPlus = new Clase("premiumPlus");
		
		premiumPlus.add(dario);
		premiumPlus.add(ale);
		premiumPlus.add(JOSERAMON);
		premiumPlus.add(paco);
		premiumPlus.add(SANTI);
		premiumPlus.add(simran);
		premiumPlus.add(yajin);
		premiumPlus.add(andres);
		premiumPlus.add(adria);
		premiumPlus.add(alvaro);
		premiumPlus.add(juanan);
		System.out.println(premiumPlus);
		
		   for (int i=0;i<premiumPlus.getNumAlumnos();i++) {
			  if(premiumPlus.getAlumnos()[i].getNombre()=="dario") {
				  premiumPlus.getAlumnos()[i].setEdad(18);
				  System.out.println(premiumPlus.getAlumnos()[i].getEdad());
			  }
				  
			  
		   }
		   for(int i =0; i<premiumPlus.getNumAlumnos();i++) {
			   if(premiumPlus.getAlumnos()[i].getCurso()=="DAW") {
				 System.out.println("alumnos de DAW "+premiumPlus.getAlumnos()[i].getNombre());
				 
			   } else {
				   System.out.println("alumnos de DAM "+premiumPlus.getAlumnos()[i].getNombre());
			   }
				   


		   }
	}
}
