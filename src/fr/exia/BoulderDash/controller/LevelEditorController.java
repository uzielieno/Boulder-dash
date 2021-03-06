package fr.exia.BoulderDash.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import fr.exia.BoulderDash.contract.LevelConstraintNotRespectedException;
import fr.exia.BoulderDash.controller.NavigationBetweenViewController;
import fr.exia.BoulderDash.entity.LevelRemoveHelper;
import fr.exia.BoulderDash.entity.LevelSaveHelper;
import fr.exia.BoulderDash.model.LevelModel;
import fr.exia.BoulderDash.view.HelpView;
import fr.exia.BoulderDash.view.LevelEditorView;

/**
 * LevelEditorController
 *
 * Manages the level editor controller.
 *
 */
public class LevelEditorController implements ActionListener {
    private LevelModel levelModel;
	private LevelEditorView levelEditorView;
	private NavigationBetweenViewController nav;

    /**
     * Class constructor'
     *
     * @param  levelModel  Level model
     */
    public LevelEditorController(LevelModel levelModel, NavigationBetweenViewController nav) {
        this.levelModel = levelModel;
        this.levelModel.setShowCursor(true);

        this.nav = nav;
        this.nav.getAudioLoadHelper().stopMusic();
        
        this.levelEditorView = new LevelEditorView(this, levelModel, nav);

        // Pre-bind event watcher (hack to fix a Java issue)
        this.levelModel.decrementCursorXPosition();
    }

    /**
     * Handles the 'action performed' event
     *
     * @param  event  Action event
     */
    public void actionPerformed(ActionEvent event) {
        switch(event.getActionCommand()) {
            case "menu":
            	this.levelEditorView.setVisible(false);
            	this.nav.setMenuView();           	
                this.nav.getAudioLoadHelper().startMusic("game");

                break;

            case "save":
                // Check constraints
                try {
                    this.levelModel.checkConstraints();

                    // Save action (direct save)
                    String levelId = this.levelEditorView.getSelectedLevel();
                    LevelSaveHelper levelSave;

                    if(levelId == null || levelId.isEmpty()) {
                        // Create a new level
                        levelSave = new LevelSaveHelper(levelModel.getGroundLevelModel());
                    } else {
                        // Overwrite existing level
                        levelSave = new LevelSaveHelper(levelId, levelModel.getGroundLevelModel());
                    }

                    JFrame frameDialog = new JFrame("Info");
                    JOptionPane.showMessageDialog(frameDialog, "Level saved");

                    this.levelEditorView.openedLevelChange(levelSave.getLevelId());
                } catch(LevelConstraintNotRespectedException e) {
                    JFrame frameDialog = new JFrame("Error");
                    JOptionPane.showMessageDialog(frameDialog, e.getMessage());
                }

                break;

            case "delete":
                String levelId = this.levelEditorView.getSelectedLevel();
                JFrame frameDialog = new JFrame("Info");

                if(levelId == null || levelId.isEmpty()) {
                    JOptionPane.showMessageDialog(frameDialog, "Level not yet saved, no need to delete it!");
                } else {
                    new LevelRemoveHelper(levelId);
                    JOptionPane.showMessageDialog(frameDialog, "Level deleted!");

                    this.levelEditorView.openedLevelChange(null);
                }
                break;
                
            case "help":
            	new HelpView();
                break;

            case "new":
                this.levelEditorView.openedLevelChange(null);
                break;
        }

        this.getLevelEditorView().getLevelEditorGroundView().grabFocus();
    }

    /**
     * Gets the level editor view
     *
     * @return  Level editor view
     */
	public LevelEditorView getLevelEditorView() {
		return levelEditorView;
	}

    /**
     * Gets level model
     *
     * @return  Level model
     */
    public LevelModel getLevelModel() {
        return this.levelModel;
    }

    /**
     * Sets the level editor view
     *
     * @param  levelEditorView  Level editor view
     */
	public void setLevelEditorView(LevelEditorView levelEditorView) {
		this.levelEditorView = levelEditorView;
	}
    
    
}