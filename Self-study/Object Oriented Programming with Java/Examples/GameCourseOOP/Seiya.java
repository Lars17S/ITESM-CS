public class Seiya extends BronzeKnight {

  public Seiya() {
    super("Seiya", 100, 100, 15, 4, 20);
    Hability[] habilities = new Hability[3];
    habilities[0] = new Hability("Meteoro Pegaso", 20);
    habilities[1] = new Hability("Brave of Soldiers", 10);
    habilities[2] = new Hability("Special attack", 25);
    super.setHabilities(habilities);
  }
}
