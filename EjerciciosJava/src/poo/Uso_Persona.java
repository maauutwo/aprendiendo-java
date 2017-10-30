package poo;

public class Uso_Persona {

	public static void main(String[] args) {
		
		Persona emple1 = new Empleado2("Juanito",100000);
		System.out.println("El nombre de la persona es: "+emple1.dameNombre());
		System.out.println(emple1.dameDescripcion());
		
		Persona emple2 = new Alumno("Pedrito","Informatico");
		System.out.println("El nombre de la persona es: "+emple2.dameNombre());
		System.out.println(emple2.dameDescripcion());
	}

}

abstract class Persona{
	
	private String nombre;
	
	public Persona(String nombre)
	{	
		this.nombre = nombre;
		
	}

	public String dameNombre()
	{
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	
	
}


class Empleado2 extends Persona{
	
	private String nombre;
	private double sueldo;
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Empleado2(String nombre, double sueldo){
		super(nombre);
		this.sueldo=sueldo;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String dameDescripcion() {
		return "Este es un empleado";
	}
	
	

}


class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom, String carrera)
	{
		super(nom);
		this.carrera= carrera;
		
	}
	
	public String dameDescripcion()
	{
		return "Este es un alumno";
	}
}
