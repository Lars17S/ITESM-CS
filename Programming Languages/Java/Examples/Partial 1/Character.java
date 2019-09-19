public class Character {
    // Parameters
    private String name;
    private int health;
    private int level;
    private int energy;
    private int attack;
    private int defense;

    //Composition structure, the constructor initializes all the parameters
    public Character (String name, int health, int level, int energy, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.energy = energy;
        this.attack = attack;
        this.defense = defense;
    }
    // All the get and set methods
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getHealth() {
      return health;
    }
    public void setHealth(int health) {
      this.health = health;
    }
    public int getLevel() {
      return level;
    }
    public void setLevel(int level) {
      this.level = level;
    }
    public int getEnergy() {
      return energy;
    }
    public void setEnergy(int energy) {
      this.energy = energy;
    }
    public int getAttack() {
      return attack;
    }
    public void setAttack(int attack) {
      this.attack = attack;
    }
    public int getDefense() {
      return defense;
    }
    public void setDefense(int defense) {
      this.defense = defense;
    }

    public String toString() {
      return "Character: " + name + " | HP: " + health + " | Level: " + level +
      " | Energy: " + energy + " | Attack: " + attack + " | Defense: " + defense;
    }

    public void attackToEnemy(Character enemy) {
      enemy.setHealth(enemy.getHealth() - (attack - enemy.getDefense()));
    }



}
