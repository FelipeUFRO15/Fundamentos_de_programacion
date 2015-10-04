import java.util.Scanner;
import java.util.InputMismatchException;
public class CalcFunda {

	public static void menu(Scanner scn) {
		int menu1 = 0;
		int num1=0, num2=0;
		boolean menu=true;
		do{
			do{
				System.out.println("\n//////MEN�//////");
				System.out.println("1.- Sumar dos n�meros");
				System.out.println("2.- Restar dos n�meros");
				System.out.println("3.- Multiplicar dos n�meros");
				System.out.println("4.- Dividir dos n�meros");
				System.out.println("5.- Encontrar el mayor de dos n�meros");
				System.out.println("6.- Calcular un porcentaje de un n�mero");
				System.out.println("7.- Salir del programa");
				try{
		            menu1= scn.nextInt();
		            menu = false;
		        }catch(InputMismatchException x){
		            System.out.println("Car�cter inv�lido, solo n�meros");
		            scn.nextLine();
		            menu=true;
		        }
			}while(menu);
			switch (menu1) {
			case 1:
				suma(scn, num1, num2);
				break;
				
			case 2:
				resta(scn, num1, num2);
				break;
				
			case 3:
				mult(scn, num1, num2);
				break;
				
			case 4:
				div(scn, num1, num2);
				break;
			
			case 5:
				mayor(scn, num1, num2);
				break;
				
			case 6:
				porc(scn, num1, num2);
				break;	
				
			case 7:
				salir(scn, num1);
				break;

			default:
				System.out.println("Opci�n inv�lida; ingrese de nuevo");
				break;
			}
		}while (menu1 != 7);
	};
	
	public static void suma(Scanner scn, int num1, int num2) {
		System.out.println("\n//////SUMA//////");
		boolean m�todo = true;
		do {
			try {
				System.out.println("Ingrese el primer n�mero");
				num1 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros\n");
                scn.nextLine();
			}
		}while (m�todo);
		m�todo=true;
		do {
			try {
				System.out.println("Ingrese el segundo n�mero");
				num2 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros");
                scn.nextLine();
			}
		}while (m�todo);
		int suma = num1+num2;
		System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
	};
	
	public static void resta(Scanner scn, int num1, int num2) {
		System.out.println("\n//////RESTA//////");
		boolean m�todo = true;
		do {
			try {
				System.out.println("Ingrese el primer n�mero");
				num1 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros\n");
                scn.nextLine();
			}
		}while (m�todo);
		m�todo=true;
		do {
			try {
				System.out.println("Ingrese el segundo n�mero");
				num2 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros");
                scn.nextLine();
			}
		}while (m�todo);
		int resta = num1-num2;
		System.out.println("La resta de " + num1 + " y " + num2 + " es " + resta);
	};
	
	public static void mult(Scanner scn, int num1, int num2) {
		System.out.println("\n//////MULTIPLICACI�N//////");
		boolean m�todo = true;
		do {
			try {
				System.out.println("Ingrese el primer n�mero");
				num1 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros\n");
                scn.nextLine();
			}
		}while (m�todo);
		m�todo=true;
		do {
			try {
				System.out.println("Ingrese el segundo n�mero");
				num2 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros");
                scn.nextLine();
			}
		}while (m�todo);
		int producto = num1*num2;
		System.out.println("El producto de " + num1 + " y " + num2 + " es " + producto);
	};
	
	public static void div(Scanner scn, int num1, int num2) {
		System.out.println("\n//////DIVISI�N//////");
		boolean m�todo = true;
		do {
			try {
				System.out.println("Ingrese el primer n�mero");
				num1 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros\n");
                scn.nextLine();
			}
		}while (m�todo);
		m�todo=true;
		do {
			try {
				System.out.println("Ingrese el segundo n�mero");
				num2 = scn.nextInt();
				while (num2==0){
					System.out.println("Resultado indeterminado, ingrese otro n�mero");
					num2 = scn.nextInt();
				}
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros");
                scn.nextLine();
			}
		}while (m�todo);
		double cociente = (double) num1/num2;
		System.out.println("El cociente de " + num1 + " y " + num2 + " es " + cociente);
	};
	
	public static void mayor(Scanner scn, int num1, int num2) {
		System.out.println("\n//////COMPARACI�N//////");
		boolean m�todo = true;
		do {
			try {
				System.out.println("Ingrese el primer n�mero");
				num1 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros\n");
                scn.nextLine();
			}
		}while (m�todo);
		m�todo=true;
		do {
			try {
				System.out.println("Ingrese el segundo n�mero");
				num2 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros");
                scn.nextLine();
			}
		}while (m�todo);
		if (num1>num2){
			System.out.println("El n�mero mayor es " + num1);
		}
		if (num2>num1){
			System.out.println("El n�mero mayor es " + num2);
		}
		if (num1==num2){
			System.out.println("Ambos n�meros son iguales");
		}
	};
	
	public static void porc(Scanner scn, int num1, int num2) {
		System.out.println("\n//////PORCENTAJE//////");
		boolean m�todo = true;
		do {
			try {
				System.out.println("Ingrese un n�mero");
				num1 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros\n");
                scn.nextLine();
			}
		}while (m�todo);
		m�todo=true;
		do {
			try {
				System.out.println("Ingrese el porcentaje de " + num1  + " que desea calcular");
				num2 = scn.nextInt();
				m�todo=false;
			}
			catch (InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros");
                scn.nextLine();
			}
		}while (m�todo);
		double porc = (double) (num1*num2)/100;
		System.out.println("El " + num2 + "% de " + num1 + " es "+ porc);
	};
	
	public static void salir(Scanner scn, int num1) {
		System.out.println("\n//////SALIR//////");
		System.out.println("�De verdad quiere dejar de utilizar este software?\nIngrese 1 (Si) o 2 (No)");
		boolean m�todo=true;
		do{
			try{
				num1 = scn.nextInt();
				while (num1>2 || num1<1){
					System.out.println("Opci�n inv�lida, ingrese de nuevo");
					num1 = scn.nextInt();
				}
				if (num1 == 1){
					System.out.println("\n//////Gracias por usar este programa//////");
					break;
				}
				if (num1 == 2){
					menu(scn);
				}
				m�todo=false;
			}
			catch(InputMismatchException x){
				System.out.println("Car�cter inv�lido, solo n�meros");
                scn.nextLine();
			}
		}while(m�todo);
		
	};
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		menu(scn);
	}
}
