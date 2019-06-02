package src.cm.uhc.BoulderDash.views;

import src.cm.uhc.BoulderDash.controllers.LevelEditorKeyController;
import src.cm.uhc.BoulderDash.models.LevelModel;
import src.cm.uhc.BoulderDash.views.GroundView;
import src.cm.uhc.BoulderDash.views.LevelEditorView;

/**
 * LevelEditorFieldView
 *
 * Game field view for the level editor.
 *
 */
public class LevelEditorGroundView extends GroundView {
	/**
	 * Class constructor
	 *
	 * @param levelModel Level model
	 */
	public LevelEditorGroundView(LevelModel levelModel, LevelEditorView levelEditorView) {
		super(levelModel);

		this.addKeyListener(new LevelEditorKeyController(levelModel, levelEditorView));
	}
}
