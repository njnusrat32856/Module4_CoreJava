
package game;

public class Sports {
    private String play;

    public Sports() {
    }

    public Sports(String play) {
        this.play = play;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }
    public void play() {
        System.out.println("Playing a generic sports game.");
    }
    
}
