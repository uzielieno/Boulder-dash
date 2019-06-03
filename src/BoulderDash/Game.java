package BoulderDash;

import javax.swing.*;

import BoulderDash.controllers.NavigationBetweenViewController;



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
