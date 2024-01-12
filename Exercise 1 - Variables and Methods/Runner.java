public class Runner {

  //To Run and Test Your Changes, Open a Command Window and Make Sure Java is Installed
  //Issue Command: javac Runner.java (This Will Compile the Java To a Runnable File)
  //Issue Command: java -ea Runner (This Will Run the Runnable File with Assertions Enabled)
  //Note: The static keyword is used to say that a method doesn't belong to a class instance.

  public static void main(String[] args) {
    // 1. Create two integer variables called num1 and num2 respectively. Initialize Their Values to 0.

    // 2. Change the value of num1 to 5 and the value of num2 to the value of two times num1.

    // 3. Call the method addInts() with x and y to get their sum. Store it in a variable called sum.

    assert sum == 15 : "Wrong Value for num1 and num2!";

    // 4. Write a method below called isItEven() that takes one integer parameter called number.
    // In the method, return the boolean true if the number is even and false if the number is odd using conditional structures.
    // The method will be called within the assertion.
    assert isItEven(sum) == false : "Sum Should Not Be Even!";

    // 5. Initialize two double variables, one called tax and the other called price.
    // tax should be set to the decimal value of 7% (PA Sales Tax).
    // price should be set to the decimal value of price of an Azure Exam ($99.99).

    // 6. Create a method that takes the tax and price and calculates what the customer should pay (including tax).
    // This method should be called costCalculator and should take the tax as the first parameter and price as the second parameter.
    // Store the result in a double called totalCost.

    assert totalCost == 106.9893 : "Wrong Total Price for Azure Exam!";

    System.out.println("Exercise 1 Success - Congrats!");
  }

  public static int addInts(int int1, int int2) {
    return int1 + int2;
  }

  // Method Implementation for Item 4


  // Method Implementation for Item 5


}
