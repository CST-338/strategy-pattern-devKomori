package Monsters;

import Abilities.Attack;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * @author Brennan Slate
 * @since 2024.07.21
 */

public abstract class Monster {
  private Integer hp = 10;
  private Integer xp;
  private Integer maxHP;
  private HashMap<String, Integer> items;

  Integer agility = 10;
  Integer defense = 10;
  Integer strength = 10;
  Attack attack;

  public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    this.maxHP = maxHP;
    hp = this.maxHP;
    this.xp = xp;
    this.items = items;
  }

  Integer getAttribute(Integer min, Integer max) {
    Random rand = new Random();
    if(min > max){
      Integer temp = min;
      min = max;
      max = temp;
    }
    return rand.nextInt(max - min) + min;
  }

  boolean takeDamage(Integer damage) {
    if (damage > 0) {
      this.hp -= damage;
      System.out.println("The creature was hit for " + damage + " damage");
      System.out.println(this);
    }
    if (this.hp <= 0) {
      System.out.println("Oh no! the creature has perished");
      return false;
    }
    return true;
  }

  public Integer attackTarget(Monster target){
    Integer dmgResult = this.attack.attack(target);
    target.takeDamage(dmgResult);
    return dmgResult;
  }


  public Integer getAgility() {
    return agility;
  }

  public Integer getDefense() {
    return defense;
  }

  public Integer getStrength() {
    return strength;
  }

  public Integer getHp() {
    return hp;
  }

  public void setHp(Integer hp) {
    this.hp = hp;
  }

  public Integer getXp() {
    return xp;
  }

  public Integer getMaxHP() {
    return maxHP;
  }

  public HashMap<String, Integer> getItems() {
    return items;
  }

  public void setItems(HashMap<String, Integer> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Monster monster = (Monster) o;
    return Objects.equals(getHp(), monster.getHp()) && Objects.equals(getXp(),
        monster.getXp()) && Objects.equals(getMaxHP(), monster.getMaxHP())
        && Objects.equals(getItems(), monster.getItems()) && Objects.equals(agility,
        monster.agility) && Objects.equals(defense, monster.defense) && Objects.equals(strength,
        monster.strength) && Objects.equals(attack, monster.attack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getHp(), getXp(), getMaxHP(), getItems(), agility, defense, strength, attack);
  }


  @Override
  public String toString() {
    if (hp <= 0) { // Prevents negative HP from being displayed
      return "hp=0/" + maxHP;
    }
    return "hp=" + hp + "/" + maxHP;
  }

}
