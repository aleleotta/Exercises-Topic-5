package exercises;

public class Exercise1 {
	public static void main(String[] args) {
		int randomLength[] = new int[10]; //Array with length declared but no values have been assigned.
		System.out.println("Printing...\n");
		for(int i = 0; i < randomLength.length; i++) { //Always use a for cycle to print an array.
			randomLength[i] = (int)(Math.random()* 100 + 1); //Math.random used to assign random values to the array from 1 to 100.
			System.out.println(randomLength[i]); //Array printed inside for cycle.
		}
	}
}
/*Crea una tabla de enteros de longitud 10 que se inicializará
 *con números aleatorios comprendidos entre 1 y 100.*/