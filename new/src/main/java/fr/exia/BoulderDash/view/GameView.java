package fr.exia.BoulderDash.view;

import javax.swing.*;

import fr.exia.BoulderDash.controller.GameController;
import fr.exia.BoulderDash.model.LevelModel;
import fr.exia.BoulderDash.view.GameGroundView;
import fr.exia.BoulderDash.view.InformationPanel;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * GameView
 *
 * Specifies the game view itself.
 */
public class GameView extends JFrame implements Observer {
	private GameGroundView gameGroundView;
	private JPanel actionPanel;
	private JPanel informationPanel;
	private GameController gameController;
	private LevelModel levelModel;

	/**
	 * Class constructor
	 *
	 * @param gameController Game controller
	 * @param levelModel     Level model
	 */
	public GameView(GameController gameController, LevelModel levelModel) {
		this.gameController = gameController;
		this.levelModel = levelModel;

		this.initializeView();
		this.createLayout();

		this.gameGroundView.grabFocus();
	}

	/**
	 * Initializes the view
	 */
	private void initializeView() {
		this.setVisible(false);
		this.setResizable(false);

		// UI parameters
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setBounds(150, 150, 502, 606);

		// App parameters
		this.setTitle("Boulder Dash | Game");

		Image appIcon = Toolkit.getDefaultToolkit().getImage("./res/app/menu_actuel.png");
		this.setIconImage(appIcon);
	}

	/**
	 * Creates the view layout
	 */
	private void createLayout() {
		this.gameGroundView = new GameGroundView(this.gameController, this.levelModel);
		this.actionPanel = new JPanel();
		this.informationPanel = new InformationPanel(this.levelModel);
		this.informationPanel.setBackground(Color.white);

		// Add some buttons on the informationPanel
		this.createButton("restart", "Restart");
		this.createButton("pause", "Pause");
		this.createButton("menu", "Menu");

		this.add(this.actionPanel, BorderLayout.SOUTH);
		this.add(this.informationPanel, BorderLayout.NORTH);
		this.add(this.gameGroundView, BorderLayout.CENTER);
	}

	/**
	 * Gets the game field view
	 *
	 * @return Game field view
	 */
	public GameGroundView getGameFieldView() {
		return this.gameGroundView;
	}

	/**
	 * Creates the given button
	 *
	 * @param name Button name
	 * @return Created button
	 */
	public JButton createButton(String id, String name) {
		JButton button = new JButton(name);
		button.addActionListener(this.gameController);
		button.setActionCommand(id);

		this.actionPanel.add(button);

		return button;
	}

	/**
	 * Updates the frame
	 *
	 * @param obs Observable item
	 * @param obj Object item
	 */
	@Override
	public void update(Observable obs, Object obj) {
		// Nothing done.
	}
}