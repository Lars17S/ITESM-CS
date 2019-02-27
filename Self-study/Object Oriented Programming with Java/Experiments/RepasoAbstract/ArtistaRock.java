public class ArtistaRock extends Artista {
  public ArtistaRock(String nombre) {
    super(nombre);
  }

  //ArtistaRock is not a class abstract, so it needs to implement the methods inside interface AccionesArtista

  /* It uses the method more in the class most specified
  public void playSong(String song) {
    System.out.println(getNombre() + " está tocando " + song);
  } */

  public void createSong() {
    System.out.println(getNombre() + " está preparando una nueva canción");
  }
}
