import java.util.Scanner;

public class Main {

  // This function adds two numbers
  public static double add(double x, double y) {
    return x + y;
  }

  // This function subtracts two numbers
  public static double subtract(double x, double y) {
    return x - y;
  }

  // This function multiplies two numbers
  public static double multiply(double x, double y) {
    return x * y;
  }

  // This function divides two numbers
  public static double divide(double x, double y) {
    return x / y;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Select operation.");
    System.out.println("1.Add");
    System.out.println("2.Subtract");
    System.out.println("3.Multiply");
    System.out.println("4.Divide");

    while (true) {
      // Take input from the user
      System.out.print("Enter choice(1/2/3/4): ");
      String choice = scanner.next();

      // Check if choice is one of the four options
      if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
        try {
          System.out.print("Enter first number: ");
          double num1 = Double.parseDouble(scanner.next());

          System.out.print("Enter second number: ");
          double num2 = Double.parseDouble(scanner.next());

          switch (choice) {
            case "1":
              System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
              break;
            case "2":
              System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
              break;
            case "3":
              System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
              break;
            case "4":
              System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
              break;
          }
        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please enter a number.");
          continue;
        }

        // Check if user wants another calculation
        System.out.print("Let's do next calculation? (yes/no): ");
        String nextCalculation = scanner.next();
        if (nextCalculation.equalsIgnoreCase("no")) {
          break;
        }
      } else {
        System.out.println("Invalid Input");
      }
    }
    scanner.close();
  }
}
