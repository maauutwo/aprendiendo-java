package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador2 {
	
	public static void main(String[] args){
		
		Reloj mireloj = new Reloj(3000,false);
		mireloj.enMarcha();
		JOptionPane.showMessageDialog(null, "Aceptar para terminar");
		System.exit(0); //cuando pones aceptar en la ventana ejecuta la siguiente linea y termina el programa.
		
	}

}

class Reloj{
	
	public Reloj(int intervalo, boolean sonido){
		this.intervalo=intervalo;
		this.sonido = sonido;
	}
	
	public void enMarcha(){
		ActionListener oyente = new DameLaHora2();
		
		Timer mitempo = new Timer(intervalo,oyente);
		
		mitempo.start();
	}
	
	private int intervalo;
	private boolean sonido;
	
	private class DameLaHora2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Date hora = new Date();
			System.out.println("La hora es:"+hora);
			
			if(sonido){
				Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
		
	}
	
	
}