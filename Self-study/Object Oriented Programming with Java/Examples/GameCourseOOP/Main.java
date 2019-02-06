public class Main {
  public static void main (String args[]) {
    Seiya seiya = new Seiya();
    GoldKnight goldKnight = new GoldKnight("Mascara de la muerte",50,200,5,3);
    Object o1 = new Object("Diamond Sword", 100);
    Object o2 = new Object("Shield", 100);
    seiya.addItemToInventory(o1, 0);
    seiya.addItemToInventory(o2, 2);
    System.out.println(seiya.toString());
    System.out.println(goldKnight.toString());
    seiya.attackToEnemy(goldKnight);
    goldKnight.attackToEnemy(seiya);
    System.out.println(seiya.toString());
    System.out.println(goldKnight.toString());
    System.out.println(seiya.printInventory());
    System.out.println(seiya.printHabilities());
  }
}
