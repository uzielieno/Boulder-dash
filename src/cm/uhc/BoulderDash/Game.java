package cm.uhc.BoulderDash;

import javax.swing.*;

import cm.uhc.BoulderDash.controllers.NavigationBetweenViewController;



public class Game {
    /**
     * Class constructor
     *
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NavigationBetweenViewController();
            }
        });
    }
}
