package main;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) {
		try {
			ServerSocket socket=new ServerSocket(8000);
			
			int numero=0;
			
			Socket sc;
			
			String texto;
			
			DataInputStream nsc;
			//declaramos las variables del servidor
			
			while(true) {
				sc=socket.accept();
				//cliente conectado
				nsc=new DataInputStream(sc.getInputStream());
				texto=nsc.readUTF();
				
				System.out.println("el mensaje es: "+ texto);
				sc.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
        
}
