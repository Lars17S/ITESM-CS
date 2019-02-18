public class Main {
  public static void main(String args[]) {
    Profesor p = new Profesor("Andres", "ITC");
    Curso c = new Curso(p);
    System.out.println(c.toString());
  }
}
