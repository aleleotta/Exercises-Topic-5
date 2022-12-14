package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		double arrayStorage[] = new double[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a decimal number: ");
		for(int i = 0; i < arrayStorage.length; i++) {
			arrayStorage[i]= sc.nextDouble();
		}
		sc.close();
	}
}
/*Crea un programa que pida diez números reales por teclado,
 *los almacene en un array,
 *y luego lo recorra para averiguar
 *el máximo y mínimo y mostrarlos por pantalla.
 */