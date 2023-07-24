package main;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args) {
		
		String mensaje="";
		Scanner scanner =new Scanner(System.in);
		//Host del servidor
        final String HOST = "127.0.0.1";
        //Puerto del servidor
        DataOutputStream out;
      
		Scanner sc = new Scanner(System.in);
		Socket socket;

		try {
			for (int i = 0; i < 10; i++) {
				try {
					socket = new Socket("127.0.0.1", 8000);
					out = new DataOutputStream(socket.getOutputStream());
					mensaje = sc.nextLine();
					
					out.writeUTF(mensaje);
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
