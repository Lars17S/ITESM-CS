public class Profesor {
  private String nombre;
  private String profesion;

  public Profesor(String nombre, String profesion) {
    this.nombre = nombre;
    this.profesion = profesion;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setProfesion(String profesion) {
    this.profesion = profesion;
  }
  public String getNombre() {
    return nombre;
  }
  public String getProfesion() {
    return profesion;
  }
}
