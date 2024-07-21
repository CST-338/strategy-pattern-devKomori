package Monsters;

import Abilities.MeleeAttack;
import java.util.HashMap;

/**
 * Monsters.Imp class that extends Monsters.Monster
 * @author Brennan Slate
 * @since 2024.07.20

 */

public class Imp extends Monster {

  public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);

    Integer maxStr = 15;
    Integer maxDef = 6;
    Integer maxAgi = 3;

    attack = new MeleeAttack(this);
    strength = super.getAttribute(strength,maxStr);
    defense = super.getAttribute(defense,maxDef);
    agility = super.getAttribute(agility,maxAgi);


  }

  @Override
  public String toString() {
    return "Monsters.Imp has : " + super.toString();
  }

}
