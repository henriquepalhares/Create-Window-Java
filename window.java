package project;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class window extends Canvas implements Runnable  {
	public static JFrame frame;
	private final int WIDTH = 160;
	private final int HEIGHT = 120;
	private final int SCALE = 3;
	public window() {
		this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE)); //tamanho sugerido da janela
		frame = new JFrame(); 
		frame.add(this);
		frame.setResizable(false); //usuario nao pode redmensionar
		frame.pack();//calcular tamanho da janela setados no tamanho preferido 
		frame.setLocationRelativeTo(null); //janela começa no centro
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//clicou fechou
		frame.setVisible(true); //inicializou e possivel visualizar
		
	}
	public static void main(String args[]) {
		window game = new window();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
