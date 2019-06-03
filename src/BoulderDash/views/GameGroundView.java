package BoulderDash.views;

import javax.swing.*;

import BoulderDash.controllers.GameController;
import BoulderDash.controllers.GameKeyController;
import BoulderDash.models.LevelModel;
import BoulderDash.views.GroundView;

import java.awt.*;

/**
 * GameFieldView
 *
 * Game field view for the game itself.
 */
public class GameGroundView extends GroundView {
	private GameController gameController;

	/**
	 * Class constructor
	 * 
	 *
	 * @param gameController Game controller
	 * @param levelModel     Level model
	 */
	public GameGroundView(GameController gameController, LevelModel levelModel) {
		super(levelModel);

		this.gameController = gameController;

		this.addKeyListener(new GameKeyController(this.levelModel, this.gameController.getAudioLoadHelper()));

		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setFocusable(true);
	}
}
