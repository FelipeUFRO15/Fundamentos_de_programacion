

import java.util.Scanner;

public class CalculadoraConM�todos {

	public static void mostrarMen�() {
		System.out.println("\n//////MEN�//////");
		System.out.println("1.- Sumar dos n�meros");
		System.out.println("2.- Restar dos n�meros");
		System.out.println("3.- Multiplicar dos n�meros");
		System.out.println("4.- Dividir dos n�meros");
		System.out.println("5.- Encontrar el mayor de dos n�meros");
		System.out.println("6.- Elevar el primer n�mero al segundo");
		System.out.println("7.- Salir del programa");
	};

	public static void leerOpci�nMen�() {
		boolean menu = true;
		do {
			mostrarMen�();
			System.out.println("\nSeleccione una opci�n");
			switch (leerNums()) {
			case 1:
				System.out.println("\n///SUMA///");
				System.out.println("suma = " + sumar(leerNums(), leerNums()));
				break;

			case 2:
				System.out.println("\n///RESTA///");
				System.out.println("Resta = " + restar(leerNums(), leerNums()));
				break;

			case 3:
				System.out.println("\n///MULTIPLICACI�N///");
				System.out.println("Producto = "
						+ multiplicar(leerNums(), leerNums()));
				break;

			case 4:
				System.out.println("\n///DIVISI�N///");
				System.out.println("Cociente = "
						+ dividir(leerNums(), leerNums()));
				break;

			case 5:
				System.out.println("\n///COMPARACI�N///");
				System.out.println("Mayor = "
						+ comparar(leerNums(), leerNums()));
				break;

			case 6:
				System.out.println("\n///POTENCIACI�N///");
				System.out.println("Potencia = "
						+ elevar(leerNums(), leerNums()));
				break;

			case 7:
				salir();
				menu = false;
				break;

			default:
				System.out.println("Opci�n inexistente");
				break;
			}
		} while (menu);

	};

	public static int leerNums() {
		Scanner leer = new Scanner(System.in);
		String cadena = "";
		int numb = 0;
		boolean bool = true;
		System.out.println("Ingrese un n�mero");
		do {
			cadena = leer.nextLine();
			if (cadena.matches("-{0,1}[0-9]{1,}")) {
				numb = Integer.parseInt(cadena);
				bool = false;
			} else
				System.out.println("Caracter inv�lido\n- Ingrese de nuevo");
		} while (bool);
		return numb;
	};

	public static int sumar(int sum1, int sum2) {
		return (sum1 + sum2);
	};

	public static int restar(int minn, int sust) {
		return (minn - sust);
	};

	public static int multiplicar(int fact1, int fact2) {
		return (fact1 * fact2);
	};

	public static double dividir(int divn, int divs) {
		return (double) ((double) divn) / ((double) divs);
	};

	public static int comparar(int com1, int com2) {
		return Math.max(com1, com2);
	};

	public static int elevar(int base, int exp) {
		return (int) Math.pow(base, exp);
	};

	public static void salir() {
		System.out
				.println("�De verdad quiere salir?\n- 1 = salir\n- Otro n�mero = volver");
		if (leerNums() == 1) {
			System.out.println("Gracias por usar este programa");
		} else
			leerOpci�nMen�();
	};

	public static void main(String[] args) {
		leerOpci�nMen�();

	}

}
