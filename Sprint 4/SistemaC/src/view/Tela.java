package view;

import javax.swing.JFrame;



public abstract class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	

	public Tela() {
		
		setSize(600, 400);
		setLocationRelativeTo(null);
		setLayout(null);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
