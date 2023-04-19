package jdr;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*****MENU DEL ZOO DE JORGE*****");
		System.out.println("Seleccione una opcion: ");
		System.out.println("1. Agregar y eliminar animales del zoológico");	
		System.out.println("2. Agregar y eliminar hábitats del zoológico.");
		System.out.println("3. Agregar y eliminar cuidadores del zoológico.");
		System.out.println("4. Asignar animales a hábitats específicos");
		System.out.println("5. Asignar cuidadores a animales específicos.");
		System.out.println("6. Mostrar información detallada de cada animal, hábitat y cuidador");
		System.out.println("7. Mostrar los animales del zoo ordenados por edad.");
		System.out.println("8. Salir");
		int opcion;
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Has seleccionado la opcion 1");
			
			break;
		case 2:
			System.out.println("Has seleccionado la opcion 2");
			
			break;
		case 3:
			System.out.println("Has seleccionado la opcion 3");
			
			break;
		case 4:
			System.out.println("Has seleccionado la opcion 4");
			
			break;
		case 5:
			System.out.println("Has seleccionado la opcion 5");
			
			break;
		case 6:
			System.out.println("Has seleccionado la opcion 6");
			
			break;
		case 7:
			System.out.println("Has seleccionado la opcion 7");
			
		break;
		default:
			System.out.println("Saliendo...");
			break;
		}
		
		
		
		
		
		
		
		
	}

}
