public class BronzeKnight extends Character {
  private Hability[] habilities;
  private Object[] inventory;

  public BronzeKnight (String name, int health, int energy, int attack, int defense) {
    super(name, health, energy, attack, defense);
    this.inventory = new Object[3];
  }

  public Hability[] getHabilities() {
    return habilities;
  }

  public void setHabilities(Hability[] habilities) {
    this.habilities = habilities;
  }

  public Object[] getInventory() {
    return inventory;
  }

  public void addItemToInventory(Object item, int index) {
    this.inventory[index] = item;
  }

  public void removeItemFromInventory(int index) {
    this.inventory[index] = null;
  }

  public String printInventory() {
    String result = "Inventory: [";
    for (int i = 0; i < inventory.length; ++i) {
      if (inventory[i] != null) {
        result = result + "Object: " + inventory[i].getNombre() + " score: "
        + inventory[i].getScore() + ", ";
      }
      else {
        result = result + " Empty, ";
      }
    }
    result = result + "]";
    return result;
  }

  public String printHabilities() {
    String result = "Habilities: [";
    for (int i = 0; i < habilities.length; ++i) {
      result = result + " Hability: " + habilities[i].getNombre() + " score: " +
      habilities[i].getSpecialScore() + ", ";
    }
    result = result + "]";
    return result;
  }
}
