class Height {
  private String name;
  private int age;
  private double height;

  public void setName(String inputName) {
    name = inputName;
  }

  public void setAge(int inputAge) {
    age = inputAge;
  }

  public void setHeight(double inputHeight) {
    height = inputHeight;
  }

  public double getRecommendedWeight() {
    return (height - 100 + age / 10) * 0.90;
  }
}
