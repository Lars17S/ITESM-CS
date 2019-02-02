import java.util.Scanner;

class Temperature_Tool {
    public static void main (String args[]) {
      Scanner scanner = new Scanner(System.in);

      double inputTemp;
      char inputType;
      String convert;
      Temperature temp_object = new Temperature();

      System.out.println("Set the unit of temperature. Insert \"F\" to select Fahrenheit or \"C\" to select Celsius");
      inputType = scanner.next().charAt(0);
      switch(inputType) {
        case 'F': temp_object.setFahrenheit(); break;
        case 'C': temp_object.setCelsius(); break;
        default: break;
      }

      System.out.print("Enter the value of temperature: ");
      inputTemp = scanner.nextDouble();
      temp_object.inputTemperature(inputTemp);

      scanner.nextLine();
      System.out.println("Do you want to convert Fahrenheit to Celsius \"FC\" or Celsius to Fahrenheit \"CF\"?");
      convert = scanner.nextLine();
      switch(convert) {
        case "FC":
          temp_object.toCelsius();
          temp_object.setCelsius();
          break;
        case "CF":
          temp_object.toFahrenheit();
          temp_object.setFahrenheit();
          break;
        default: break;
      }

      System.out.printf("Temperature is: %f %s", temp_object.getValueTemperature(), temp_object.getTypeTemperature());
    }
}
