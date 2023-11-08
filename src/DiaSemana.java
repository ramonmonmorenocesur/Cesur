
public class DiaSemana {
	public static void main(String[] args) {
		int Semana = 0;
		int diaSemana = 0;
		int meses = 0;
		while (meses < 12) {
			while (Semana < 4) {
				while (diaSemana < 7) {
					if (diaSemana == 0) {
						System.out.print("[L" + " ");
					} else if (diaSemana == 1) {

						System.out.print("M" + " ");
					} else if (diaSemana == 2) {

						System.out.print("X" + " ");
					} else if (diaSemana == 3) {
						System.out.print("J" + " ");
					} else if (diaSemana == 4) {
						System.out.print("V" + " ");
					} else if (diaSemana == 5) {
						System.out.print("S" + " ");
					} else if (diaSemana == 6) {
						System.out.print("D]" + " ");
					}

					diaSemana++;

				}
				diaSemana = 0;
				Semana++;

			}
			if (meses == 0) {
				System.out.println("enero ");
			} else if (meses == 1) {
				System.out.println("febrero");
			} else if (meses == 2) {
				System.out.println("marzo");
			} else if (meses == 3) {
				System.out.println("abril");
			} else if (meses == 4) {
				System.out.println("mayo");
			} else if (meses == 5) {
				System.out.println("junio");
			} else if (meses == 6) {
				System.out.println("julio");
			} else if (meses == 7) {
				System.out.println("agosto");
			} else if (meses == 8) {
				System.out.println("septiembre");
			} else if (meses == 9) {
				System.out.println("octubre");
			} else if (meses == 10) {
				System.out.println("noviembre");
			} else if (meses == 11) {
				System.out.println("diciembre");
			}
			Semana = 0;
			meses++;
		}
	}
}