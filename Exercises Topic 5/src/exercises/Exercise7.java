package exercises;
import java.util.*;

public class Exercise7 {
	public static void main(String[] args) {
		int table[] = new int[10]; //Declaration of array with specific length.
		int table1[] = new int[10]; //Declaration of array with specific length.
		Scanner sc = new Scanner(System.in); //Scanner declared.
		for(int i = 0; i < table.length ; i++) { //Normal for cycle modifies.
			System.out.print("Introduce a number: "); //Program asks for input.
			table[i] = sc.nextInt(); //Modification of values within array on every single position.
		}
		System.out.print("[");
		for(int tableQuery: table) { //For each cycle does queries.
			System.out.print(tableQuery + " "); //Prints every single value within the array.
		}
		System.out.println("]");
		table1[0] = table[9];
		table1[1] = table[8];
		table1[2] = table[7];
		table1[3] = table[6];
		table1[4] = table[5];
		table1[5] = table[4];
		table1[6] = table[3];
		table1[7] = table[2];
		table1[8] = table[1];
		table1[9] = table[0];
		System.out.print("[");
		for(int tableQuery: table1) { //For each cycle does queries.
			System.out.print(tableQuery + " "); //Prints every single value within the array.
		}
		System.out.print("]");
		sc.close(); //Scanner closed.
	}
}
/*Escribe un programa que lea 10 números por teclado
 *y que luego los muestre en orden inverso, es decir,
 *el primero que se introduce es el último en mostrarse.
 */