package InvestigacionTema6;
import java.io.File;
import java.io.IOException;
public class CrearCarpetaConArchivo {
	
	public static void main(String[] args) {
		

		/**
		 * la librería file tiene todos las habilidades 
		 * necesarias para el manejo de Files(archivos)
		 * ademas de crearlos.
		 * pero para poder verlos desde tu escritorio necesitas tambien
		 * el printStackTrace en un catch.
		 */
		
		
		//CUIDADO. NO SE PUEDE GENERAR UN ARCHIVO DE TEXTO DIRECTAMENTE. TIENES QUE HACER UNA CARPETA SI O SI E INCLUIR TODO AHÍ.
		String direccionCarpeta = "C:" + File.separator + "Users" + File.separator + "DAVID" + File.separator + "Desktop" + File.separator + "CarpetaBaliza";
		File carpetaBaliza = new File(direccionCarpeta);
		String direccionArchivo = direccionCarpeta + File.separator + "Baliza";
		File Baliza = new File(direccionArchivo);
		/**
		 * IMPORTANTE. EN EL ESCRITORIO NUNCA SE VA 
		 * A GENERAR UN ARCHIVO DE CUALQUIER TIPO
		 * AUNQUE DEFINAS SU FORMATO.
		 * Siempre será una carpeta, pero dentro de
		 * ella ya si podrás hacer los carchivos que quieras.
		 */
		try {//primero haces la direccion a la carpeta y luego la condicion al archivo para que se genere bien
			carpetaBaliza.mkdir();
			if(Baliza.exists() == false) {
				Baliza.createNewFile();//digamos que si no existe(que puede ocurrir tras crearla), que la genere de nuevo.
			}
			
			//a partir de aquí, puedes manipular y extraer datos del archivo a tus anchas
			System.out.println("Nombre del archivo:" + Baliza.getName());
		}
		catch(IOException e) {//IO(INPUT-OUTPUT) Exception
			e.printStackTrace();//IMPRIME EN CONSOLA LA LINEA DE JAVA QUE HA FALLADO.
		}
	
	
	}
}
