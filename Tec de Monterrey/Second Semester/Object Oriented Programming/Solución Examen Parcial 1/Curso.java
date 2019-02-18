public class Curso {
  private Video[] videos;
  private Profesor profesor;

  public Curso(Profesor profesor) {
    this.profesor = profesor;
    videos = new Video[10];
  }
  public void addVideo(Video video; int index) {
    videos[index]=video;
  }

  public Video[] getVideos() {
    return videos;
  }

  public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
  }

  public Profesor getProfesor() {
    return profesor;
  }
  public String toString() {
    String resultado = "[" + profesor.getNombre();
    for(int i = 0; i < videos.length; ++i) {
      if (videos[i] != null)
        resultado = resultado + " Video: " + videos[i].getUrl() + ", ";
    }
    resultado = resultado + "]";
  }
}
