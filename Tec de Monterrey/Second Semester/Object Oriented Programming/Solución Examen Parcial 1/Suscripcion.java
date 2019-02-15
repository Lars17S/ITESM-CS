public class Suscripcion {
  private double precio;
  private String correo;
  private String nombreTitular;
  private Curso[] cursos;

  public Suscriptor(Curso[] cursos) {
    this.cursos = cursos;
  }
  public void setPrecio(double precio) {
    this.precio = precio;
  }
  public double getPrecio() {
    return precio;
  }
  public void setCorreo(String correo) {
    this.correo = correo;
  }
  public String getCorreo() {
    return correo;
  }
  public void setNombreTitular(String nombreTitular) {
    this.nombreTitular = nombreTitular;
  }
  public String getNombreTitular() {
    return nombreTitular;
  }
  public void addCurso(Curso curso; index int) {
    curso[index] = curso;
  }
}
