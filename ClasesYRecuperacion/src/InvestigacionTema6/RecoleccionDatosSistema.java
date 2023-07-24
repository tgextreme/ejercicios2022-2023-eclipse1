package InvestigacionTema6;

public class RecoleccionDatosSistema {
	public static void main(String[] args) {
			//propiedades hace referencia aquí a tomar TODAS las propiedades del sistema
			//OJO. PARA EXTRAER TODAS, NECESITAS java.util.Properties.
			java.util.Properties propiedades = System.getProperties();
			
			
			//con este comando, puedes hacer una lista con los datos contenidos en "propiedades"
			
			propiedades.list(System.out);
			
			//si fuese solo una cosa lo que hay que mostrar, basta con imprimir en pantalla
			//como son varias, ordenas al entorno que haga una lista.
			
			System.out.println("======================================");
	}
}
