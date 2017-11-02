package poo;

public class Uso_Persona {

	public static void main(String[] args) {
		
		Persona emple1 = new Empleado2("Juanito",100000);
		System.out.println("El nombre de la persona es: "+emple1.dameNombre());
		System.out.println(emple1.dameDescripcion());
		
		Persona emple2 = new Jefatura("Pedrito","Informatico");
		System.out.println("El nombre de la persona es: "+emple2.dameNombre());
		System.out.println(emple2.dameDescripcion());
		
		if(emple1 instanceof Persona)
		{
			System.out.println("Es una instancia de persona");
		}
		
		Jefatura emple3 = new Jefatura("Marcela","Gerente");
		System.out.println(emple3.tomarDecisiones("aumentar bono en navidad"));
		System.out.println("El bono de navidad para "+emple3.dameNombre()+": "+emple3.darBono(45000));
		
		System.out.println(emple1.tomarDecisiones("seguir en el trabajo"));
		System.out.println("El bono de navidad para "+emple1.dameNombre()+": "+emple1.darBono(30000));

		
		
	}

}

abstract class Persona implements Jefes{
	
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

	@Override
	public String tomarDecisiones(String decision) {
		return "la decision tomada es: "+decision;
	}

	@Override
	public double darBono(double gratificacion) {
		return Trabajadores.bonus_base+15000+gratificacion;
	}
	
	

}


class Jefatura extends Persona {
	
	private String carrera;
	
	public Jefatura(String nom, String carrera)
	{
		super(nom);
		this.carrera= carrera;
		
	}
	
	public String dameDescripcion()
	{
		return "Este es un alumno";
	}

	@Override
	public String tomarDecisiones(String decision) {
		if(decision !=""){
			return "Haz tomado una decision, es: "+decision;
		}
		return null;
	}

	@Override
	public double darBono(double gratificacion) {
		return Trabajadores.bonus_base+200000+gratificacion;
	}
}
