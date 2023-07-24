package main;

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

public class UtilidadArchivos {
	protected ArrayList lista;

	public UtilidadArchivos() {
		
	}
	
	public static void copiar(File origen, File destino) {
		try {
			File archivo =origen;
			FileReader fr=new FileReader(archivo);
			BufferedReader bf=new BufferedReader(fr);
			String linea="";
			String[] arrStr;
			
			FileWriter fichero = null;
			PrintWriter pw = null;
			destino.delete();//para borrar
			destino.createNewFile();//para crear archivo
			fichero = new FileWriter(destino, true);
			pw = new PrintWriter(fichero);
			
			
			while((linea=bf.readLine())!=null) {
				pw.println(linea);
			}
			pw.close();
		}catch(Exception ex) {
			
		}
	}
	public void listarDirectoriosArchivos (File dir) {
		File carpeta=dir;
		try {
		String[] listado =carpeta.list();
		
		for(int i=0;i<listado.length;i++) {
			System.out.println(listado[i]);
		}
		/*Segunda forma de recorrerlo
		for(String s:listado) {
			System.out.println(s);
		}*/
		
		}catch(Exception ex) {
			
		}
	}
	public void listarDirectoriosArchivosRec(File dir) {
		Path directorioRaiz = Path.of(dir.getAbsolutePath()); // Reemplaza con la ruta de tu directorio raíz

        try {
            Files.walkFileTree(directorioRaiz, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    System.out.println(dir);
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	public void zip(File dir, String caminoSalida, String nombreArchivo) {
		String rutaSalida = caminoSalida + File.separator + nombreArchivo + ".zip";

		byte[] buffer = new byte[1024];
	      
	      try{
	        
	        FileOutputStream fos = new FileOutputStream(nombreArchivo+".zip");
	        ZipOutputStream zos = new ZipOutputStream(fos);
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
