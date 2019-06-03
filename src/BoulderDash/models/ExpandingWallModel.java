package BoulderDash.models;

import BoulderDash.models.DisplayableElementModel;


/**
 * ExpandingWallModel
 *
 * Represents a ExpandingWall in the game.
 *
 */
public class ExpandingWallModel extends DisplayableElementModel {
	private static String spriteName;
	private static boolean destructible;
	private static boolean canMove;
	private static boolean impactExplosive;
	private static boolean animate;
	private static int priority;
	private static boolean falling;
	private static String collideSound;
	
	/*
    * Static dataset
    * Specifies the physical parameters of the object
    */
	static {
		spriteName = "expandingwall";
		destructible = false;
		canMove = false;
		impactExplosive = false;
		animate = false;
		priority = 10;
		falling = false;
		collideSound = null;
	}
	
    /**
     * Class constructor
     */
	public ExpandingWallModel() {
		super(destructible, canMove, spriteName, priority, impactExplosive, animate, falling, collideSound);
		this.loadSprite(spriteName);
	}
}