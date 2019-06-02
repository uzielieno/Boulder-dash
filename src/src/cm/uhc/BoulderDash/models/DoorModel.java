package cm.uhc.BoulderDash.models;

import cm.uhc.BoulderDash.models.DisplayableElementModel;


/**
 * DoorModel
 *
 * Represents escape door.
 */
public class DoorModel extends DisplayableElementModel {
	private static String spriteName;
	private static boolean isDestructible;
	private static boolean canMove;
	private static boolean impactExplosive;
	private static boolean animate;
	private static int priority;
	private static boolean falling;
	private static String collideSound;

    /**
     * Static dataset
     * Specifies the physical parameters of the object
     */
	static {
		spriteName = "door";
		isDestructible = false;
		canMove = false;
		impactExplosive = false;
		animate = false;
		priority = 0;
		falling = false;
		collideSound = null;
	}

    /**
     * Class constructor
     */
	public DoorModel() {
		super(isDestructible, canMove, spriteName, priority, impactExplosive, animate, falling, collideSound);

		this.loadSprite(spriteName);
	}
}
