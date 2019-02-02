class Temperature {
  // Data member
  private double temperature;
  private String typeTemperature;

  //Constructor; Initializes the data member
  public void Temperature() {
    temperature = 0;
    typeTemperature = "Unknown";
  }

  //Instance method to input a value to inputTemperature
  public void inputTemperature(double inputTemperature) {
    temperature = inputTemperature;
  }

  //Instance method to set Fahrenheit
  public void setFahrenheit() {
    typeTemperature = "Fahrenheit";
  }

  //Instance method to set Celsius
  public void setCelsius() {
    typeTemperature = "Celsius";
  }

  //Instance method to get the unit
  public String getTypeTemperature() {
    return typeTemperature;
  }

  //Instance method to get the value
  public double getValueTemperature() {
    return temperature;
  }
  //Instance method to convert from Celsius to Fahrenheit
  public void toFahrenheit() {
    temperature = (temperature * 9)/5 + 32;
  }

  //Instance method to convert from Fahrenheit to Celsius
  public void toCelsius() {
    temperature = ((temperature - 32) * 5)/9;
  }
}
