public class Runner {

  //To Run and Test Your Changes, Open a Command Window and Make Sure Java is Installed
  //Issue Command: javac Runner.java (This Will Compile the Java To a Runnable File)
  //Issue Command: java Runner (This Will Run the Runnable File)

  public static void main(String[] args) {
    Bike bicycle = new Bike();

    // 7. Use the Setters to Set Number of Wheels to 2, Color to "Blue", and hasMotor to false
    bicycle.setNumberOfWheels(2);
    bicycle.setColor("Blue");
    bicycle.setHasMotor(false);

    // 8. Create another object with type Bike and variable named motorcycle. Use the constructor with all arguments.
    Bike motorcycle = new Bike(2, "Blue", false);

    // 9. Use System.out.println() to call the .toString() method of each object.
    System.out.println(bicycle.toString());
    System.out.println(motorcycle.toString());

    // Verification Code - Do Not Modify
    assert bicycle.getNumberOfWheels() == 2;
    assert bicycle.getColor() == "Blue";
    assert bicycle.getHasMotor() == false;
    assert bicycle != motorcycle;

    System.out.println("Success for Exercise 1!");
  }

}
