package javatimer;

import java.util.TimerTask;

public class GameTimeTask extends TimerTask {
  Game game;

  public GameTimeTask(Game game) {
    this.game = game;
  }

  public void run() {
    game.updateState();
  }
}
