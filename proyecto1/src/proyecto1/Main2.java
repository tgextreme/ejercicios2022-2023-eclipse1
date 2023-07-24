package proyecto1;

public class Main2 {
	public static void main(String[] args) {
		int edad = 0;
		while (edad < 18){
			edad = edad + 1;
			System.out.println("La edad es igual a " + edad);

		}
		do {
			edad = edad + 1;
			System.out.println("DO-WHILE La edad es igual a " + edad);
			
		}while (edad < 18);
			
		System.out.println("Ya es mayor de edad");
	}
}
