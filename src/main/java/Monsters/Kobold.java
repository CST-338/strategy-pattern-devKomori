package Monsters;

import Abilities.MeleeAttack;
import Abilities.RangedAttack;
import java.util.HashMap;

/**
 * Monsters.Kobold class that extends Monsters.Monster
 * @author Brennan Slate
 * @since 2024.07.20
 */

public class Kobold extends Monster {

  public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);

    Integer maxStr = 15;
    Integer maxDef = 6;
    Integer maxAgi = 3;

    attack = new RangedAttack(this);
    strength = super.getAttribute(strength,maxStr);
    defense = super.getAttribute(defense,maxDef);
    agility = super.getAttribute(agility,maxAgi);

  }

  @Override
  public String toString() {
    return "Monsters.Kobold has : " + super.toString();
  }

}

