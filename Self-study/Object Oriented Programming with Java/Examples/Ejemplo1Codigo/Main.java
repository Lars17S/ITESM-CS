public class Main {
  public static void main(String args[]) {
    System.out.println("Hola a todos");
    Usuario u = new Usuario();
    // Usuario u = new Usuario("Andres", "andxt@itesm.mx", "123456");

    System.out.println("Usuario: " + u.getNombre() + "\nCorreo: " + u.getCorreo() + "\nPassword: " + u.getPassword());
  }


}
