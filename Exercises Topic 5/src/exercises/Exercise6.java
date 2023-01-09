package exercises;
import java.util.*;

public class Exercise6 {
	public static void main(String[] args) {
		int table[] = new int[8]; //Declaration of array with specific length.
		Scanner sc = new Scanner(System.in); //Scanner declared.
		System.out.print("Introduce a number: "); //Program asks for input.
		for(int i = 0; i < table.length ; i++) { //Normal for cycle modifies.
			table[i] = sc.nextInt(); //Modification of values within array on every single position.
		}
		System.out.print("[");
		for(int tableQuery: table) { //For each cycle does queries.
			System.out.print(tableQuery + " "); //Prints every single value within the array.
		}
		System.out.print("]");
		sc.close(); //Scanner closed.
	}
}
/*Realiza un programa que pida 8 números enteros y los almacene en una tabla.
 *A continuación, recorrerá esa tabla y
 *mostrará esos números junto con la palabra “par” o “impar” según proceda.*/