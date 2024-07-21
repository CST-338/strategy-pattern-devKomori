import java.util.HashMap;

/**
 * Imp class that extends Monster
 * @author Brennan Slate
 * @since 2024.07.20

 */

public class Imp extends Monster {

  public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);
  }

  @Override
  public String toString() {
    return "Imp has : " + super.toString();
  }

}
