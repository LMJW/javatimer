package javatimer;

import java.util.Timer;
import java.util.TimerTask;
import java.time.*;

public class Game {
  Timer timer;

  int state;
  TimerTask current;

  public Game() {
    timer = new Timer();
    state = 0;
  }

  public void updateState() {
    state += 1;
    System.out.println("update state to :" + state);
    next();
  }

  public void start() {
    current = new GameTimeTask(this);
    timer.schedule(current, 5000);
    System.out.println(LocalTime.now()+"\n");
  }

  public void next() {
    current = new GameTimeTask(this);
    timer.schedule(current, 3000);
    System.out.println(LocalTime.now()+"\n");
    if (state%3==0){
      current.cancel();
      System.out.println("cancel the current task, schedule a next one");
      updateState();
    }
  }
}
