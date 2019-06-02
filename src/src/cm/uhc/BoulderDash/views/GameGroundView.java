package src.cm.uhc.BoulderDash.views;

import javax.swing.*;

import src.cm.uhc.BoulderDash.controllers.GameController;
import src.cm.uhc.BoulderDash.controllers.GameKeyController;
import src.cm.uhc.BoulderDash.models.LevelModel;
import src.cm.uhc.BoulderDash.views.GroundView;

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
