import java.util.InputMismatchException;
import java.util.Scanner;

public class Taller01 {

	public static void main(String[] args) {
		int azar;
		int n = 0;
		int rep = 1;
		int ceros = 0;
		int diag1 = 1;
		int diag2 = 1;
		boolean leer_n = true;
		int nums[] = new int[10];
		Scanner scn = new Scanner(System.in);
		//Declaraci�n de variables: int, booleans, scanner, arreglo
		
		System.out.println("Ingrese un n para la matriz");
		do{
			try{
				n = scn.nextInt();
				leer_n = false;
			}catch(InputMismatchException error){
				System.out.println("Caracter inv�lido, solo se aceptan n�meros");
				scn.nextLine();
			}
		}while(leer_n);
		System.out.println();
		//validaci�n del n para la matriz
		
		int matriz[][] = new int [n][n];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				azar = (int) Math.floor(Math.random()*10);
				if (azar == 0){
					ceros++;
				}
				matriz[i][j] = azar;
				System.out.print(matriz[i][j] + "    ");
				nums[azar]++;
			}
			System.out.println("\n");
		}
		//llenado de la matriz y de contadores
		
		for (int i = 1; i <= 9; i++){
			System.out.print(nums[i] + "|");
			if (nums[rep] >= nums[i-1]){
				rep = i;
			}
		}
		System.out.println("El n�mero que m�s se repite es " + rep);
		//determinaci�n del n�mero que m�s se repite
		
		for (int i = 0; i < n; i++){
			for ( int j = 0; j < n; j++){
				if (i == j){
					diag1 = diag1 * matriz [i][j];
				}
				if (i + j == (n - 1)){
					diag2 = diag2 * matriz[i][j];
				}
			}
		}
		System.out.println("La suma de el producto de la diagonal 1 (" + diag1 + ") m�s el de la diagonal 2 (" + diag2 + ") es " + (diag1 + diag2));
		//operaciones con diagonales
		
		System.out.println("\nLa cantidad de ceros es " + ceros);
		if (ceros > (Math.pow(n, 2))/2){
			System.err.println("ES una matriz CERO");
		}else{
			System.err.println("----NO ES una matriz CERO");	
		}
		//validaci�n de la matriz cero
		scn.close();
		
	}

}
