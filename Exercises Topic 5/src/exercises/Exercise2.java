package exercises;

public class Exercise2 {
	public static void main(String[] args) {
		int arrayResult = 0;
		int randomLength[] = new int[10]; //Array with length declared but no values have been assigned.
		System.out.println("Printing...\n");
		for(int i = 0; i < randomLength.length; i++) { //Always use a for cycle to print an array.
			randomLength[i] = (int)(Math.random()* 100 + 1); //Math.random used to assign random values to the array from 1 to 100.
			System.out.println(randomLength[i]); //Array printed inside for cycle.
		}
		for(int value: randomLength) {
			arrayResult = arrayResult + value;
		}
		System.out.println("Result: " + arrayResult);
	}
}
/*Partiendo de la tabla creada en el ejercicio 1,
 *mostrar la suma de todos los números aleatorios que se guardan en la tabla.
 *Copia y pega el código del ejercicio anterior.
 */