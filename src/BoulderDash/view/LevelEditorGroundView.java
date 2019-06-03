package BoulderDash.view;

import BoulderDash.controller.LevelEditorKeyController;
import BoulderDash.model.LevelModel;
import BoulderDash.view.GroundView;
import BoulderDash.view.LevelEditorView;

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
