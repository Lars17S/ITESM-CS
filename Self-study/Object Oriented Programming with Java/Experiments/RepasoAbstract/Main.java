public class Main {
  public static void main (String args[]) {
    Artista jimmyPage = new ArtistaRock("Jimmy Page");
    // Artista artistaGenerico = new Artista("Dios"); - Artista is abstract; cannot be instantiated
    Artista ericClapton = new ArtistaRock("Eric Clapton");
    //The son class can use the father's method
    jimmyPage.playSong("Stairway to Heaven");
    ericClapton.playSong("Cocaine");

    jimmyPage.separateGroup();
  }
}
