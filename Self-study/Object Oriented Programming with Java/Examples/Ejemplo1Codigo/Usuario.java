public class Usuario {
  private String nombre;
  private String correo;
  private String password;

  public Usuario() { //Un
    nombre = "Sin nombre";
    correo = "Sin correo";
    password = "Sin password";
  }

  public Usuario(String nombre, String correo, String password) {
    this.nombre = nombre;
    this.correo = correo;
    this.password = password;
  }
  public void setNombre (String nombre) {
    this.nombre = nombre; //La variable nombre de la clase asignada al nombre del metodo con this.
  }

  public String getNombre() {
    return nombre;
  }

  public void setCorreo (String correo) {
    this.correo = correo; //La variable nombre de la clase asignada al nombre del metodo con this.
  }

  public String getCorreo() {
    return correo;
  }

  public void setPassword (String password) {
    this.password = password; //La variable nombre de la clase asignada al nombre del metodo con this.
  }

  public String getPassword() {
    return password;
  }
}
