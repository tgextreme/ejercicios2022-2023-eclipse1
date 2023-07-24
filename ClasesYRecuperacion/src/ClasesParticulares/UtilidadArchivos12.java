package ClasesParticulares;
import java.io.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class UtilidadArchivos12 {
	
	protected ArrayList Lista;
	
	public UtilidadArchivos12() {
		
	}
	
	public static void copiar(File origen, File destino) {
		//TODO LO QUE HAGAS Y DECLARES PARA ARCHIVOS SIEMPRE BAJO UN CONTEXTO DE TRY.
		try {
			/**
			 * al archivo de origen se le asigna el 
			 * parametro DIRECTAMENTE. 
			 * No decir que es uno nuevo ni nada 
			 * por el estilo.
			 */
			File archivoOrigen = origen;
			String linea = "";
			String[] arrayString;
			FileReader fr = new FileReader(archivoOrigen);
			BufferedReader br = new BufferedReader(fr);
			
			
			//los escritores los declaramos para despues definirlos como un nuevo objeto;
			FileWriter fw = null;
			PrintWriter pw = null;
			
			fw = new FileWriter(destino);
			pw = new PrintWriter(fw);
			
			while((linea=br.readLine()) != null) {
				pw.println(linea);
				
			}
			pw.close();
			
			/**
			*cuando declaras un 
			*printWritter(que puedes tener varios abiertos) 
			*es importante que cuando termines de usarlo del todo
			*lo cierres.
			*Es como el word. lo inicias y cuando terminas
			* lo cierras. No te dejas el programa
			* abierto.¿verdad?
			* 
			*/
		} catch(IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public void listarDirectoriosArchivos(File dir) {//tienes arrrayList, pero solo funciona con void xd.
		File carpeta = dir;
		try {
			String[] carpetaListada = carpeta.list();
			for(int i = 0; i<carpetaListada.length;i++) {
				System.out.println(carpetaListada[i]);
			}
		}catch(Exception e) {
			
		}
	}
	
	private static void listarDirectoriosArchivosRec(File dir) {
		Path directorioRaiz = Path.of(dir.getAbsolutePath());
	 try {
		Files.walkFileTree(directorioRaiz, new SimpleFileVisitor<Path>(){
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException{
				System.out.println(dir);
				return FileVisitResult.CONTINUE;
			}
		});
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
	public void zip(File dir, String caminoSalida, String nombreArchivo) {
		String rutaSalida = caminoSalida + File.separator + nombreArchivo + ".zip";

		byte[] buffer = new byte[1024];
	      
	      try{
	        
	        FileOutputStream fos = new FileOutputStream(nombreArchivo+".zip");
	        ZipOutputStream zos = new ZipOutputStream(fos);//esto es como el "bufferedreader del metodo copiar previo
	        ZipEntry ze= new ZipEntry(nombreArchivo);
	        zos.putNextEntry(ze);
	        FileInputStream in = new FileInputStream(nombreArchivo);
	        
	        int len;
	        while ((len = in.read(buffer)) > 0) {
	          zos.write(buffer, 0, len);
	        }
	        in.close();
	        zos.closeEntry();
	           
	        zos.close();
	          
	        System.out.println("Hecho");
	      }catch(IOException ex){
	         ex.printStackTrace();
	      }
	}

	
	
}