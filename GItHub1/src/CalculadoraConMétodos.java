
import java.util.Scanner;

/**
 * Felipe Acu�a 
 * Ingenier�a inform�tica
 * Fundamentos de programaci�n
 * Calculadora  con implementaci�n de m�todos
 * @author Felipe
 *
 */

public class CalculadoraConM�todos {

	/**
	 * Imprime el men� por consola 
	 * No recibe par�metros 
	 * No retorna valores
	 */
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

	/**
	 * Usa el m�todo para leer n�meros 
	 * Ejecuta las funciones de la calculadora mediante un switch
	 */
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
				System.err.println("Opci�n inexistente");
				break;
			}
		} while (menu);
	};

	/**
	 * Crea un scanner 
	 * Lee y valida todos los n�meros ingresados 
	 * No recibe par�metros 
	 * Retorna un n�mero entero
	 * @return
	 */
	public static int leerNums() {
		Scanner leer = new Scanner(System.in);
		int numb = 0;
		String cadena = "";
		boolean bool = true;
		System.out.println("Ingrese un n�mero");
		do {
			cadena = leer.nextLine();
			if (cadena.matches("-{0,1}[0-9]{1,}")) {
				numb = Integer.parseInt(cadena);
				bool = false;
			} else {
				System.err.println("Caracter inv�lido\n- Ingrese de nuevo");
			}
		} while (bool);
		return numb;
	};

	/**
	 * Recibe dos enteros 
	 * Retorna su suma como un entero
	 * @param sum1
	 * @param sum2
	 * @return
	 */
	public static int sumar(int sum1, int sum2) {
		return (sum1 + sum2);
	};

	/**
	 * Recibe dos enteros 
	 * Retorna su resta como un entero
	 * @param minn
	 * @param sust
	 * @return
	 */
	public static int restar(int minn, int sust) {
		return (minn - sust);
	};

	/**
	 * Recibe dos enteros 
	 * Retorna su multiplicaci�n como un entero
	 * @param fact1
	 * @param fact2
	 * @return
	 */
	public static int multiplicar(int fact1, int fact2) {
		return (fact1 * fact2);
	};

	/**
	 * Recibe dos enteros 
	 * Si el segundo es cero lo pide de nuevo
	 * Los transforma a double y los retorna en un double
	 * @param divn
	 * @param divs
	 * @return
	 */
	public static double dividir(int divn, int divs) {
		while (divs == 0) {
			System.err
					.println("Resultado indeterminado");
			System.out.print(" ");
			divs = leerNums();
		}
		return (double) ((double) divn) / ((double) divs);
	};

	/**
	 * Recibe dos n�meros enteros 
	 * Retorna el mayor como un entero
	 * @param com1
	 * @param com2
	 * @return
	 */
	public static int comparar(int com1, int com2) {
		return Math.max(com1, com2);
	};

	/**
	 * Recibe dos enteros 
	 * Retorna en un entero el primero elevado al segundo
	 * @param base
	 * @param exp
	 * @return
	 */
	public static int elevar(int base, int exp) {
		return (int) Math.pow(base, exp);
	};

	/**
	 * Pregunta al usuario si desea salir de la aplicaci�n 
	 * Cierra el programa o regresa al men�
	 */
	public static void salir() {
		System.out
				.println("\n�De verdad quiere salir?\n- 1 = salir\n- Otro n�mero = volver");
		if (leerNums() == 1) {
			System.out
					.println("\n***Gracias por usar este programa***\n   -Felipe Acu�a");
		} else {
			leerOpci�nMen�();
		}
	};

	public static void main(String[] args) {
		leerOpci�nMen�();

	}

}
