public class MeleeAttack {

  Monster attacker;

  public MeleeAttack(Monster attacker) {
    this.attacker = attacker;
  }

  public Integer attack(Monster target) {
    String message = attacker + " uses a melee attack on " + target;
    System.out.println(message);
    return null;
  }

}
