package cm.uhc.BoulderDash.views;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import cm.uhc.BoulderDash.models.LevelModel;

/**
 * InformationPanel
 *
 * Information panel element.
 *
 */
public class InformationPanel extends JPanel implements Observer {
	private LevelModel levelModel;
	private JTextArea text;

	/**
	 * Class constructor
	 */
	public InformationPanel(LevelModel levelModel) {
		this.levelModel = levelModel;
		this.text = new JTextArea();
		this.text.setEditable(false);
		this.levelModel.getGameInformationModel().addObserver(this);

		this.text.setText("Score : " + levelModel.getGameInformationModel().getScore() + "\nRemaining diamonds : "
				+ levelModel.getGameInformationModel().getRemainingsDiamonds());

		this.add(this.text);
	}

	/**
	 * Updates the panel
	 *
	 * @param o   Observable item
	 * @param arg Object item
	 */
	@Override
	public void update(Observable o, Object arg) {
		this.text.setText("Score : " + this.levelModel.getGameInformationModel().getScore() + "\nRemaining diamonds : "
				+ this.levelModel.getGameInformationModel().getRemainingsDiamonds());
	}
}
