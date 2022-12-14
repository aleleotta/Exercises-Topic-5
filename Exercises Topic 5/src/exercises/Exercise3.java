package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		double arrayStorage[] = new double[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a decimal number: ");
		for(int i = 0; i < arrayStorage.length; i++) {
			arrayStorage[i]= sc.nextDouble();
		}
		System.out.print("[");
		for(double arrayEachInput: arrayStorage) {
			System.out.print(arrayEachInput + " ");
		}
		System.out.print("]");
		sc.close();
	}
}
/*Diseñar un programa que solicite al usuario
 *5 números decimales y los almacene en una tabla.
 *Utiliza el mismo bucle para solicitar los 5 números así
 *como para almacenarlos en la tabla.
 *A continuación, mostrar por consola los números
 *en el mismo orden en el que se han introducido.
 */