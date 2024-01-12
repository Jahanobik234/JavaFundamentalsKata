public class Bike {
  private int numberOfWheels;
  private String color;
  private boolean hasMotor;

  // 1. Create a No Argument Constructor That Sets Number Of Wheels to -1, Color to null, and Has Motor to false
  public Bike() {
    
  }

  // 2. Create a Constructor That Sets Each Property to the Parameters
  public Bike(int numberOfWheels, String color, boolean hasMotor) {
    
  }

  // 3. Accept One Parameter - an int named numberOfWheels - and call the second constructor with (numberOfWheels, null, false)
  public Bike(int numberOfWheels) {

  }

  // 4. Write Setters For Each of the Properties, Accepting a Parameter of the Correct Type
  public void setNumberOfWheels(int numberOfWheels)...


  // 5. Write Getters for Each Property, Returning the Value
  public int getNumberOfWheels()...

  public String toString() {
    return "============\nNumber of Wheels: " + numberOfWheels + "\nColor: " + color + "\nHas Motor?: " + hasMotor + "\n============";
  }
}
