package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		//Class Double must be used with variables: MIN_VALUE, MAX_VALUE.
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		double arrayStorage[] = new double[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a decimal number: ");
		for(int i = 0; i < arrayStorage.length; i++) {
			arrayStorage[i]= sc.nextDouble();
		}
		for(double arrayEachInput: arrayStorage) {
			System.out.print(arrayEachInput + " ");
			if (min > arrayEachInput) {
				min = arrayEachInput;
			} 
			if (max > arrayEachInput) {
				max = arrayEachInput;
			}
		}
		sc.close();
	}
}
/*Crea un programa que pida diez números reales por teclado,
 *los almacene en un array,
 *y luego lo recorra para averiguar
 *el máximo y mínimo y mostrarlos por pantalla.
 */