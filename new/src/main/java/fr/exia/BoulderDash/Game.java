package fr.exia.BoulderDash;

import javax.swing.SwingUtilities;

import fr.exia.BoulderDash.controller.NavigationBetweenViewController;



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
