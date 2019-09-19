public abstract class Artista implements AccionesArtista {
  private String nombre;
  
  public Artista(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void playSong(String song) {
    System.out.println(getNombre() + " está tocando " + song);
  }

  public void separateGroup() {
    System.out.println(getNombre() + " se ha separado.");
  }


  // Abstract method created into abstract class Artista
  // If the subclases will use the methods in different way, it is better idea declare it as abstract.
  public abstract void createSong();
  /* Wherever there is a abstract methods relationated with classes and subclases, it needs to be implemented in some place.
  public abstract void playSong(String song);
  */
}
