public class Bike {
  private int numberOfWheels;
  private String color;
  private boolean hasMotor;

  // 1. Create a No Argument Constructor That Sets Number Of Wheels to -1, Color to null, and Has Motor to false
  public Bike() {
    numberOfWheels = -1;
    color = null;
    hasMotor = false;
  }

  // 2. Create a Constructor That Sets Each Property to the Parameters
  public Bike(int numberOfWheels, String color, boolean hasMotor) {
    this.numberOfWheels = numberOfWheels;
    this.color = color;
    this.hasMotor = hasMotor;
  }

  // 3. Accept One Parameter - an int named numberOfWheels - and call the second constructor with (numberOfWheels, null, false)
  public Bike(int numberOfWheels) {
    this(numberOfWheels, null, false);
  }

  // 4. Write Setters For Each of the Properties, Accepting a Parameter of the Correct Type
  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setHasMotor(boolean hasMotor) {
    this.hasMotor = hasMotor;
  }

  // 5. Write Getters for Each Property, Returning the Value
  public int getNumberOfWheels() {
    return this.numberOfWheels;
  }

  public String getColor() {
    return this.color;
  }

  public boolean getHasMotor() {
    return this.hasMotor;
  }

  public String toString() {
    return "============\nNumber of Wheels: " + numberOfWheels + "\nColor: " + color + "\nHas Motor?: " + hasMotor + "\n============";
  }
}
