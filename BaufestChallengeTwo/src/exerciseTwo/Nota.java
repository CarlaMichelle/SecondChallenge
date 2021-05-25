package exerciseTwo;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba el nombre del alumno ");

		String nombreAlumno = sc.next();

		do {

			System.out.println("Ingrese Nota Practica");
			double notaPractica = sc.nextFloat();

			if ((notaPractica >= 0) && (notaPractica <= 10)) {

				System.out.println("Ingrese Nota Problema");

				double notaProblema = sc.nextFloat();

				if ((notaProblema >= 0) && (notaProblema <= 10)) {

					System.out.println("Ingrese Nota teorica");

					double notaTeorica = sc.nextFloat();

					if ((notaTeorica >= 0) && (notaTeorica <= 10)) {

						double notaFinal = ((notaPractica * 0.1) + (notaProblema * 0.5) + (notaTeorica * 0.4));
						System.out.println("La nota final es:" + notaFinal);
						System.out.println("Escriba el nombre del alumno");
						nombreAlumno = sc.next();

					} else {

						System.out.println("Error" + "" + "Escriba el nombre del alumno ");
						nombreAlumno = sc.next();
					}
				}

				else {

					System.out.println("Error" + "" + "Escriba el nombre del alumno ");
					nombreAlumno = sc.next();
				}
			}

			else {

				System.out.println("Error" + "" + "Escriba el nombre del alumno ");
				nombreAlumno = sc.next();
			}
		}

		while (nombreAlumno != "");

	}

}
