package cm.uhc.BoulderDash.views;

import cm.uhc.BoulderDash.controllers.LevelEditorKeyController;
import cm.uhc.BoulderDash.models.LevelModel;
import cm.uhc.BoulderDash.views.GroundView;
import cm.uhc.BoulderDash.views.LevelEditorView;

/**
 * LevelEditorFieldView
 *
 * Game field view for the level editor.
 *
 * @author Valerian Saliou <valerian@valeriansaliou.name>
 * @since 2015-06-21
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
