import java.util.List;

public class Game {
    List<Player> list;

    public Game() {
        System.out.println("Game()");
    }

    public void game(){
        for (Player p : list) {
            p.play();
        }
    }

    public void setList(List<Player> list) {
        this.list = list;
    }
}
