package fr.exia.BoulderDash.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class WinLoseView extends JFrame {

	private String winOrLose;

	/**
	 * Generate the HelpView
	 */
	public WinLoseView(String winOrLose) {
		this.winOrLose = winOrLose;
		this.initializeView();
		this.createLayout();
	}

	/**
	 * Initializes the view
	 */
	private void initializeView() {
		this.setVisible(true);
		this.setResizable(false);

		// UI parameters
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setBounds(300, 300,300, 100);

		// App parameters
		this.setTitle("END OF THE GAME ! ");
	}

	/**
	 * Creates the view layout
	 */
	private void createLayout() {
		JTextArea help = new JTextArea();
		help.setEditable(false);
		if (winOrLose.equals("win"))
			help.setText("You won !! Congratulations ;)");
		else
			help.setText("You are dead, GAME OVER :-( TRY AGAIN!!!!!!");

		this.add(help);
	}
}
