class Circle {
private double innerRadius;
private double outerRadius;

  public void setInnerRadius(double inputRadius) {
    innerRadius = inputRadius;
  }

  public void setOuterRadius(double inputRadius) {
    outerRadius = inputRadius;
  }

  public double getShadedArea() {
    return Math.PI * (Math.pow(outerRadius, 2) - Math.pow(innerRadius, 2));
  }

  public double getCircumference() {
    return 2 * Math.PI * (outerRadius + innerRadius);
  }
}
