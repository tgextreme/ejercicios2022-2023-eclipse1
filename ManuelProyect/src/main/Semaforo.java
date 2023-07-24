package main;

public class Semaforo {

	public void funciona() {
		for(int i=1;i<20;i++) {
			switch(i%3) {
			case 0:
				System.out.println("Verde");
				break;
			case 1:
				System.out.println("Amarillo");
				break;
			case 2:
				System.out.println("Rojo");
				break;
				
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}
	
	
}
