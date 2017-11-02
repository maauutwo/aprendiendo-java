package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador {

	public static void main(String[] args) {
		DameLaHora oyente  = new DameLaHora();
		Timer mitemporizador = new Timer(5000, oyente);
		mitemporizador.start();
		JOptionPane.showMessageDialog(null, "Aceptar para cerrar");
		System.exit(0);

	}

}

class DameLaHora implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Date hora = new Date();
		System.out.println("La hora actual es:"+hora);
		Toolkit.getDefaultToolkit().beep();
	}
	
}



