
package testgame;

import game.Basketball;
import game.Football;
import game.Rugby;
import game.Sports;


public class TestGame {

    public static void main(String[] args) {
        Sports genericSports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        genericSports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
    
}
