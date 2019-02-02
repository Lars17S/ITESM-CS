// We created two files (BycicleRegistration.java and Bicycle.java)

class BicycleRegistration {
  public static void main (String args[]) {
    Bicycle bike1, bike2;
    String owner1, owner2;

    bike1 = new Bicycle(); // Create and assign values to bike1
    bike1.setOwnerName("Adam Smith");

    bike2 = new Bicycle(); // Create and assing values to bike2
    bike2.setOwnerName("Ben Jones");

    //Output the information
    owner1 = bike1.getOwnerName();
    owner2 = bike2.getOwnerName();

    System.out.printf("%s owns a bicycle\n", owner1);
    System.out.printf("%s also owns a bicycle\n", owner2);
  }
}
