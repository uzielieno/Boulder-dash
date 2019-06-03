package fr.exia.BoulderDash.view;

import fr.exia.BoulderDash.controller.LevelEditorKeyController;
import fr.exia.BoulderDash.model.LevelModel;
import fr.exia.BoulderDash.view.GroundView;
import fr.exia.BoulderDash.view.LevelEditorView;

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
