package BoulderDash.views;

import BoulderDash.controllers.LevelEditorKeyController;
import BoulderDash.models.LevelModel;
import BoulderDash.views.GroundView;
import BoulderDash.views.LevelEditorView;

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
