package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colegio colegio= new Colegio("publico");
		Colegio colegio1= new Colegio("publico");
		Colegio colegio2= new Colegio("publico");
		Alumno alu1= new Alumno(10, true);
		Alumno alu2= new Alumno(10, true);
		Alumno alu3= new Alumno(10, true);
		Alumno alu4= new Alumno(10, true);
		Alumno alu5= new Alumno(10, true);
		Alumno alu6= new Alumno(10, true);
		colegio1.addArAlu(alu1);
		colegio1.addArAlu(alu3);
		colegio1.addArAlu(alu2);
		Contabilidad contabilidad=new Contabilidad();
		contabilidad.addColegio(colegio2);
	}

}
