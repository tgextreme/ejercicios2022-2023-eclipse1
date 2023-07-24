package main;

public class Contabilidad {
	private Colegio[] colegios=new Colegio[10];
	private int numActCol=0;
	public int getNumActCol() {
		return numActCol;
	}
	public void setNumActCol(int numActCol) {
		this.numActCol = numActCol;
	}
	
	public void addColegio(Colegio colegio) {
		this.colegios[this.numActCol]=colegio;
		this.numActCol++;
	}
	public int numeroColegios() {
		return numActCol;
	}
	public int numNinos() {
		int total=0;
		Alumno [] alumnos;
		for(int i=0;i<numActCol;i++) {
			total=total+this.colegios[i].getNumAluActual();
			
		}
		return total;
		
	}
	public void cobrar() {
		int numAlu;
		int total=0;
		for(int i=0;i<numActCol;i++) {
			numAlu=this.colegios[i].getNumAluActual();
			Alumno [] alu= this.colegios[i].getArrAlum();
			double intermedio=0;
			for (int j=0;j<numAlu;j++) {
				if(alu[j].getEdad()>10){
					intermedio=2;
					
				}else {
					intermedio=1;
				}
				if(alu[j].getDiscapacidad()) {
					intermedio=intermedio*0.5;
				}
				if(this.colegios[i].getPropiedad().equals("publico")) {
					intermedio=intermedio*0.25;
				}
				
				
				
				
				
			}
			
		}
	}
	
	
	
	
	
}
