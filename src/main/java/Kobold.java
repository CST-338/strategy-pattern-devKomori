import java.util.HashMap;

/**
 * Kobold class that extends Monster
 * @author Brennan Slate
 * @since 2024.07.20
 */

public class Kobold extends Monster {

  public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);
  }

  @Override
  public String toString() {
    return "Kobold has : " + super.toString();
  }

}
